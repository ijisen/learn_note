# isinstance(str, arg) 判断数据类型
def abds (x) :
	if not isinstance(x, (int, float)) :
		raise TypeError('bad operand type')
	if x < 0 :
		return -x
	else :
		return x

print(abds(-55))
