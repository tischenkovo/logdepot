FROM openjdk:18-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} logdepot.jar
ENTRYPOINT ["java","-jar","/logdepot.jar"]