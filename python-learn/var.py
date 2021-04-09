# 全局变量 Global
num = 10

# 内建作用域 
str = int(10.20)
def outer ():
	# 闭包变量 Enclosing
	num = 20
	def inner ():
		# 局部作用域 Local
		num = 30 
