# Use a base image with a Java Development Kit (JDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . /app/

# Compile the Java code
RUN javac selections/Selection.java app/app.java

# Define the command to run the application when the container starts
CMD ["java", "app.app"]