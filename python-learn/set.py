# -*- coding: utf-8 -*-
# set和dict类似，也是一组key的集合，但不存储value。由于key不能重复，所以，在set中，没有重复的key。
sets = set([0,1,2,3])

# 传入的参数[1, 2, 3]是一个list，而显示的{1, 2, 3}
print(sets)

# 类似于 es6 的 set 具有去重功能
seds = set([1,1,1,1,23,5])
print(seds)
# 增加元素 add()
seds.add(9)
print(seds)

# seds.add({2,3,6,8}) 报错
# seds.add([3,6,8]) 报错
print(seds)

# 删除 remove
seds.add(100)
print(seds)
seds.remove(100)
print(seds)

# set可以看成数学意义上的无序和无重复元素的集合，
# 因此，两个set可以做数学意义上的交集、并集等操作：

s1 = set([1, 2, 3])
s2 = set([2, 3, 4])
# 交集
print(s1 & s2)
# 并集
print(s1 | s2)