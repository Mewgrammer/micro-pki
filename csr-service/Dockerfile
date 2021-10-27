# BUILD CONTEXT NEEDS TO BE SET TO THE PROJECT ROOT
FROM gradle:jdk11 as builder
USER root
WORKDIR /builder
COPY  ./build.gradle.kts /builder
COPY  ./settings.gradle.kts /builder
COPY  ./csr-service /builder/csr-service
RUN gradle :csr-service:build --stacktrace --no-daemon

FROM openjdk:11-jre-slim
WORKDIR /app
EXPOSE 8761
COPY --from=builder /builder/csr-service/build/libs/csr-service-1.0.0.jar .
CMD ["java", "-jar", "csr-service-1.0.0.jar"]
