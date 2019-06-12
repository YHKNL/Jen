#FROM openjdk:8-jdk-alpine
FROM hub.c.163.com/dwyane/openjdk:8
VOLUME /tmp
ADD jen-1.0-SNAPSHOT.jar jen.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jen.jar"]