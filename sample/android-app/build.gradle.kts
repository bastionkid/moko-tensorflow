/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("android-app-convention")
    id("kotlin-android")
}

android {
    defaultConfig {
        applicationId = "dev.icerock.moko.samples.tensorflow"

        versionCode = 1
        versionName = "0.1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    namespace = "com.icerockdev"
}

dependencies {
    implementation(libs.coroutines)
    implementation(libs.kotlinStdLib)
    implementation(libs.coreKtx)
    implementation(libs.appCompat)
    implementation(libs.constraintLayout)
    implementation(libs.androidDraw)
    implementation(libs.playServices)
    implementation(libs.mokoResources)
    implementation(libs.lifecycleRuntime)

    implementation(projects.sample.mppLibrary)
}
