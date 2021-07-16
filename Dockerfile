FROM openjdk:11.0.7-jre-slim-buster
EXPOSE 8080
ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
#target/demo-1.0.0.jar
ADD ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]


#as builder
#WORKDIR demo
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} demo.jar
#RUN java -Djarmode=layertools -jar demo.jar extract

#FROM adoptopenjdk:11-jre-hotspot
#WORKDIR application
#COPY --from=builder demo/dependencies/ ./
#COPY --from=builder demo/snapshot-dependencies/ ./
#COPY --from=builder demo/resources/ ./
#COPY --from=builder demo/application/ ./
#ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
