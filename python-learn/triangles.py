#!/user/bin/python3
# -*- coding: utf-8 -*-
# 杨辉三角生成器

def triangles(num):
    n = 0
    arr = [1]
    while n < num:
        temp = []
        for i in range(n):
            if i == 0:
                temp.append(1)
            else:
                temp.append(arr[i] + arr[i-1])
        temp.append(1)
        arr = temp
        n = n + 1
        yield arr

for t in triangles(7):
    print(t)