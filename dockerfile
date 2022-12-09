FROM openjdk:17-alpine
VOLUME /tmp
COPY target\HelloWorld-0.0.1-SNAPSHOT.jar HelloWorld.jar
ENTRYPOINT ["java","-jar","HelloWorld.jar"]
