FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} fizzBuzz-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fizzBuzz-0.0.1-SNAPSHOT.jar"]