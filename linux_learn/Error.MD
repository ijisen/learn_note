# LINUX  err 问题总结

##  You need a C++ compiler for C++ support.
yum install -y gcc gcc-c++

## ./configure: error: the HTTP rewrite module requires the PCRE library.
需要安装 PCRE
1、cd /usr/local/src/
2、wget http://downloads.sourceforge.net/project/pcre/pcre/8.35/pcre-8.35.tar.gz
3、tar zxvf pcre-8.35.tar.gz
4、cd pcre-8.35
5、./configure
6、make && make install
7、查看pcre版本：  pcre-config --version


## ./configure: error: the HTTP gzip module requires the zlib library.
sudo yum install zlib-devel








