FROM eclipse-temurin:25-jdk-noble AS build
WORKDIR /opt/isds-adapter/
COPY ./ ./
RUN chmod u+x ./mvnw && ./mvnw package

FROM eclipse-temurin:25-jre-noble
COPY --from=build /opt/isds-adapter/dist /opt/isds-adapter/
