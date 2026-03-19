import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar.Companion.shadowJar
import gradle.kotlin.dsl.accessors._b332154bd1a9d476469efdcd6b9bb8ba.jar
import gradle.kotlin.dsl.accessors._b332154bd1a9d476469efdcd6b9bb8ba.kotlinSourcesJar

plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            version = project.version.toString()
            artifactId = project.name

            artifact(tasks.jar.get().archiveFile) { classifier = "jar" }
            artifact(tasks.shadowJar.get().archiveFile)
            artifact(tasks.kotlinSourcesJar.get().archiveFile) { classifier = "sources" }
        }
    }
}
