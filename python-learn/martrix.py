# 嵌套列表
martrix = [
	[1, 5, 9, 13],
	[2, 6, 10, 14],
	[3, 7, 11, 15],
	[4, 8, 12, 16]
]
# eg1
new_mart = [[item[i] for item in martrix] for i in range(4)]
print(new_mart)

# eg2
transport = []
for i in range(4):
    transport.append([item[i] for item in martrix])
print(transport)