FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean package
CMD ["java", "-jar", "target/demo.jar"]
