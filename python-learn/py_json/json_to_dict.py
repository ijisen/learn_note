#!/user/bin/python3
# -*- coding: utf-8 -*-

' JSON 转 Python Dict'

import json
b = {'name': 'lisa', 'age': 25, 'isExit': True}
b = json.dumps(b)
print(b)
b = json.loads(b)
print(b)