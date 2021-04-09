#!/user/bin/python3
# -*- coding: utf-8 -*-

' JSON '
import json

a = dict(name='lisa', age=25)
print(a)
print(type(a)) # <class 'dict'>
c = json.dumps(a)

# Python对象 转 标准JSON
print(c) # {"name": "lisa", "age": 25}
print(type(c)) # <class 'str'>

# Python对象 转 字符串
d = str(a)
print(d) # {'name': 'lisa', 'age': 25}
print(type(d))  # <class 'str'>

b= {'name': 'lisa', 'age': 25}

print(b['name'])