/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    compileSdkVersion(35)

    defaultConfig {
        minSdk = 26
        targetSdk = 35
    }
}
