# LINUX  tar 学习笔记

## tar 用来压缩和解压文件。tar本身不具有压缩功能。他是调用其他具有压缩功能的命令实现的。

  
tar [必要参数] [选择参数] [文件]
示例
  tar -cf archive.tar foo bar  # 从文件 foo 和 bar 创建归档文件
archive.tar。
  tar -tvf archive.tar         # 详细列举归档文件 archive.tar中的所有文件。
  tar -xf archive.tar          # 展开归档文件 archive.tar中的所有文件。

 主操作模式:

  -A, --catenate, --concatenate   追加 tar 文件至归档
  -c, --create               创建一个新归档 =》压缩文档
  -d, --diff, --compare      找出归档和文件系统的差异
      --delete               从归档(非磁带！)中删除
  -r, --append               追加文件至归档结尾
  -t, --list                 列出归档内容
      --test-label           测试归档卷标并退出
  -u, --update               仅追加比归档中副本更新的文件
  -x, --extract, --get       从归档中解出文件 =》解压文档
  -t, --verbose              显示所有过程

压缩选项:

  -a, --auto-compress        使用归档后缀名来决定压缩程序
  -I, --use-compress-program=PROG
                             通过 PROG 过滤(必须是能接受 -d
                             选项的程序)
  -j, --bzip2                通过 bzip2 过滤归档
  -J, --xz                   通过 xz 过滤归档
      --lzip                 通过 lzip 过滤归档
      --lzma                 通过 lzma 过滤归档
      --lzop
      --no-auto-compress     不使用归档后缀名来决定压缩程序
  -z, --gzip, --gunzip, --ungzip   通过 gzip 过滤归档
  -Z, --compress, --uncompress   通过 compress 过滤归档

设备选择和切换:

  -f, --file=ARCHIVE         使用归档文件或 ARCHIVE 设备
      --force-local          即使归档文件存在副本还是把它认为是本地归档
  -F, --info-script=名称,     --new-volume-script=名称
                             在每卷磁带最后运行脚本(隐含 -M)
  -L, --tape-length=NUMBER   写入 NUMBER × 1024 字节后更换磁带
  -M, --multi-volume         创建/列出/解压多卷归档文件
      --rmt-command=COMMAND  使用指定的 rmt COMMAND 代替 rmt
      --rsh-command=COMMAND  使用远程 COMMAND 代替 rsh
      --volno-file=FILE      使用/更新 FILE 中的卷数
  
## 创建归档文档


## 解压文件