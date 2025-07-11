FROM eclipse-temurin:17-jdk-jammy

LABEL authors="Yulcher"

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
