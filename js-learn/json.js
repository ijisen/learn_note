/*
JSON是JavaScript Object Notation的缩写，它是一种数据交换格式。

JSON字符集必须是UTF-8，JSON的字符串规定必须用双引号""，Object的键也必须用双引号""。

*/



//JSON序列化 stringify
	var xiaoming = {
		name: '小明',
		age: 14,
		gender: true,
		height: 1.65,
		grade: null,
		'middle-school': '\"W3C\" Middle School',
		skills: ['JavaScript', 'Java', 'Python', 'Lisp']
	};
	JSON.stringify(xiaoming); // '{"name":"小明","age":14,"gender":true,"height":1.65,"grade":null,"middle-school":"\"W3C\" Middle School","skills":["JavaScript","Java","Python","Lisp"]}'
	//缩进输出
	JSON.stringify(xiaoming, null, '  '); 

	//筛选对象的键值，只输出指定的属性
	JSON.stringify(xiaoming, ['name', 'skills'], '  ');
	{
	  "name": "小明",
	  "skills": [
		"JavaScript",
		"Java",
		"Python",
		"Lisp"
	  ]
	}

	//传入一个函数，这样对象的每个键值对都会被函数先处理

	function convert(key, value) {
		if (typeof value === 'string') {
			return value.toUpperCase();
		}
		return value;
	}

	JSON.stringify(xiaoming, convert, '  ');

	{
	  "name": "小明",
	  "age": 14,
	  "gender": true,
	  "height": 1.65,
	  "grade": null,
	  "middle-school": "\"W3C\" MIDDLE SCHOOL",
	  "skills": [
		"JAVASCRIPT",
		"JAVA",
		"PYTHON",
		"LISP"
	  ]
	}



	//精确控制序列化

	var jisen = {
		name: 'jisen',
		age: 24,
		gender: true,
		height: 1.65,
		grade: null,
		'middle-school': '\"W3C\" Middle School',
		skills: ['JavaScript', 'Java', 'Python', 'Lisp'],
		toJSON: function () {
			return { // 只输出name和age，并且改变了key：
				'Name': this.name,
				'Age': this.age
			};
		}
	};

	JSON.stringify(jisen); // '{"Name":"jisen","Age":24}'


//反序列化parse

	JSON.parse('[1,2,3,true]'); // [1, 2, 3, true]
	JSON.parse('{"name":"小明","age":14}'); // Object {name: '小明', age: 14}
	JSON.parse('true'); // true
	JSON.parse('123.45'); // 123.45
	
	//JSON.parse()还可以接收一个函数，用来转换解析出的属性
	JSON.parse('{"name":"小明","age":14}', function (key, value) {
		// 把number * 2:
		if (key === 'name') {
			return value + '同学';
		}
		return value;
	}); // Object {name: '小明同学', age: 14}














