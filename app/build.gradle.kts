plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk =  AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        abortOnError = false
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.javaVersion
        targetCompatibility = AppConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {
    implementation(Libraries.android_core_ktx)
    implementation(Libraries.app_compat)
    implementation(Libraries.google_material)
    testImplementation(TestLibraries.junit)
    androidTestImplementation(AndroidTestLibraries.androidx_junit)
    androidTestImplementation(AndroidTestLibraries.android_espresso)
    implementation(Libraries.fragment_ktx)
    implementation(Libraries.constraint_layout)
    //HILT
    implementation(Libraries.hilt_android)
    kapt(AnnotationProcessors.hilt_android_compiler)
    implementation(Libraries.hilt_lifecycle_viewmodel)
    kapt(AnnotationProcessors.hilt_compiler)
    implementation(Libraries.hilt_navigation_fragment)
    //APP STARTUP
    implementation(Libraries.app_startup)
    // ROOM
    implementation(Libraries.room_runtime)
    kapt(AnnotationProcessors.room_compiler)
    implementation(Libraries.room_ktx)
    testImplementation(TestLibraries.room_testing)
    // TIMBER
    implementation(Libraries.timber)
    // RETROFIT
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofit_gson)
    // OKHTTP3
    implementation(Libraries.okhttp3)
    // VIEWMODEL
    implementation(Libraries.viewmodel_ktx)
    // LIVEDATA
    implementation(Libraries.livedata_ktx)
    // LIFECYCLE
    implementation(Libraries.lifecycle_runtime_ktx)
    implementation(Libraries.lifecycle_common_java8)
    // HTTP LOGGING INTERCEPTOR
    debugImplementation(DebugLibraries.http_logging_interceptor)
    // CHUCKER
    debugImplementation(DebugLibraries.chucker)
    // NAVIGATION COMPONENT
    implementation(Libraries.navigation_fragment_ktx)
    implementation(Libraries.navigation_ui_ktx)
    // MOCKITO
    testImplementation(TestLibraries.mockito)
    // CORE TESTING
    testImplementation(TestLibraries.androidx_core_testing)
    //KOTLIN COROUTINES TEST
    testImplementation(TestLibraries.kotlinx_coroutines_test)
}

kapt {
    correctErrorTypes = true
}