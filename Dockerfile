# 1. Base image (Java 17)
FROM eclipse-temurin:17-jdk-alpine

# 2. Working directory inside container
WORKDIR /app

# 3. Copy jar file
COPY target/*.jar app.jar

# 4. Expose application port
EXPOSE 8080

# 5. Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
