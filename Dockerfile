FROM maven:3.8.1 AS build
COPY . .
RUN mvn clean package

FROM amazoncorretto:17.0.4
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
