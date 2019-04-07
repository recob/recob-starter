FROM maven:3.5-jdk-8-alpine
WORKDIR /workspace/app

COPY pom.xml .
COPY src src

RUN mvn install -Dmaven.test.skip=true && rm -r *
