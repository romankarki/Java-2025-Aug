# Use a base image with a Java Development Kit (JDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY app/Selection.java /app/

# Compile the Java code
RUN javac Selection.java

# Define the command to run the application when the container starts
CMD ["java", "Selection"]