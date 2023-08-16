# This dockerfile uses the ubuntu image
# VERSION 2 - EDITION 1
# Author: docker_user
# Command format: Instruction [arguments / command] ..

# Base image to use, this must be set as the first line
# 基础镜像信息
FROM docker.zdns.cn/gtld/node:latest as builder
ENV NODE_OPTIONS=--openssl-legacy-provider

# Maintainer: docker_user <docker_user at email.com> (@docker_user)
# 维护者信息
MAINTAINER docker_user docker_user@email.com

# Commands to update the image
# 镜像操作指令  =》 每运行一条 RUN 指令
RUN echo "deb http://archive.ubuntu.com/ubuntu/ raring main universe" >> /etc/apt/sources.list
RUN apt-get update && apt-get install -y nginx
RUN echo "\ndaemon off;" >> /etc/nginx/nginx.conf

# Commands when creating a new container
# 容器启动时执行指令
CMD /usr/sbin/nginx
