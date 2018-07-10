#!/usr/bin/env sh

gradle buildImage &&

#cp build/libs/cuenta-microservice.jar src/main/docker/app/cuenta-microservice.jar &&

cd src/main/docker &&

docker-compose up --build

