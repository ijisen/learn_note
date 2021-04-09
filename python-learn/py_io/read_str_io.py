# !/user/bin/python3
# -*- coding: utf-8 -*-

from io import StringIO
f = StringIO()
f.write('hello')
print(f.getvalue())

# 初始字符串
d = StringIO('Hello!\nHi!\nGoodbye!')
while True:
    s = d.readline()
    if s == '':
        break
    print(s.strip())