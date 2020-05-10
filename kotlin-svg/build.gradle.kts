plugins {
    kotlin("multiplatform")
    `publishing-conventions`
}

kotlin {
    jvm()
    js { browser {} }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))

                api(kotlinx("html", "common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))

                api(kotlinx("html", "jvm"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))

                api(kotlinx("html", "js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
