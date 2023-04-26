FROM openjdk:17-jdk-slim
COPY . .
RUN apt-get update && apt-get install -y maven
RUN mvn install
ENTRYPOINT ["java", "-jar", "/target/spring-boot-hello-1.0.jar"]
