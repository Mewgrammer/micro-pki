# BUILD CONTEXT NEEDS TO BE SET TO THE PROJECT ROOT
FROM gradle:jdk11 as builder
USER root
WORKDIR /builder
COPY  ./build.gradle.kts /builder
COPY  ./settings.gradle.kts /builder
COPY  ./eureka-server /builder/eureka-server
RUN gradle :eureka-server:build --stacktrace --no-daemon

FROM openjdk:11-jre-slim
WORKDIR /app
EXPOSE 8761
COPY --from=builder /builder/eureka-server/build/libs/eureka-server-0.0.1.jar .
CMD ["java", "-jar", "eureka-server-0.0.1.jar"]
