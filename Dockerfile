FROM openjdk:12-jdk-alpine
COPY build/lib/isdasimm-0.0.1-SNAPSHOT.jar isdasimm-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","isdasimm-0.0.1-SNAPSHOT.jar"]