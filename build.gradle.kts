plugins {
    `java-library`
    jacoco
    id("com.github.kt3k.coveralls") version "2.8.2"
}

repositories {
    jcenter()
}

dependencies {
    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:27.0.1-jre")
    testImplementation("junit:junit:4.12")
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        html.destination = file("${buildDir}/jacocoHtml")
    }
}
