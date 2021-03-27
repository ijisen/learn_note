// for ... of循环是ES6引入的新的语法,能遍历Map 和 Set

	var a = ['A', 'B', 'C'];
	for (var x of a) { // 遍历Array
		console.log(x);
	}

	var s = new Set(['A', 'B', 'C']);
	for (var x of s) { // 遍历Set
		console.log(x); // 0,1,2  返回下标
	}


	var m = new Map([[1, 'x'], [2, 'y'], [3, 'z']]);
	for (var x of m) { // 遍历Map
		console.log(x[0] + ' = ' + x[1]);
	}


// 与for... in 的区别

	var b = ['A', 'B', 'C'];
		b.name = 'timi';
	for (var x of b) { 
		console.log(x); // 0 ,1, 2
	}	

	var b = ['A', 'B', 'C'];
		b.name = 'timi';
	for (var x in b) { 
		console.log(x); // 0 ,1, 2 , name
	}	
