#!/user/bin/python3
# -*- coding: utf-8 -*-
# 元素做累积计算
from functools import reduce
def f_add(x, y):
    return x + y
def f_total(x, y):
    return x * y
print(reduce(f_add, [1, 2, 3, 4, 5])) # 1+2+3+4+5=15
print(reduce(f_total, [1, 2, 3, 4, 5])) # 1*2*3*4*5=120