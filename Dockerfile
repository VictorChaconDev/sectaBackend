# Usa la imagen oficial de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Crea un directorio para la app
WORKDIR /app

# Copia el .jar compilado al contenedor
COPY build/libs/*.jar app.jar

# Expone el puerto
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]
