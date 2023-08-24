FROM openjdk:17-alpine
EXPOSE 8081
ADD target/checkpoint-1.0-SNAPSHOT.jar checkpoint-1.0-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "checkpoint-1.0-SNAPSHOT.jar"]