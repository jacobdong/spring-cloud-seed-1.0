#!/usr/bin/env bash

eval $(docker-machine env)

docker images

mvn clean install
echo "## 项目构建完成"

#打包 发现服务
chmod 777 ./discovery/target/build.sh
echo "## 修改脚本执行权限"

cd ./discovery/target/

echo "## 进入脚本目录"; pwd

echo "## 准备执行 discovery构建脚本";
./build.sh

echo "## 发现服务构建docker镜像完成"

docker images