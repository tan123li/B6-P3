plugins {
    id("com.android.application")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.fridge"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.fridge"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // 协程 + ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.4")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.4")
    // by viewModels() 委托所需的 Activity KTX 扩展
    implementation("androidx.activity:activity-ktx:1.10.1")
    // Fragment 与 by activityViewModels() 委托所需的 Fragment KTX 扩展
    implementation("androidx.fragment:fragment-ktx:1.8.5")

    // Room 数据持久化
    implementation("androidx.room:room-runtime:2.8.3")
    implementation("androidx.room:room-ktx:2.8.3")
    ksp("androidx.room:room-compiler:2.8.3")

    // WorkManager 后台任务（每日过期提醒）
    implementation("androidx.work:work-runtime-ktx:2.10.5")
}
