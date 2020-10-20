import org.ajoberstar.grgit.Grgit
import org.hidetake.gradle.swagger.generator.GenerateSwaggerCode
import java.nio.file.Files
import java.nio.file.Files.walk
import java.nio.file.Path
import java.nio.file.StandardCopyOption.REPLACE_EXISTING

plugins{
    id("org.hidetake.swagger.generator") version "2.18.2"
    id("org.ajoberstar.grgit") version "4.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    swaggerCodegen("io.swagger:swagger-codegen-cli:2.4.+")
}

val urlModel = "https://github.com/amzn/selling-partner-api-models.git"
val groupName = "sp-api-codegen"
//Model-Dir
val dirModel: Path = projectDir.toPath().resolve("selling-partner-api-models")
//Client
val clientJava: Path = dirModel.resolve("clients/sellingpartner-api-aa-java")
val clientTemplates: Path = clientJava.resolve("resources/swagger-codegen/templates")
val clientSrc: Path = clientJava.resolve("src")
val clientTest: Path = clientJava.resolve("tst")
//Model
val models: Path = dirModel.resolve("models")
val modelRegex: Regex = Regex("""^([a-zA-Z]+)(?:V0|_[\-0-9]+)?\.json$""")
//Output
val dirOutput: Path = projectDir.toPath().resolve("generated")
//ConfigFile
val pathConfig: Path = projectDir.toPath().resolve("swagger-config.json")

task("initModel") {
    group = groupName
    outputs.dir(dirModel)
    doLast {
        val grgit = Grgit.open { dir = projectDir }
        val jgit = grgit.repository.jgit
        println("Initialing submodules")
        jgit.submoduleInit().call().forEach(logger::info)
        println("Updating submodules")
        jgit.submoduleUpdate().call().forEach(logger::info)
        grgit.close()
        //Checkout main
        val repo = Grgit.open { currentDir = projectDir.toPath().resolve(dirModel) }
        repo.checkout { branch = "main" }
        repo.close()
    }
}

task("updateModel"){
    group = groupName
    dependsOn("initModel")
    doLast {
        val repo = Grgit.open { currentDir = dirModel }
        repo.pull()
        repo.close()
        val mainRepo = Grgit.open { dir = projectDir }
        val status = mainRepo.status()
        if (status.staged.modified.contains(".gitmodules") || status.unstaged.modified.contains(".gitmodules")) {
            println("Committing Model update")
            mainRepo.commit {
                message = "Update Model"
                paths = setOf(".gitmodules")
            }
        }
        println("Already up-to-date")
        mainRepo.close()
    }
}

task("processModel") {
    group = groupName
    if(Files.exists(models)) {
        var i = 0
        walk(models).forEach {
            val matchResult = modelRegex.matchEntire(it.fileName.toString())
            if (matchResult != null) {
                i++
                val taskName = matchResult.groups[1]!!.value
                project.tasks.register("gen-${taskName}", GenerateSwaggerCode::class) {
                    group = groupName
                    //Swagger
                    language = "java"
                    inputFile = it.toFile()
                    outputDir = dirOutput.toFile()
                    wipeOutputDir = false
                    configFile = pathConfig.toFile()
                    templateDir = clientTemplates.toFile()
                }
            }
        }
        println("Generated $i tasks")
    }else println("initModel before generate code")
}

task("gen-LWA"){
    doLast {
        val destSrc = dirOutput.resolve("src/main/java")
        val destTest = dirOutput.resolve("src/test/java")
        copyDir(clientSrc, destSrc)
        copyDir(clientTest, destTest)
    }
}

task("cleanOutput"){
    group = groupName
    doLast {
        val dirDocs = dirOutput.resolve("docs")
        val destSrc = dirOutput.resolve("src/main/java")
        val destTest = dirOutput.resolve("src/test/java")
        cleanDir(dirDocs)
        cleanDir(destSrc)
        cleanDir(destTest)
    }
}

task("gen-All"){
    group = groupName
    setDependsOn(tasks.filter { it.name.startsWith("gen-") && it != this })
    doLast { println("Code generate Done!") }
}

fun copyDir(source: Path, destSrc: Path, copyOption: java.nio.file.StandardCopyOption = REPLACE_EXISTING) {
    walk(source).forEach {
        if (it != source) {
            val relaPath = source.relativize(it)
            val destPath = destSrc.resolve(relaPath)
            if (Files.isDirectory(it)) {
                if (Files.notExists(destPath)) Files.createDirectory(destPath)
            }
            else
                Files.copy(it, destPath, copyOption)
        }
    }
}

fun cleanDir(dirDocs: Path) {
    if (Files.exists(dirDocs)) walk(dirDocs).forEach { if (it != dirDocs) delete(it) }
}