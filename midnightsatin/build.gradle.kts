plugins {
    id("com.android.application")
}

android {
    namespace = "com.djsubterrain.watchface.midnightsatin"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.djsubterrain.watchface.midnightsatin"
        minSdk = 33
        targetSdk = 34
        versionCode = 3
        versionName = "0.2.1"
    }

    // One fixed key for all the faces, so each new build installs over the last one.
    // Personal build key: keep the repo private.
    signingConfigs {
        getByName("debug") {
            storeFile = rootProject.file("watchfaces.keystore")
            storePassword = "watchfaces"
            keyAlias = "watchfaces"
            keyPassword = "watchfaces"
        }
    }

    buildTypes {
        debug {
            isDebuggable = false
        }
        release {
            isMinifyEnabled = false
        }
    }
}
