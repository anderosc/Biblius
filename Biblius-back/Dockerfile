# Build-kiht
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Käivitus-kiht
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
COPY start.sh .
RUN chmod +x start.sh

EXPOSE 8080
ENTRYPOINT ["./start.sh"]
