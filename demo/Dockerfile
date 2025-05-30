# Etapa 1: Compilar el proyecto
FROM maven:3.9.6-eclipse-temurin-21 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Ejecutar la app
FROM openjdk:21-jdk-slim
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app_demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_demo.jar"]