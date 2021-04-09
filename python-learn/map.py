# map(fn, Iterable)
def redex(x):
    return x * x
r = map(redex, [1, 2, 3, 4, 5, 6, 7])
print(list(r))