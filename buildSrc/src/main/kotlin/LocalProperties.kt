import org.gradle.api.Project
import java.util.*

val Project.localProperties get() = Properties().apply {
    file("../local.properties").inputStream().use { load(it) }
}
