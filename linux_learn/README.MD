# LINUX 学习笔记

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
   
cat 查看文件内容
  
ctrl + l 清空屏幕快捷键

pwd 查看当前路径
	  
rz 上传文件
    rz -y 覆盖上传
	  
sz 下载文件
	se 文件名

tar 解压文件
   tar -xvf node-v14.16.1-linux-x64.tar.xz 
	
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
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
