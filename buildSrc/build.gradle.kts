import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String = props.getProperty("${target}.version")

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:${version("bintray-plugin")}")
    implementation("org.json:json:${version("json")}")
}
