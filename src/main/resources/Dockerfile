# Use OpenJDK as base image
FROM openjdk:17-jdk-slim

# Copy the jar file to the image
COPY target/hellojenkins-1.0.jar /app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]



