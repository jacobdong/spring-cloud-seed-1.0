#!/usr/bin/env bash
docker build -t @pom.artifactId@:@pom.version@ --file ./Dockerfile .