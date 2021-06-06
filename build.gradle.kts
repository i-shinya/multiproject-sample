import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.10"
	kotlin("plugin.spring") version "1.5.10"
}

group = "com.multiproject"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply {
		// 以下を参照し追加
		// https://github.com/gradle/kotlin-dsl-samples/issues/1268
		plugin("java")

		plugin("kotlin")
		plugin("io.spring.dependency-management")
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
	}

	dependencies {
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.2")
		implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.0-M1")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.0-M1")
		annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:2.4.4")
		testImplementation("org.springframework.boot:spring-boot-starter-test:2.4.4")
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
}