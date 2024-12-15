/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://jitpack.io") }
    }
}

includeBuild("tensorflow-build-logic")

rootProject.name = "moko-tensorflow"
include(":tensorflow")
include(":sample:android-app")
include(":sample:mpp-library")
