#!/user/bin/python3
# -*- coding: utf-8 -*-
# Filename: readme.txt


Python是一种计算机程序设计语言

python 运行Python

退出  exit() / c+z > enter

python calc.py  执行本地脚本


.py文件名只能是英文字母、数字和下划线的组合




print('hello word');
print('hello word', 'hello jisen');

input
	input() //当你输入name = input()并按下回车后，Python交互式命令行就在等待你的输入了。这时，你可以输入任意字符，然后按回车后完成输入。
	
	
Python程序是大小写敏感的
# -*- coding: utf-8 -*- 声明文件格式


注释语句。
#  单行注释
'''  ''' 多行注释
"""  """ 多行注释
版本选择
#!/usr/bin/python3 只适用于linux系统
: 缩进的语句视为代码块。
Python的语法采用缩进方式

数据类型：
	整数
	浮点型
	字符串  //字符串是以单引号'或双引号"括起来的任意文本
			"12\"34" //如果字符串内部既包含'又包含"怎么办？可以用转义字符\来标识
	布尔值  // True/False 首字母必须大写
	空值	//空值是Python里一个特殊的值，用None表示。None不能理解为0，因为0是有意义的，而None是一个特殊的空值

\n	//表示换行，
\t	//表示制表符，
\	//本身也要转义，所以\\表示的字符就是\，
r   //''表示''内部的字符串默认不转义  print(r'\\\t\\')   \\\t\\
'''...'''  //表示多行内容 
	print('''line1
			... line2
			... line3''')
			
与|或|非  add|or|not

常量 必须大写 PI = 3.14159265359

数据类型
|————— Number 不可变数据
|      |————— Int() 整数
|      |————— float() 整浮点型
|      |————— Boolean() 布尔值
|      |————— complex()  复数
|      | type(a) 判断数据类型 返回值： <class 'int'><class 'float'><class 'bool'><class 'complex'>
|      | isinstance(a, type) 判断数据类型 isinstance(a, (int,float,bool,complex))  返回值：True/Flase
|————— String 字符串 不可变数据
|————— List 有序列表 可变数据 a =[1,2,3,4]
|      |————— a.append() 添加
|      |————— a.insert(index, obj) 添加
|      |————— a.pop(index) 删除
|      |————— a.remove(obj) 删除 没有找到会报错
|      |————— del a[index] 删除
|      |————— a.clear() 清空列表
|      |————— len(a) 数组长度
|      |————— max(a) 数组最大值
|      |————— min(a) 数组最小值
|      |————— a.count(1) 计算某一值出现的次数
|      |————— list((1, 2, 34)) 将 tuple 转换成 list
|————— Tuple 有序元组，不可变数据 a = (1,2,3,4) 
|      |————— len(a) 数组长度
|      |————— max(a) 数组最大值
|      |————— min(a) 数组最小值
|      |————— tuple((1, 2, 34)) 将 list 转换成 tuple
|————— Dict dictionary 字典 可变数据 a = {age: 25, sex: 'boy'}
|      |————— len(a) 数组长度
|      |————— a.update(c) 将 dict c 更新到 a 中
|      |————— 'age' in a 判断key是否存在
|      |————— a.get('age', -1) 判断key是否存在, 默认返回None
|      |————— a.pop('age') 删除 key
|      |————— a.clear() 清空数据字典
|      |————— a.keys() 获取key
|      |————— a.values() 获取 values
|      |————— str(a) dict 转换成字符串
|————— Sets 无序集合 可变数据 a = set([1,2,3,4,5])
|      |————— len(a) 集合长度
|      |————— x in s 集合长度
|      |————— a.clear() 清空集合
|      |————— a.add('age') 添加
|      |————— a.update([]) 添加
|      |————— a.remove(key) 删除 如果元素不存在，则会发生错误。
|      |————— a.discard(key) 删除
|————— 不可变数据 Number String Tuple
|————— 可变数据 List Dict Set

