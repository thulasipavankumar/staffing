FROM adoptopenjdk/openjdk11:alpine
VOLUME /tmp
COPY staffing-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
