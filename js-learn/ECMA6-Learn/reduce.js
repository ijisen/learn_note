// reduce 是ECMAScript5规范中出现的数组方法

//	Array的reduce()把一个函数作用在这个Array的[x1, x2, x3...]上，这个函数必须接收两个参数，
// reduce()把结果继续和序列的下一个元素做累积计算，其效果就是：
	var arr = [1, 3, 5, 7, 9];
		arr.reduce(function (x, y) {
			return x + y;
		}); // 25
		
	var arr = [1, 3, 5, 7, 9];
		arr.reduce(function (x, y) {
			return x * 10 + y;
		}); // 13579
		
		
		
		