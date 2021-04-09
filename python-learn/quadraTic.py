'''# math'''
import math
def quadraTic(a, b, c):
    ''' 一元二次方程 '''
    _sq = None
    if not isinstance(a, (int, float)):
        raise TypeError('a is not a number')
    if not isinstance(b, (int, float)):
        raise TypeError('b is not a number')
    if not isinstance(c, (int, float)):
        raise TypeError('c is not a number')
    if a == 0:
        _sq = - (c / b)
    else:
        _sq = b * b - 4 * a * c
        if _sq == 0:
            _sq = - (b / 2 * a)
        elif _sq < 0:
            print('the params has wrong')
        else:
            _sq = math.sqrt(_sq)
            _sq = ((-b + _sq) / (2 * a), (-b - _sq) / (2 * a))
    return _sq
G = quadraTic(1, 3, -4)
print(G)