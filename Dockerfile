FROM openjdk:8-jre-slim

COPY ./target/hello-0.0.1-SNAPSHOT.jar ./

EXPOSE 8080
CMD ["java", "-jar", "hello-0.0.1-SNAPSHOT.jar"]