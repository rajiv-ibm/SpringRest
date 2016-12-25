FROM java
MAINTAINER rajiv hr
VOLUME /logs
EXPOSE 8090
ADD ./target/gs-rest-service-0.1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/micros", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
