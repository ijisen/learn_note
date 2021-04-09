#!/user/bin/python3
# -*- coding:utf-8 -*-

# 类定义
class People:
    # 基本属性
    name = ''
    age = '0'
    # 私有属性，外部无法访问
    __weight = 0
    # 定义构造方法
    def __init__(self, name, age, weight):
        self.name = name
        self.age = age
        self.__weight = weight
    # 类的方法
    def getD(self):
        print('my name is {name}, i\'m {age}'.format(name=self.name, age=self.age))
    # 类的方法
    def getW(self):
        print(self.__weight)
    # 类的私有方法
    def __private_fn(self):
        print('private method')
# 实例化类
t = People('jisen', '28', '120')
t.getD()
t.getW()