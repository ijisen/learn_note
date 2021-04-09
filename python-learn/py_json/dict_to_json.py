#!/user/bin/python3
# -*- coding: utf-8 -*-

' python 转标准 JSON '
import json

a = dict(name='lisa', age=25)
print(a) # {'name': 'lisa', 'age': 25}
print(type(a)) # <class 'dict'>

# Python Dict对象 转 标准JSON
c = json.dumps(a) 
print(c) # {"name": "lisa", "age": 25}
print(type(c)) # <class 'str'>

# Python对象 转 字符串
d = str(a)
print(d) # {'name': 'lisa', 'age': 25}
print(type(d))  # <class 'str'>

b= {'name': 'lisa', 'age': 25}

print(b['name'])