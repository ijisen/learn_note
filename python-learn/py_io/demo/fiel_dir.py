#!/user/bin/python3
# -*- coding: utf-8 -*-

' os 模拟 dir'

import os
path = os.path.abspath('../')
def dir_parh(path, arr):
    _arr = []
    _path = ''
    for x in os.listdir(path):
        _path = os.path.join(path, x)
        if os.path.isdir(_path):
            print(''.join(_arr), '|---', x)
            _arr.append('  ')
            dir_parh(_path, arr)
        else:
            print(''.join(_arr), '|---', x)
dir_parh(path, [])