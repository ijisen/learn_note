# -*- coding: utf-8 -*-
def my_abe (x):
    ''' 这是文档字符串 '''
    if not isinstance(x, (int, float)):
        raise TypeError('is not a number')
    if x < 0 :
        return -x
    else:
        return x
print(my_abe(-5))
print(my_abe.__doc__) # 这是文档字符串

# 函数没有return 时会报错， 当函数什么都不做时  要用 pass 申明
def absets () :
  pass

absets()
