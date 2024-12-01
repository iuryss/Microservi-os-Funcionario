FROM maven:3.8.7-openjdk-17 AS build

WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean package

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/demo.jar demo.jar
CMD ["java", "-jar", "demo.jar"]
