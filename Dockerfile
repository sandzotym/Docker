#Start with a base image containing Java runtime
FROM openjdk:8

#Make port 8080 available to the world outside this container
#EXPOSE 8080

ADD target/spring-boot-mongodb-docker-integration.jar app.jar

#Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
