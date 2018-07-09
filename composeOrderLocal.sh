#!/usr/bin/env sh

gradle buildImage &&

#cp build/libs/orderservice.jar src/main/docker/app/orderservice.jar &&

cd src/main/docker &&

docker-compose up --build

