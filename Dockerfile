
FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean package


FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar
CMD ["java", "-jar", "demo.jar"]
