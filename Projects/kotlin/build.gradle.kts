import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
}
group = "uk.co.philanderson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-testng"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}
application {
    mainClassName = "MainKt"
}