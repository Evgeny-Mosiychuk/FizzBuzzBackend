FROM openjdk:11
RUN useradd -ms /bin/bash newuser
USER newuser
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} fizzBuzz-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fizzBuzz-0.0.1-SNAPSHOT.jar"]