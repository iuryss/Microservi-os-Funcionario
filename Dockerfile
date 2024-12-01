WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw -DoutputFile=target/mvn-dependency-list.log -B -DskipTests clean package
CMD ["java", "-jar", "target/demo.jar"]
