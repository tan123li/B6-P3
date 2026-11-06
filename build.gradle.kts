plugins {
    id("com.android.application") version "9.0.0" apply false
    // KSP 2.3.x 起官方支持 AGP 9 内置 Kotlin（不再随 Kotlin 版本号命名）
    id("com.google.devtools.ksp") version "2.3.13" apply false
}
