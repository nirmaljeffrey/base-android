private object PluginVersions {
    const val android_gradle_build_tools = "7.1.0"
    const val kotlin_gradle_plugin = "1.5.30"
    const val dagger_hilt_plugin = "2.38.1"
}

private object LibraryVersions {
    const val android_core_ktx = "1.7.0"
    const val app_compat = "1.4.0"
    const val google_material = "1.4.0"
    const val junit = "4.+"
    const val androidx_junit = "1.1.3"
    const val androidx_espresso = "3.4.0"
    const val hilt_android = "2.38.1"
    const val hilt_android_compiler = "2.38.1"
    const val hilt_lifecycle_viewmodel = "1.0.0-alpha03"
    const val hilt_compiler = "1.0.0"
    const val app_Startup = "1.1.0"
    const val room_runtime =  "2.4.2"
    const val room_compiler = "2.4.2"
    const val room_ktx = "2.4.2"
    const val room_testing = "2.4.2"
    const val timber = "5.0.1"
    const val retrofit = "2.9.0"
    const val retrofit_gson = "2.9.0"
    const val okhttp3 = "4.9.0"
    const val viewmodel_ktx = "2.4.0"
    const val livedata_ktx = "2.4.0"
    const val lifecycle_runtime_ktx = "2.4.0"
    const val lifecycle_common_java8 = "2.4.0"
    const val fragment_ktx = "1.4.0"
    const val constraint_layout = "2.1.2"
    const val http_logging_interceptor = "4.9.0"
    const val chucker = "3.5.2"
    const val navigation_fragment_ktx = "2.3.5"
    const val navigation_ui_ktx = "2.3.5"
    const val hilt_navigation_fragment = "1.0.0"
    const val mockito = "4.0.0"
    const val androidx_core_testing = "2.1.0"
    const val kotlinx_coroutines_test = "1.5.2"
}

object Plugins {
    const val android_gradle_build_tools = "com.android.tools.build:gradle:${PluginVersions.android_gradle_build_tools}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin_gradle_plugin}"
    const val dagger_hilt_plugin = "com.google.dagger:hilt-android-gradle-plugin:${PluginVersions.dagger_hilt_plugin}"
}

object Libraries {
    const val android_core_ktx = "androidx.core:core-ktx:${LibraryVersions.android_core_ktx}"
    const val app_compat = "androidx.appcompat:appcompat:${LibraryVersions.app_compat}"
    const val google_material = "com.google.android.material:material:${LibraryVersions.google_material}"
    const val hilt_android = "com.google.dagger:hilt-android:${LibraryVersions.hilt_android}"
    const val hilt_lifecycle_viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:${LibraryVersions.hilt_lifecycle_viewmodel}"
    const val app_startup = "androidx.startup:startup-runtime:${LibraryVersions.app_Startup}"
    const val room_runtime =  "androidx.room:room-runtime:${LibraryVersions.room_runtime}"
    const val room_ktx = "androidx.room:room-ktx:${LibraryVersions.room_ktx}"
    const val timber ="com.jakewharton.timber:timber:${LibraryVersions.timber}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${LibraryVersions.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${LibraryVersions.retrofit_gson}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${LibraryVersions.okhttp3}"
    const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersions.viewmodel_ktx}"
    const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${LibraryVersions.livedata_ktx}"
    const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${LibraryVersions.lifecycle_runtime_ktx}"
    const val fragment_ktx = "androidx.fragment:fragment-ktx:${LibraryVersions.fragment_ktx}"
    const val lifecycle_common_java8 = "androidx.lifecycle:lifecycle-common-java8:${LibraryVersions.lifecycle_common_java8}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${LibraryVersions.constraint_layout}"
    const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${LibraryVersions.navigation_fragment_ktx}"
    const val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${LibraryVersions.navigation_ui_ktx}"
    const val hilt_navigation_fragment = "androidx.hilt:hilt-navigation-fragment:${LibraryVersions.hilt_navigation_fragment}"
}

object AnnotationProcessors {
    const val hilt_android_compiler = "com.google.dagger:hilt-android-compiler:${LibraryVersions.hilt_android_compiler}"
    const val hilt_compiler = "androidx.hilt:hilt-compiler:${LibraryVersions.hilt_compiler}"
    const val room_compiler = "androidx.room:room-compiler:${LibraryVersions.room_compiler}"

}

object TestLibraries {
    const val junit = "junit:junit:${LibraryVersions.junit}"
    const val room_testing = "androidx.room:room-testing:${LibraryVersions.room_testing}"
    const val mockito = "org.mockito.kotlin:mockito-kotlin:${LibraryVersions.mockito}"
    const val androidx_core_testing = "androidx.arch.core:core-testing:${LibraryVersions.androidx_core_testing}"
    const val kotlinx_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${LibraryVersions.kotlinx_coroutines_test}"
}

object AndroidTestLibraries {
    const val androidx_junit = "androidx.test.ext:junit:${LibraryVersions.androidx_junit}"
    const val android_espresso = "androidx.test.espresso:espresso-core:${LibraryVersions.androidx_espresso}"
}

object DebugLibraries {
    const val http_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${LibraryVersions.http_logging_interceptor}"
    const val chucker = "com.github.chuckerteam.chucker:library:${LibraryVersions.chucker}"
}

object ReleaseLibraries {

}
