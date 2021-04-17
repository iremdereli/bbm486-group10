FROM maven:3.6.3-adoptopenjdk-11-openj9 AS build-project
ADD . ./door-state
WORKDIR /door-state
RUN mvn package -DskipTests

FROM adoptopenjdk:11-jre-hotspot
COPY --from=build-project ./door-state/target/*.jar /app/door-state.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "door-state.jar"]