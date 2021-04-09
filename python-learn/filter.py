#!/user/bin/python3
# -*- coding: utf-8 -*-

s = 'dtdddtdstdststdtdtdststs'
def fo(s):
    if s != 't':
        return 'A'
a = list(filter(fo, s))

print(a)