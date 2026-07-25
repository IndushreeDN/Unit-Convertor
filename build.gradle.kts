// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Correct: Use aliases from libs.versions.toml without specifying the version.
    // Gradle will automatically get the version from your version catalog.
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
