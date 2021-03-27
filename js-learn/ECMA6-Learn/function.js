// 解构赋值默认值结合使用
// 优点： 传参顺序、 默认值
function log({x, y = 'word'} = {}){
	console.log(x + y)
};

log({x : 'Hello'}); // Hello word

log({x : 'Hello', Y : 'China'}); // Hello China

log({x : 'Hello', y: ''}); // 'hello '

// ES5
function bix(x){
	var a  = x || 5; // 当传参为 0 false 时拿不到值
	console.log(a);
}
bix(false); // 5
bix(0); // 5
bix(8); // 8

// ES6
function box(x=5){
	console.log(x);
}
box(false); // 0
box(0); // 0
box(8); // 8


// EG2
function fetch(url, { body = '', method = 'GET', headers = {} }) {
	console.log(method);
}

fetch('http://example.com', {}); // "GET"

fetch('http://example.com');  // 报错


// EG3 利用参数默认值，可以指定某一个参数不得省略，如果省略就抛出一个错误。
function throwIfMissing() {
	throw new Error('Missing parameter');
}

function foo(mustBeProvided = throwIfMissing()) {
	return mustBeProvided;
}
foo(); // Error: Missing parameter

// 可以将参数默认值设为undefined，表明这个参数是可以省略的。
function foo2(optional = undefined) { }


// REST rest 参数（形式为...变量名），用于获取函数的多余参数，这样就不需要使用arguments对象了。
function add(...values) {
	let sum = 0;

	for (var val of values) {
		sum += val;
	}

	return sum;
}

add(2, 5, 3) // 10

// rest参数的写法
const sortNumbers = (...numbers) => numbers.sort();

		//注意，rest 参数之后不能再有其他参数（即只能是最后一个参数），否则会报错。
		// 报错
		function f(a, ...b, c) {
			// ...
		}


//###############“尾调用优化”对递归操作
function Fibonacci2 (n , ac1 = 1 , ac2 = 1) {
	if( n <= 1 ) {return ac2};

	return Fibonacci2 (n - 1, ac2, ac1 + ac2);
}

Fibonacci2(100) // 573147844013817200000
Fibonacci2(1000) // 7.0330367711422765e+208
Fibonacci2(10000) // Infinity


function Fibonacci (n) {
	if ( n <= 1 ) {return 1};

	return Fibonacci(n - 1) + Fibonacci(n - 2);
}

Fibonacci(10) // 89
Fibonacci(100) // 堆栈溢出
Fibonacci(500) // 堆栈溢出

// ps: 尾递归的实现，往往需要改写递归函数，确保最后一步只调用自身。做到这一点的方法，就是把所有用到的内部变量改写成函数的参数

// *** 柯里化（currying）将多参数的函数转换成单参数的形式
		function tailFactorial(n, total) {
			if (n === 1) return total;
			return tailFactorial(n - 1, n * total);
		}

		function factorial(n) {
			return tailFactorial(n, 1);
		}

		factorial(5) // 120

// 改写1： 柯里化 改写阶乘
		function currying(fn, n) {
			return function (m) {
				return fn.call(this, m, n);
			};
		}

		function tailFactorial(n, total) {
			if (n === 1) return total;
			return tailFactorial(n - 1, n * total);
		}

		const factorial = currying(tailFactorial, 1);

		factorial(5) // 120
// 改写2： ES6 改写阶乘
	function factorial(n, total = 1) {
		if (n === 1) return total;
		return factorial(n - 1, n * total);
	}

	factorial(5) // 120
// 总结：递归本质上是一种循环操作。纯粹的函数式编程语言没有循环操作命令，所有的循环都用递归实现，这就是为什么尾递归对这些语言极其重要。
// 对于其他支持“尾调用优化”的语言（比如 Lua，ES6），只需要知道循环可以用递归代替，而一旦使用递归，就最好使用尾递归。