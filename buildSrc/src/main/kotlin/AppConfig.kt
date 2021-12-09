import org.gradle.api.JavaVersion

object AppConfig {
    const val minSdkVersion = 21
    const val targetSdkVersion = 31
    const val compileSdkVersion = 31
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"
    const val versionName = "1.0"
    const val versionCode = 1
    // TODO WHEN INHERITING PROJECT RENAME APPLICATION ID
    const val applicationId = "io.github.geeksforgeinc.base_android"
}
