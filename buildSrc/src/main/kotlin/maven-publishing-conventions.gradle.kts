import java.util.*

plugins {
    id("com.jfrog.bintray")
    id("bintray-metadata")
    `maven-publish`
}

private val localProperties = Properties().apply {
    file("../local.properties").inputStream().use { load(it) }
}

private val bintrayUser = localProperties["bintray.user"] as String
private val bintrayKey = localProperties["bintray.key"] as String

if (isKotlinJsProject) {
    tasks.named<Zip>("JsJar") {
        val dependencyJson = temporaryDir.resolve("package.json")
        from(dependencyJson)
    }
}

bintray {
    user = bintrayUser
    key = bintrayKey
    publish = false
    pkg.run {
        repo = "maven"
        name = project.name
        setLicenses("MIT")
        vcsUrl = "https://github.com/subroh0508/kotlin-svg.git"
        version.name = Packages.version
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
                version = Packages.version
            }

        isKotlinJsProject ->
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])
                groupId = project.group.toString()
                artifactId = "${rootProject.name}-${project.name}"
                version = Packages.version

                artifact(tasks.getByName<Zip>("JsSourcesJar"))
            }
    }
}
