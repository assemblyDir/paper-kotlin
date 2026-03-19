plugins {
    org.jetbrains.kotlin.jvm
    org.jetbrains.dokka
    com.gradleup.shadow
}

base {
    archivesName = "${rootProject.name}-${project.name}"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

tasks.build {
    dependsOn(
        "shadowJar",
        "kotlinSourcesJar",
        "dokkaGenerate",
        "dokkaGenerateHtml",
    )
}

tasks.withType<Zip>().configureEach {
    destinationDirectory = rootProject.layout.buildDirectory.dir("all")
}

tasks.shadowJar {
    archiveClassifier = "shadow"
}
