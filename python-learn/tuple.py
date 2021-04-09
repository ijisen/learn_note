# -*- coding: utf-8 -*-
# 有序集合 tuple 元祖  不可修改，append insert pop 都无效
tuples = ('jisen', 'tmi')

print(tuples)

# 当定义的tuple只有一个时， 一定要加上,号 已消除歧义
tuplesd = ('jifen',)

emp = ('jisen', 'tmic', ['def', 'lilei'])
print(emp)
emp[2][0] = 'hmm'
print(emp)


L = [
    ['Apple', 'Google', 'Microsoft'],
    ['Java', 'Python', 'Ruby', 'PHP'],
    ['Adam', 'Bart', 'Lisa']
]
print(L[0][0])
print(L[1][1])
print(L[2][2])