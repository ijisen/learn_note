# -*- coding: utf-8 -*-
# 列表 可增加  可修改 可删除
classmates = ['jisen', 'lilei']
# 获取 classmates 的长度
_len = len(classmates) 
print(_len) # 2
# 修改 修改索引不能超出当前索引长度(越界)
classmates[1] = 'tom'
print(classmates)

# append 增加
classmates.append('Adam')
print(classmates)

# insert(索引, 值) 插入
classmates.insert(2, 'tony')
print(classmates)

# pop(index) 删除指定位置的元素
# 同样不可越界
classmates.pop(3)
print(classmates)