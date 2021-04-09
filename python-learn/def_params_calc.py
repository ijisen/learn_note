#!/user/bin/python3
# -*- coding: utf-8 -*-
# fileName: def_calc

' 函数可变参数 '
' 可变参数允许你传入0个或任意个参数，这些可变参数在函数调用时自动组装为一个tuple。'
def calc(*number):
    total = 0
    for x in number:
        total += x
    print(total)

calc(1, 2, 3, 4, 5)
' 在list或tuple前面加一个*号，把list或tuple的元素变成可变参数传进去 '
calc(*[1, 2, 3, 4, 5])
calc(*(1, 2, 3, 4, 5))