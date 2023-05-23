# Use an OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/StudentDetailsBoot-0.0.1-SNAPSHOT.jar StudentDetailsBoot-0.0.1-SNAPSHOT.jar

# Expose the port on which the application will run
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]

