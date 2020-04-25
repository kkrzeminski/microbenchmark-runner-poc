plugins {
    java
    application
}

repositories {
    jcenter()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.google.guava:guava:28.2-jre")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    testImplementation("com.github.mp911de.microbenchmark-runner:microbenchmark-runner-junit5:0.2.0.RELEASE")
}

application {
    mainClassName = "microbenchmark.runner.poc.App"
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
