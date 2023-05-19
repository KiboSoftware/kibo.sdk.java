FROM maven:3.6.0-jdk-8 as build
WORKDIR /usr/src/app

COPY pom.xml .
#RUN mvn -B -e dependency:resolve
COPY . .
ARG BUILD_VER=1.1.0-SNAPSHOT

RUN mvn -X -s settings.xml clean package deploy -DcreateChecksum=true -Drevision=$BUILD_VER
