FROM openjdk:11-jdk-slim

WORKDIR /app

ADD build/libs/*.jar bookservice.jar
EXPOSE 8080

ENV JAVA_XMS=-Xms2048m
ENV JAVA_XMX=-Xmx2048m

ENTRYPOINT java $JAVA_XMS $JAVA_XMX -jar bookservice.jar
