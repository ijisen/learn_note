


# NGINX 使用文档

目录结构
#
├── conf 配置文件
├── contrib
├── docs
├── html 默认站点目录
├── logs 日志目录
├── temp
### start nginx
	切换至nginx目录，服务启动

### tasklist /fi "imagename eq nginx.exe"
	查看任务进程
	
### nginx -s reload
	如果已经启动了就使用以下命令重新加载配置文件并重启
	
### nginx -s stop
	快速停止
	
### nginx -s quit
	完整有序的关闭
	
### nginx -t -c /nginx-1.21.4/conf/nginx.conf
	修改配置文件保存后，检查配置文件是否正确，successful就说明正确
  

