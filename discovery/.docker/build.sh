#!/usr/bin/env bash
eval $(docker-machine env)
docker build -t @pom.artifactId@ --file ./Dockerfile .