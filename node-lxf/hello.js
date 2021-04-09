'use strict'
var b = 25;

module.exports = {
	age : 0,
	init : function init(age){
		this.age = age;
	},
	run : function run(name){
		console.log('hello ' + name + ', you are ' + this.age + ' old');
	}
}

