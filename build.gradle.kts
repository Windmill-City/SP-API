import org.ajoberstar.grgit.Grgit
import org.eclipse.jgit.submodule.SubmoduleStatusType.UNINITIALIZED
import java.nio.file.Path
import java.nio.file.Paths.get

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
    swaggerCodegen ("io.swagger:swagger-codegen-cli:2.4.+")
}

val urlModel = "https://github.com/amzn/selling-partner-api-models.git"
val dirModel: Path = get("selling-partner-api-models")
val groupName = "sp-api"

task("initModel") {
    group = groupName
    doLast{
        val grgit = Grgit.open{ dir = projectDir }
        val jgit = grgit.repository.jgit
        val status = jgit.submoduleStatus().call()[dirModel.toString()]
        status ?: throw Exception("Submodule -> Model not exist")
        if(status.type == UNINITIALIZED) {
            logger.info("Initialing submodules")
            jgit.submoduleInit().call().forEach(logger::info)
        }
        logger.info("Updating submodules")
        jgit.submoduleUpdate().call().forEach(logger::info)
        grgit.close()
        //Checkout main
        val repo = Grgit.open { currentDir=projectDir.toPath().resolve(dirModel) }
        repo.checkout{ branch="main" }
        repo.close()
    }
}

task("updateModel"){
    group = groupName
    doLast{
        val repo = Grgit.open { currentDir=projectDir.toPath().resolve(dirModel) }
        repo.pull()
        repo.close()
        val mainRepo = Grgit.open{ dir = projectDir }
        if (mainRepo.status().Changes().modified.contains(".gitmodules"))
            mainRepo.commit {
                message = "Update Model"
                paths = setOf(".gitmodules")
            }
        mainRepo.close()
    }
}

task("processModel"){
    group=groupName
    doLast{
    }
}

task("genApiCode"){
    group = groupName
}