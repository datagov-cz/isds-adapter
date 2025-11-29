FROM eclipse-temurin:21 AS build
WORKDIR /opt/isds-adapter/
COPY ./ ./
RUN chmod u+x ./mvnw && ./mvnw package

FROM eclipse-temurin:21
COPY --from=build /opt/isds-adapter/dist /opt/isds-adapter/
