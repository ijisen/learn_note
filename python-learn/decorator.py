#!/user/bin/python3
# -*- coding: utf-8 -*-
# fileName: Decorator 修饰器
import functools
import time
def log(func):
    # 绑定__name__
    @functools.wraps(func)
    def wrapper(*args, **kw):
        print('call %s():' % func.__name__)
        return func(*args, **kw)
    return wrapper

@log
def de():
    print('log started')

de()

def loged(text):
    def decorator(func):
        # 绑定__name__
        @functools.wraps(func)
        def wrapper(*args, **kw):
            start_time = time.time()
            print('%s %s():' % (text, func.__name__))
            end_time = time.time()
            print('%s execute in %s ms' %(func.__name__, end_time - start_time))
            return func(*args, **kw)
        return wrapper
    return decorator

@loged('text')
def deg():
    print('deg log started')

deg()
print(deg.__name__)
print(time.time())