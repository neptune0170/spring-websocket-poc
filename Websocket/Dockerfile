# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the project's build files
COPY target/Websocket-0.0.1-SNAPSHOT.jar /app/Websocket.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/Websocket.jar"]
