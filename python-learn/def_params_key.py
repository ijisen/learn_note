#!/user/bin/python3
# -*- coding: utf-8 -*-
# fileName: def_params_key

' 关键字参数 '
' 关键字参数允许传入0个或任意个【含参数名】的参数，关键字参数在函数内部自动组装为一个dict。 '
def person(name, age=-1, **kw):
    obj = {}
    obj['name'] = name
    if age != -1:
        obj['age'] = age
    for k, v in kw.items():
        obj[k] = v
    print(obj)

person('lisa', de='def', dse='def')
extra = {'city': 'Beijing', 'job': 'Engineer'}
' 在 dict 前面加一个 ** 号，把 dict 的元素变成 关键字参数 传进去 '
person('lisa', '58', **extra)
person('lisa', '58', **{'de': 'def', 'dse': 'def'})