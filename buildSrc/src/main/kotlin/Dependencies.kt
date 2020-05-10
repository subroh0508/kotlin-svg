import org.gradle.api.Project

fun Project.wrappers(projectName: String) = "org.jetbrains:kotlin-$projectName:${wrappersVersion(projectName)}"

fun Project.kotlinx(projectName: String, target: String) = "org.jetbrains.kotlinx:kotlinx-$projectName-$target:${version("kotlinx.$projectName")}"

private fun Project.wrappersVersion(projectName: String) =
    "${version(projectName)}-${version("wrappers.$projectName")}-kotlin-${version("kotlin")}"
