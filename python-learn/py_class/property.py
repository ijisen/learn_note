#!/user/bin/python3
# -*- coding: utf-8 -*-

# @property装饰器就是负责把一个方法变成属性调用; 装饰器（decorator） 属性校验
class Student:
    # 先写入再读取
    @property
    def score(self):
        return self._score
    # 写入属性
    @score.setter
    def score(self, value):
        if not isinstance(value, int):
            raise ValueError('score must be an integer!')
        if value < 0 or value > 100:
            raise ValueError('score must between 0 ~ 100')
        self._score = value
    # 只能读取
    @property
    def age(self):
        return 2015 - self._score

lisa = Student()
lisa.score = 90
print(lisa.score)
print(lisa.age)