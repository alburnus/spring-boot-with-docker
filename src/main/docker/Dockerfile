FROM openjdk:8-jre-alpine

# add directly the war
COPY rest-in-docker-*.jar /app.jar

EXPOSE 8080
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
