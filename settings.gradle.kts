rootProject.name = "kotlin-svg"

pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin.version"] as String

            kotlin("multiplatform") version kotlinVersion
            kotlin("jvm") version kotlinVersion
            kotlin("js") version kotlinVersion
        }
    }

    repositories {
        jcenter()
    }
}

include(":kotlin-svg")
