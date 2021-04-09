#!/user/bin/python3
# -*- coding: utf-8 -*-
# 类继承

# 类定义
class People:
    # 基本属性
    name = ''
    age = ''
    # 私有属性
    __weight = 0
    # 定义构造方法
    def __init__(self, n, a, w):
        self.name = n
        self.age = a
        self.__weight = w
    # 基本信息读取
    def getU (self):
        print('name: {name}, age: {age}'.format(name=self.name, age=self.age))

# 单继承实例1
class Student(People):
    # 基本属性
    gender = ''
    # 定义构造方法
    def __init__(self, name, age, weight, gender):
        # 调用父类的构造方法
        People.__init__(self, name, age, weight)
        self.gender = gender
    def getG (self):
        print('name: %s, gender: %s' % (self.name, self.gender))

# 实例化类
t = Student('jisen', 28, 120, 'boy');
t.getG()
t.getU() # name: jisen, age: 28

# 单继承实例2
class Work(People):
    # 基本属性
    level = 1
    # 定义构造方法
    def __init__(self, name, age, weight, level):
        People.__init__(self, name, age, weight)
        self.level = level
    # 重写父类方法 ps: 重写父类方法 私有属性仍然无法获取
    def getU(self):
        print('name: %s, weight: %s' % (self.name, self.age))
    # 获取基本信息
    def getB(self):
        print('name: %s, level: %s' % (self.name, self.level))
# 类实例化
w = Work('tmic', 30, 'girl', 5)
w.getB()
w.getU() # name: tmic, weight: 30

 #用子类对象调用父类已被覆盖的方法
super(Work,w).getU() # name: tmic, age: 30