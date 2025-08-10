# Use a base image with a Java Development Kit (JDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . /app/

# Create proper package directory structure and move files
RUN mkdir -p app queue && \
    mv Main.java app/ && \
    mv Queue.java queue/

# Compile the Java code with proper package structure
RUN javac app/Main.java queue/Queue.java

# Define the command to run the application when the container starts
CMD ["java", "-cp", ".", "app.Main"]