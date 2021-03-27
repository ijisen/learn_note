//没有Class的写法：
	function Student(name) {
		this.name = name;
	}

	Student.prototype.hello = function () {
		console.log('Hello, ' + this.name + '!');
	};


	var stu = new Student('小明');
	stu.hello();



//Class的写法：

	//用class定义对象的另一个巨大的好处是继承更方便了
	class StuClass {
		constructor(name) {
			this.name = name;
		}

		hello() {
			console.log('Hello, ' + this.name + '!');
		}
	}
	
	
	var jisen = new StuClass('jisen');
	jisen.hello();
	
	
	
	//extends 原型继承的中间对象
		//extends则表示原型链对象来自StuClass
	class PrimaryStudent extends StuClass {
		constructor(name, grade) {
			super(name); // 记得用super调用父类的构造方法!
			this.grade = grade;
		}

		myGrade() {
			console.log('I am at grade ' + this.grade);
		}
	}
	
	var timi = new PrimaryStudent('timi', 5);

	timi.hello();
	
	timi.myGrade();
	
//练习：
	class Animal {
		constructor(name) {
			this.name = name;
		}
	}
	class Cat extends Animal {
		constructor(name){
		   super(name); //把参数传回给Animal构造函数
		}
		say() {
		  console.log(`Hello, ${this.name}!`)
	   }
	}
	var kitty = new Cat('Kitty');
	var doraemon = new Cat('哆啦A梦');
	
	
	
