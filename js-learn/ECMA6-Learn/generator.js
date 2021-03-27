// generator（生成器）是ES6标准引入的新的数据类型。一个generator看上去像一个函数，但可以返回多次。

	function* foo(x) {
		yield x + 1; //断点1 
		yield x + 2; //断点2 
		return x + 3; //结束1 
	}
	var f = foo(5); 
	f.next();// Object {value: 6, done: false}
	f.next();// Object {value: 7, done: false}
	f.next();// Object {value: 8, done: true}  //done 表示程序是否已执行完毕
	f.next();//Object {value: undefined, done: true}
		
	for (var x of foo(5)) {
		console.log(x); // 依次输出6,7,8
	}	
	
	
//斐波那契数列的函数
	function* fib(max) {
		var
			t,
			a = 0,
			b = 1,
			n = 1;
		while (n < max) {
			yield a;
			t = a + b;
			a = b;
			b = t;
			n ++;
		}
		return a;
	}
	for (var x of fib(10)) {
		console.log(x); // 依次输出0,1,1,2,3,5,8,13,21
	}
		
		