import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    dependencies{
        classpath {
            files(
                "/Users/marharytanedzelska/Projects/forks/jreleaser/jreleaser/plugins/jreleaser-gradle-plugin/build/libs/jreleaser-gradle-plugin-1.2.0-SNAPSHOT.jar"
            )
        }
    }
}

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.jreleaser") version "1.2.0-SNAPSHOT"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
