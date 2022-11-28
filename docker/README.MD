# docker 学习笔记

## 使用软件
    docker compose down && docker compose up -d
	
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



