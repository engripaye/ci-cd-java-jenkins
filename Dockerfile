FROM openjdk:17-jdk-slim

COPY target/ci-cd-java-jenkins-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

