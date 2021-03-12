# Create directory
#FROM openjdk:latest
FROM java:8
ADD target/simple-artifact.jar simple-artifact.jar
# Install JDK
EXPOSE 8088
# Compile HelloDocker
ENTRYPOINT ["java", "-jar", "simple-artifact.jar"]
