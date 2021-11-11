import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-noarg:1.6.0-RC")
    }
}

plugins {
    id("org.springframework.boot") version "2.5.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.spring") version "1.5.31"
    kotlin("plugin.jpa") version "1.5.31"
}

allprojects {
    group = "com.mew"
    version = "0.0.1"
    apply {
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.jetbrains.kotlin.plugin.jpa")
        plugin("kotlin-noarg")
    }
    repositories {
        mavenCentral()
    }
    dependencies {
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
        implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.5")
        implementation("org.modelmapper:modelmapper:2.4.4")
        api("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
        api("jakarta.xml.bind:jakarta.xml.bind-api:3.0.1")
        developmentOnly("org.springframework.boot:spring-boot-devtools:2.5.6")
        testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.6") {
            exclude(module = "junit")
            exclude(module = "mockito-core")
        }
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
        testImplementation("com.ninja-squad:springmockk:3.0.1")
        testImplementation("io.projectreactor:reactor-test:3.4.11")
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.31")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.5.2-native-mt")
    }

    extra["springCloudVersion"] = "2020.0.4"
    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }
}

configure<org.jetbrains.kotlin.noarg.gradle.NoArgExtension> {
    annotation("com.mew.pki.common.data.entities.annotations.NoArg")
}



tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
