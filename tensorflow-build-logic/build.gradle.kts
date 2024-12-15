plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
    google()

    gradlePluginPortal()
}

dependencies {
    api("dev.icerock:mobile-multiplatform:0.14.4")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
    api("com.android.tools.build:gradle:8.8.0-rc01")
    api("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.23.7")
}
