strl = 'window'
def fun ():
	strl = 'local'
	print('local: ', strl)

fun() # local local
print('window:', strl) # window window

def fung ():
	global strl
	strl = 'local'
	print('local', strl)

fung() # local local
print('window', strl) # window local