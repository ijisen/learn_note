'use strict'
//读取指定文件目录


var fs = require('fs');
//var dir = '/app';
var dir = '';
var files = fs.readdirSync(__dirname + dir);  //[]

console.log(files);

var js_file = files.filter((f) => {  //过滤后缀名为.js的文件
	return f.endsWith('.js');
});
console.log(js_file); //[]
console.log(js_file.length);