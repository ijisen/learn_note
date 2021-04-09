# -*- coding: utf-8 -*-
# 无序集合 dictionary 严格遵守JSON数据格式 不然容易出错
dicts = {
	'name' : 'jisen',
	'age' : 25,
	'sex' : 'man'
}

# 检测 属性是否存在  不存在会报错
print('name' in dicts)
print(dicts.get('sexs')) # None
print(dicts.get('sexs', -1)) # -1 指定返回参数
print(dicts.get('sex')) # man
print(dicts['sex'])
'''
和list比较，dict有以下几个特点：
 1、查找和插入的速度极快，不会随着key的增加而变慢；
 2、需要占用大量的内存，内存浪费多。
'''
dicts['sex'] = 'girl'
# 删除 key pop()
dicts.pop('age')
print(dicts)
