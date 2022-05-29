FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 9988
ADD target/spring-boot-docker.jar spring-boot-docker.jar 
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]

