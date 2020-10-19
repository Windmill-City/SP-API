import org.ajoberstar.grgit.Grgit
import java.nio.file.Files
import java.nio.file.Path

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
val groupName = "sp-api"
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

task("gen-All") {
    group = groupName
}

task("processModel") {
    group = groupName
    inputs.dir(models)
    dependsOn("initModel")
    doLast {
        var i = 0
        Files.walk(models).forEach {
            val matchResult = modelRegex.matchEntire(it.fileName.toString())
            if (matchResult != null) {
                i++
                val taskName = matchResult.groups[1]!!.value
                project.tasks.register("gen-${taskName}") {
                    group = groupName
                    inputs.file(it)
                    tasks["gen-All"].dependsOn(taskName)
                    doLast {
                        println(it)
                    }
                }
            }
        }
        println("Generated $i tasks")
    }
}