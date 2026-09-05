FROM gradle:jdk26-alpine AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon


FROM azul/zulu-openjdk:26-latest

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/usuario.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/usuario.jar"]