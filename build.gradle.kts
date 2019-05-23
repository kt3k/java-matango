plugins {
    `java-library`
    jacoco
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
