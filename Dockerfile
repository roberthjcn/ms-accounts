
FROM eclipse-temurin:17-jdk


WORKDIR /app

COPY build/libs/ms-accounts-0.0.1-SNAPSHOT.war app.war


EXPOSE 8081


CMD ["java", "-jar", "app.war"]
