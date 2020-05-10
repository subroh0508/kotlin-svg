import java.util.*

plugins {
    id("com.jfrog.bintray")
    id("bintray-metadata")
    `maven-publish`
}

if (isKotlinJsProject) {
    tasks.named<Zip>("JsJar") {
        val dependencyJson = temporaryDir.resolve("package.json")
        from(dependencyJson)
    }
}

bintray {
    user = localProperties["bintray.user"] as String
    key = localProperties["bintray.key"] as String
    publish = false
    pkg.run {
        repo = "maven"
        name = project.name
        setLicenses("MIT")
        vcsUrl = "https://github.com/subroh0508/kotlin-svg.git"
        version.name = project.version.toString()
    }

    when {
        isKotlinMultiplatformProject ->
            setPublications("kotlinMultiplatform", "metadata", "js", "jvm")

        isKotlinJsProject ->
            setPublications("kotlin")
    }
}

publishing.publications {
    when {
        isKotlinMultiplatformProject ->
            withType<MavenPublication>().configureEach {
                val artifactName = when (name) {
                    "kotlinMultiplatform" -> ""
                    else -> "-$name"
                }

                groupId = project.group.toString()
                artifactId = "${project.name}$artifactName"
                version = project.version.toString()
            }

        isKotlinJsProject ->
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])
                groupId = project.group.toString()
                artifactId = "${rootProject.name}-${project.name}"
                version = project.version.toString()

                artifact(tasks.getByName<Zip>("JsSourcesJar"))
            }
    }
}
