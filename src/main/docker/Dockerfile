FROM openjdk:8-jre-alpine

# add directly the war
ADD *.jar /jar.war


EXPOSE 8080
CMD echo "The application will start in ${JHIPSTER_SLEEP}s..." && \
    java -Djava.security.egd=file:/dev/./urandom -jar /jar.war