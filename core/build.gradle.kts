plugins {
    `kotlin-convention`
    `publishing-convention`
    `paper-convention`
}

tasks.shadowJar {
    minimize()
}