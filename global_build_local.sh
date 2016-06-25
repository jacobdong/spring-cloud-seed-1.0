#!/usr/bin/env bash

eval $(docker-machine env)
#更新
git pull origin master
echo "## 更新项目代码"

docker images

mvn clean install
echo "## 项目构建完成"

#打包 发现服务
chmod 777 ./**/target/build.sh

echo "## 修改脚本执行权限"

cd ./discovery/target/

echo "## 进入discovery脚本目录"; pwd

echo "## 准备执行 discovery构建脚本";
./build.sh

echo "## discovery 构建docker镜像完成"

cd ../../config/target/

echo "## 进入config脚本目录"; pwd

echo "## 准备执行 config构建脚本";

./build.sh

echo "## config 构建docker镜像完成"

docker images