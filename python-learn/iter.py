import sys
# 
a = [1, 2, 3, 4, 5]
it = iter(a)
while True:
    try:
        print(next(it))
    except StopIteration:
        sys.exit()

# 函数变成generator
def fib(max):
    a, b, n = 0, 1, 0
    while n < max:
        yield b
        # a, b = b, a + b
        b = a + b
        a = b - a
        n = n + 1
    return 'donedd'
f = fib(10)
print(next(f))
print(next(f))
print(next(f))
print(next(f))

g = fib(4)
while True:
    try:
        d = next(g)
        print('d:', d)
    except StopIteration as e:
        print('generator return value', e.value)
        break