# docker 学习笔记

## 使用软件
    docker compose down && docker compose up -d

#### ps 查看正在运行的容器
	 docker ps
	 // -f,--filter 过滤
	 // -af  -a -f
	 docker ps -af name='centos7'
	 // -q 只显示id
	 docker ps -aq

#### port 查看指定 （ID 或者名字）容器的某个确定端口映射到宿主机的端口号。
	 docker port bf08b7f2cd89 <容器 ID>
	 docker port docker-gateway-umi-1 <名字>

#### build 构建镜像
	-t 给镜像打标签
	-f Dockerfile 路径
	docker build -t jisen-demo ./docker

#### run 启动容器
	-d 后台方式运行
	-p 8136:80 端口映射，将宿主的8136端口映射到容器的80端口
	–name 容器名 镜像名
	// 通过镜像 [jisen-demo] 创建一个容器[isen-demo-container]并运行。
	 docker run -d -p 8136:80 --name jisen-demo jisen-demo-container

#### stop 停止一个容器
	 docker stop <容器 ID>
	 docker stop docker-gateway-umi-1 <名字>

#### restart 重启容器
	 docker restart <容器 ID>

#### rm 删除容器跟镜像
	 docker rm -f <容器 ID>

#### stats 查看容器资源占用情况
	 docker stats jisen-demo


#### port 查看WEB应用程序容器的进程
	 docker port bf08b7f2cd89 <容器 ID>
	 docker port docker-gateway-umi-1 <容器名字>


#### inspect 查看Docker 容器的配置和状态信息
	 docker inspect docker-gateway-umi-1 <容器 ID>
	 docker inspect docker-gateway-umi-1 <容器名字>


#### logs 查看运行日志
	 docker logs -f 50425b8f2ef3 <容器 ID>
	 docker logs -f 50425b8f2ef3 <容器名字>



