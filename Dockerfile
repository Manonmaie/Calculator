FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/Manonmaie/Calculator.git

FROM maven:3.6-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/Calculator /app
RUN mvn clean install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build app/target/Calculator-1.0-SNAPSHOT.jar /app/Calculator.jar
CMD ["java","-jar", "./Calculator.jar"]
