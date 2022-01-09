// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Plugins.android_gradle_build_tools)
        classpath(Plugins.kotlin_gradle_plugin)
        classpath(Plugins.dagger_hilt_plugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

apply(from="$rootDir/buildscripts/dependency-graph.gradle")
plugins {
    id("scabbard.gradle") version "0.5.0"
}

scabbard {
    enabled = true
    outputFormat = "svg"
}