# LINUX  YUM 学习笔记

## YUM（Yellowdog Updater Modified）是一个开源命令行以及基于图形的包管理工具，适用于基于 RPM（RedHat 包管理器）的 Linux 系统。它允许用户和系统管理员轻松地在系统上安装、更新、删除或搜索软件包。
  
yum [options] [command] [package...]

options: 可选，-h(帮助)，-y(安装过程提示选择全部为“yes”)，-q(不显示安装过程)
command: 需要进行的操作
package：安装的包名

## yum install
yum install <package_name>：安装指定的软件，通常结合-y一起使用（即yes，直接同意安装，不会再询问是否安装）。
yum install <package_name1> <package_name2> 安装多个包时用空格分开。


## yum update
yum update：更新所有软件
yum update <package_name>：更新指定的软件

yum check-update：列出所有可更新的软件清单


## yum list
yum list：列出所有可安裝的软件清单


yum list updates：列出所有可更新的软件包


yum list installed：列出所有已安装的软件包


yum list available：查看所有可用的软件包


yum list all：等同 yum list ，列出所有的包，已安装的和可用的。

yum search <keyword>：【默认】查找包含指定名称和摘要的软件包


## yum info
yum info <package_name>：获取软件包的信息


yum info：列出所有软件包的信息


yum info updates：列出所有可更新的软件包信息


yum info installed：列出所有已安装的软件包信息


yum info extras：列出所有已安装但不在 Yum Repository 内的软件包信息


## yum remove

yum remove <package_name>：删除软件包命令


yum deplist <package_name>：查看程序包依赖情况


## 除缓存命令:

yum clean packages: 清除缓存目录下的软件包
yum clean headers: 清除缓存目录下的 headers
yum clean oldheaders: 清除缓存目录下旧的 headers
yum clean, yum clean all (= yum clean packages; yum clean oldheaders) :清除缓存目录下的软件包及旧的 headers

yum provides <file>：查看某个库或文件包含在哪个安装包(软件包)中











