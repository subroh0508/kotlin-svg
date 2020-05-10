import org.gradle.api.Project

internal val Project.isKotlinMultiplatformProject: Boolean
    get() = plugins.hasPlugin("org.jetbrains.kotlin.multiplatform")

internal val Project.isKotlinJsProject: Boolean
    get() = plugins.hasPlugin("org.jetbrains.kotlin.js")

internal fun Project.prop(propertyName: String): String = property(propertyName) as String

internal fun Project.version(target: String): String = prop("${target}.version")

fun Project.npmVersion(target: String): String = "^${version(target)}"
