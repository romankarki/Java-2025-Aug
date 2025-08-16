# Use a base image with a Java Development Kit (JDK)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY . /app/

# Create proper package directory structure and move files
RUN mkdir -p app bst && \
    mv Main.java app/ && \
    mv BST.java bst/

# Compile the Java code with proper package structure
RUN javac bst/BST.java app/Main.java

# Define the command to run the application when the container starts
CMD ["java", "-cp", ".", "app.Main"]