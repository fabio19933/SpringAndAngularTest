#!/bin/sh
docker-compose down
docker rmi $(docker images -f "dangling=true" -q)
#build projects
gradle build -p firstMicroservice -Dorg.gradle.java.home=/usr/lib/jvm/java-17-openjdk-amd64
gradle build -p secondMicroservice -Dorg.gradle.java.home=/usr/lib/jvm/java-17-openjdk-amd64
gradle build -p eureka -Dorg.gradle.java.home=/usr/lib/jvm/java-17-openjdk-amd64
#remove docker images
docker rmi -f first
docker rmi -f second
docker rmi -f eureka
docker rmi -f front-end-micro
#docker build images
docker build -t first firstMicroservice
docker build -t second secondMicroservice
docker build -t eureka eureka
docker build -t front-end-micro frontEndMicro
#run docker
docker-compose up -d
