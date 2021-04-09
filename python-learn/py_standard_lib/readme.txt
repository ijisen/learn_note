Python 标准库
|————— os 操作系统函数
|      |————— import os 
|      |————— os.name # 当前操作系统
|      |————— os.getcwd() # 返回当前的工作目录
|      |————— os.chdir('/server/accesslogs') # 修改当前的工作目录
|————— glob 文件通配符
|      |————— import glob 
|      |—————  glob.glob('*.py')
|————— sys 命令行参数
|      |————— import sys 
|      |—————  sys.version
|      |—————  sys.path
|————— re 字符串正则匹配
|      |————— import re 
|      |————— re.findall(r'\bf[a-z]*', 'which foot or hand fell fastest')
|      |————— re.sub(r'(\b[a-z]+) \1', r'\1', 'cat in the the hat')
|      |————— 'tea for too'.replace('too', 'two')
|————— math 数学模块
|      |————— import math 
|      |————— math.cos(math.pi / 4)
|      |————— math.log(1024, 2)
|————— random 随机数
|      |————— import random 
|      |————— random.sample(range(100), 10)   # sampling without replacement
|      |————— random.random()    # random float
|      |————— random.randrange(6)    # random integer chosen from range(6)
|————— smtplib 访问 互联网
|      |————— import smtplib
|————— datetime 日期和时间
|      |—————  import datetime
|      |—————  datetime.date.today()
|————— zlib，gzip，bz2，zipfile，以及 tarfile 数据压缩
|      |—————  import zlib
|      |—————  zlib.compress(str)