运算符
|————— 算术运算符 
|      |————— + (1 + 2 = 3)
|      |————— - (5 - 4 = 1)
|      |————— * (5 * 4 = 20)
|      |————— ** (5 ** 2 = 25)
|      |————— / (5 / 2 = 2.5)
|      |————— // (5 // 2 = 2)
|      |————— % (5 % 2 = 0.5)
|————— 比较运算符
|      |————— > 大于
|      |————— < 小于
|      |————— == 等于
|      |————— != 不等于
|————— 赋值运算符
|      |————— -=
|      |————— +=
|      |————— /=
|      |————— *=
|      |————— **=
|      |————— //=
|      |————— %=
|————— 逻辑运算符
|      |————— and
|      |————— or
|      |————— not
|————— 成员运算符
|      |————— in
|      |————— not in
|————— 身份运算符
|      |————— is
|      |————— is not
|      |—— is 与 == 区别：
|      |—— is 用于判断两个变量引用对象是否为同一个， == 用于判断引用变量的值是否相等。

函数
|————— Def
|      |————— pass 函数占位符
|      |————— raise TypeError('bad operand type') 函数抛出
|      |————— isinstance(x, (int, float)) 数据类型校验
|      | 定义函数时，需要确定函数名和参数个数；
|      | 如果有必要，可以先对参数的数据类型做检查；
|      | 函数执行完毕也没有return语句时，自动return None。
|————— 可变参数 *  可变参数在函数调用时自动组装为一个 tuple
|      |————— eg: def_params_calc.py
|————— 命名关键字参数 **  关键字参数在函数调用时自动组装为一个 dict
|      |————— eg: def_params_key.py

import 与 from...import
|————— import path
|————— from a import b, c
|————— from a import *

迭代器
|————— iter() a = iter([1, 2, 3, 4, 5])
|————— a = (x for x in range(10))
|————— next() next(a)

变量作用域 eg: var.py
|————— L （Local） 局部作用域
|————— E （Enclosing） 闭包函数外的函数中
|————— G （Global） 全局作用域
|————— B （Built-in） 内建作用域
|————— L –> E –> G –> B 的规则查找，即：在局部找不到，便会去局部外的局部找（例如闭包），再找不到就会去全局找，再者去内建中找
|————— 修改全局作用域 用 global eg： global.py
|————— 修改闭包作用域 用 nonlocal eg： nonlocal.py

切片(slice)
|————— [[1, 2, 3, 4][0: 3]] 从索引0开始取，直到索引3为止，但不包括索引3
|————— n[-1] #4

isinstance
|————— isinstance('av', str) 判断一个变量是不是字符串
|————— isinstance([], iterable) 判断一个变量是否可迭代 from collections import Iterable

内置函数
|————— abs() 取绝对值
|————— map(fn, Iterable)
|————— reduce(fn, Iterable)
|————— filter(fn, Iterable)
|————— sorted(val, params)
|      |————— sorted([36, 5, -12, 9, -21]) # [-21, -12, 5, 9, 36]
|      |————— sorted([36, 5, -12, 9, -21], key=abs) #[5, 9, -12, -21, 36]
|      |————— sorted(['bob', 'about', 'Zoo', 'Credit'], key=str.lower, reverse=True)

匿名函数
|————— lambda eg: lambda x: x + 2

偏函数（Partial function）：函数的参数个数太多，需要简化时，使用functools.partial可以创建一个新的函数，这个新函数可以固定住原函数的部分参数，从而在调用时更简单。
|————— int()函数可以把字符串转换为整数，当仅传入字符串时，int()函数默认按十进制转换
|      |————— int('123456')
|      |————— int('123456', base=8) 按八进制转换
|      |————— int('123456', 2) 按二进制转换

错误类型 raise TypeError('Error des'):
|————— SyntaxError 语法错误
|————— ZeroDivisionError 语法错误
|————— NameError # name 'spam' is not defined
|————— TypeError 类型错误
|————— RuntimeError 超时
|————— OSError OS
|————— ValueError ValueError
|————— IOError IO

IO编程: Input/Output eg： io_py
|————— 回调模式/轮询模式








