plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":ocp-layered-api-domain-port"))
//    runtimeOnly(project(":ocp-layered-domain"))
    implementation(project(":ocp-layered-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("com.h2database:h2")
}