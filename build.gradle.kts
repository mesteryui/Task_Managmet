plugins {
    id("java")
    id("application")
}

group = "org"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
application {
    mainClass.set("org.main.Main") // Cambia esto según la ubicación de tu clase Main
}
tasks.test {
    useJUnitPlatform()
}