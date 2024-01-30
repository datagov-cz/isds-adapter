FROM openjdk:21-slim-bookworm as build
WORKDIR /opt/isds-adapter/
COPY ./ ./

RUN chmod u+x ./mvnw && ./mvnw package

FROM openjdk:21-slim-bookworm
COPY --from=build /opt/isds-adapter/dist /opt/isds-adapter/
