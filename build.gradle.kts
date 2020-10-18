import org.ajoberstar.grgit.Grgit
import java.nio.file.Files.exists
import java.nio.file.Files.walk
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

val repoDir: Path = get("Repo-Models")
val groupName = "gen sp-api"

task("cloneModels") {
    group = groupName
    doLast{
        if(exists(repoDir))
            walk(repoDir).forEach { i -> delete(i) }
        val repo = Grgit.clone{
            dir=repoDir
            uri="https://github.com/amzn/selling-partner-api-models.git"
        }
        repo.close()
    }
}
