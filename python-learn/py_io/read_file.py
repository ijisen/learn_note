# !/user/bin/python3
# -*- coding: utf-8 -*-

# 文件读取
''' 如果文件很小，read()一次性读取最方便；
    如果不确定文件大小，反复调用read(size)比较保险；
    如果是配置文件，调用readlines()最方便：
    open(file, mode='r', buffering=-1, encoding=None, errors=None, newline=None, closefd=True, opener=None)
'''
with open('./write.txt', 'r') as f:
    # 只读取十个字节
    # print(f.read(6))
    # readlines() 逐行读取
    for line in f.readlines():
        print(line.strip()) # strip() 把末尾的'\n'删掉
''' open('/Users/michael/gbk.txt', 'r', encoding='gbk', errors='ignore')
    open('/Users/michael/test.jpg', 'rb')
'''