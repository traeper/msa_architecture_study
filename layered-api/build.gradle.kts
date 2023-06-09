plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":layered-domain-jpa"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}