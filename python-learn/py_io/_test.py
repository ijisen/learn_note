#！/user/bin/python3
# -*- coding: utf-8 -*-
def log(str):
    print(str)
import os
# 当前系统
'''
    posix  Linux、Unix或Mac OS X
    nt Windows 系统
'''
log(os.name)
if os.name == 'nt':
    log('Window 操作系统')
else:
    # uname 获取系统详细信息，非windows系统才提供
    print(os.uname())
# 环境变量获取
# log(os.environ)

# 获取某个环境变量的值
# log(os.environ.get('USERNAME')) # jisen

# 查看当前目录的绝对路径:
log(os.path.abspath('.')) # D:\nodejs\python\io_py

# 添加目录
a = os.path.join(os.path.abspath('.'), 'testDir')
log(a)

# 添加目录 目录存在会报错
# os.mkdir(a) # D:\nodejs\python\io_py\testDir
# os.mkdir('./dd')

# 删除目录 目录不存在会报错
# os.rmdir('./testDir')

# 拆分路径
b = os.path.split('/Users/michael/testdir/readme.txt')
log(b) # ('/Users/michael/testdir', 'readme.txt')

# 拆分文件扩展名
txt = os.path.splitext('/Users/michael/testdir/readme.txt')
log(txt) # ('/Users/michael/testdir/readme', '.txt')