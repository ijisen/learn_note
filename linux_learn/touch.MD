# LINUX  touch 学习笔记

## touch用来创建文件,用来修改文件的时间戳。
  
touch [选项]... 文件...

命令参数

-a   或--time=atime或--time=access或--time=use 　只更改存取时间。
-c   或--no-create 　不建立任何文档。
-d 　使用指定的日期时间，而非现在的时间。
-f 　此参数将忽略不予处理，仅负责解决BSD版本touch指令的兼容性问题。
-m   或--time=mtime或--time=modify 　只更改变动时间。
-r 　把指定文档或目录的日期时间，统统设成和参考文档或目录的日期时间相同。
-t 　使用指定的日期时间，而非现在的时间。



创建一个1.txt文件
> touch 1.txt 
同时创建2.txt 3.txt文件
> touch 2.txt 3.txt

将5.txt的Access,Modify时间改成和1.txt一样
> touch -r 1.txt 5.txt
> ls 
-rw-r--r-- 1 root root 0 Feb  3 23:17 1.txt
-rw-r--r-- 1 root root 0 Feb  3 23:17 5.txt





