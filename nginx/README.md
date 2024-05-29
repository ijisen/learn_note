
# NGINX 使用文档
  nginx 是一个高性能 HTTP 和 反向代理 web服务器，同时也提供了IMAP/POP3/SMTP服务；
  特点： 占内存少，并发高（50000并发连接数），支持热部署

目录结构
#
├── conf 配置文件
├── contrib
├── docs
├── html 默认站点目录
├── logs 日志目录
├── temp

###nginx 安装
sudo yum install nginx

### start nginx
	切换至nginx目录，服务启动

### tasklist /fi "imagename eq nginx.exe"
	查看任务进程
	
### nginx -s reload
	如果已经启动了就使用以下命令重新加载配置文件并重启

### nginx -s reopen
    重启 Nginx
	
### nginx -s stop
	快速停止   sudo systemctl stop nginx
	
### nginx -s quit
	完整有序的关闭
	
### taskkill /f /t /im nginx.exe
	终止进程
	/f 强制终止
	/t 终止指定的进程和任何由此启动的子进程
	/im 指定的进程名称
	
### nginx -t -c /nginx-1.21.4/conf/nginx.conf
	修改配置文件保存后，检查配置文件是否正确，successful就说明正确
  

