plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.26.0")
    testImplementation("org.mockito:mockito-core:5.12.0")
    testImplementation("com.approvaltests:approvaltests:24.5.0")
}

tasks.test {
    useJUnitPlatform()
}
