# LINUX 学习笔记

LINUX系统分为两种：
1、redhat系列： redhat、centos、fedora
==> 管理工具： yum
2、debian系列： debian、ubuntu
==> 管理工具： apt-get

查看系统版本：
==> cat /proc/version


## 使用软件
    SecureCRT
ls || dir  查看当前目录文件
ll 查看文件详情

cd 切换目录结构
   cd 目录名称
   cd .. 返回上一级

rm 删除文件
   rm 文件名
   rm -r 目录名
   
mv 修改文件名
   mv old_name new_name
   mv name path/name  移动文件
   
cat 查看文件内容
  
ctrl + l 清空屏幕快捷键

pwd 查看当前路径

## 切换ROOT权限

su root


## 文件上传|下载
    yum -y install lrzsz （rz sz工具包）	  
rz 上传文件
    rz -y 覆盖上传
	  
sz 下载文件
	sz 文件名

tar 解压文件
   tar -xvf node-v14.16.1-linux-x64.tar.xz 
   
cp docker-compose.yml docker-compose.yml_20230710
	
# Node 安装：
  1. 解压 tar -xvf node-v10.15.3-linux-x64.tar.xz
  2. 配置环境变量 
     vim .bash_profile
       #往 .bash_profile 新增环境变量
       使用 I 启用编辑模式
       使用 :wq 保持
       使用 source .bash_profile 提交
       export NODE_HOME=/node-v10.15.3-linux-x64
       export PATH=$PATH:$NODE_HOME/bin 
       export NODE_PATH=$NODE_HOME/lib/node_modules
node 服务启动：
   nohup npm run start > my.log 2>my.log & exit
   查看进程
   ps -A 
   
根据端口号查看PID
  netstat -anp|grep 7997
  // 查看端口
  netstat -tunlp
	
### linux 修改文件内容

1、进入文件：vim 文件名
	vim /etc/httpd/httpd.conf

2、查找待修改内容位置 ：

（1）shift+“：”，使文件变成可查询状态

（2）输入 / +查询内容 （eg 查询Directory参数，即 /Directory）

	eg 找到Directory参数，注释掉Require all denied添加Require all granted

3、找到位置后修改：按键盘 i 键 即变成可编辑状态

4、修改文件内容后退出：按ESC键

5、保存修改：

（1）shift + :，使文件变成可查询状态

（2）输入 wq！

如果不保存修改，可：

（1）shift + :，使文件变成可查询状态

（2）输入 q！