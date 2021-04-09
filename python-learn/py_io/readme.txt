文件读写
|————— f = open(path)
|————— f.read(size)
|————— f.readlines() # 一次读取所有内容并按行返回list
|————— f.readline() 每次读取一行内容

StringIO 在内存中读写 只能是str eg: read_str_io.py
|————— from io import StringIO
|————— f = StringIO()
|————— f.write('中文')
|————— f.getvalue()

BytesIO 在内存中读写 只能是二进制数据 【功能与 StringIO 一样】
|————— from io import BytesIO
|————— f = BytesIO()
|————— f.write('中文'.encode('utf-8'))
|————— f.getvalue()

OS 操作文件和目录 os_file.py
|————— import os
|      |————— os.name # posix = Linux、Unix或Mac OS X，nt = Windows。
|      |————— os.uname() # 系统详细信息 非Windows
|      |————— os.environ # 系统环境变量
|      |————— os.environ.get('key') # 获取某个环境变量的值
|      |————— 操作目录
|      |   |————— os.path.abspath('.') # 查看当前目录的绝对路径 
|      |   |————— _path = os.path.join('./', 'testdir') # 返回路径,正确处理不同操作系统的路径分隔符 \ / 问题
|      |   |————— os.mkdir(_path) # 创建新目录
|      |   |————— os.rmdir(_path) # 删除目录
|      |   |————— os.path.split('./file.txt') # 拆分路径 ('/testdir', 'file.txt')
|      |   |————— os.path.splitext('./file.txt') # 拆分文件扩展名 ('/testdir/file', '.txt')
|      |————— 操作文件
|      |   |————— os.rename('test.txt', 'test.py') # 文件重命名
|      |   |————— os.remove('test.txt') # 文件删除