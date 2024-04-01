FROM openjdk:17-jdk-slim

# Debugging: Print the contents of the build context
COPY ./build/libs/key-0.0.1-SNAPSHOT.jar /opt/service.jar
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://database:5432/key
ENV POSTGRES_USER=superuser
ENV POSTGRES_PASSWORD=229csx229CSX
EXPOSE 8080
CMD exec java -jar /opt/service.jar