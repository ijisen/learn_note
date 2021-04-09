#!/user/bin/python3
# -*- coding: utf-8 -*-
# fileName: test.py

' a test module '
__author__ = 'Michael Liao'

import glob
print(glob.glob('*.py'))

from datetime import date
print(date.today())

import sys
print(sys.version)