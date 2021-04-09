#!/user/bin/python3
# -*- coding: utf-8 -*-

' class 转 JSON '

import json

class Student:
    # 基本属性
    name = ''
    age = 0
    # 定义构造方法
    def __init__(self, name, age):
        self.name = name
        self.age = age
    # 定义方法
    def getName(self):
        print(self.name)

def studentDict(self):
    return {
        'name': self.name,
        'age': self.age,
        'getName': {'gender': 'boy'}
    }
b = Student('吉米', 25)

print(json.dumps(b, default=studentDict))

obj = dict(name='小明', age=20)
print(json.dumps(obj)) # {"name": "\u5c0f\u660e", "age": 20}
print(json.dumps(obj, ensure_ascii=False, skipkeys=True)) # {"name": "小明", "age": 20}