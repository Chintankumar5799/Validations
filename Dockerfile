FROM openjdk:21
WORKDIR /app
COPY target/demo-1-0.0.1-SNAPSHOT.war /app/demo-1-0.0.1-SNAPSHOT.war
EXPOSE 8500

ENTRYPOINT [ "java","-jar","demo-1-0.0.1-SNAPSHOT.war" ]