
dependencies {
	implementation(project(":common"))
	implementation("org.jboss.resteasy:resteasy-client:4.7.2.Final")
	implementation("org.keycloak:keycloak-spring-boot-starter:15.0.2")
	implementation("org.keycloak:keycloak-admin-client:15.0.2")
	implementation("org.springframework.boot:spring-boot-starter-actuator:2.5.5")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("io.jsonwebtoken:jjwt:0.9.1")
	testImplementation("org.springframework.security:spring-security-test")
	runtimeOnly("org.postgresql:postgresql")
}

dependencyManagement {
	imports {
		mavenBom("org.keycloak.bom:keycloak-adapter-bom:15.0.2")
	}
}