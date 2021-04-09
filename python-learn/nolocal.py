def outer ():
	strl = 'outer'
	def inner ():
		strl = 'inner'
		print('inner:', strl)
	inner() # inner: inner
	print('outer:', strl) # outer: outer

outer()

# 闭包变量使用 global 无效
def outerg ():
	strl = 'outer'
	def inner ():
		global strl
		strl = 'inner'
		print('innter:', strl) #innter: inner
	inner()
	print('outer:', strl)  #outer: outer

outerg()

# 闭包变量使用 nonlocal 修改
def outern ():
	strl = 'outer'
	def inner ():
		nonlocal strl
		strl = 'inner'
		print('innter:', strl) #innter: inner
	inner()
	print('outer:', strl)  #outer: inner

outern()