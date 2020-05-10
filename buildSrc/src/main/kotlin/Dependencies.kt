import org.gradle.api.Project

fun Project.wrappers(projectName: String) = "org.jetbrains:kotlin-$projectName:${wrappersVersion(projectName)}"

fun Project.wrappers(projectName: String, target: String? = null) = "org.jetbrains:kotlin-$projectName${target?.let { "-$it" } ?: ""}:${wrappersVersion(projectName)}"

fun Project.kotlinx(projectName: String, target: String) = "org.jetbrains.kotlinx:kotlinx-$projectName-$target:${version("kotlinx.$projectName")}"

private fun Project.wrappersVersion(projectName: String) =
    "${version(projectName)}-${version("wrappers")}-kotlin-${version("kotlin")}"
