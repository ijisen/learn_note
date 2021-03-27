// let ECMA6 块级作用域
// let 是块级作用域，不会变量提升
// let 变量不允许重复声明

function vars(){
 var sum = 10;
 for(var i=0; i<5; i++){
	sum += i;
 }
 console.log(i)  // 5
}
// vars

function lets(){
 let sum = 10;
 for(let i=0; i<5; i++){
	sum += i;
 }
 console.log(sum) 
 console.log(i)  // ReferenceError i未定义
}
lets();


// const ECMA6 常量 具有块级作用域：
// const 是块级作用域，不会变量提升
// const 变量不允许重复声明
// const实际上保证的，并不是变量的值不得改动，而是变量指向的那个内存地址所保存的数据不得改动

const PI = 3.1415926;


// PI = 3; // 某些浏览器不报错，但是无效果！

// PI; // 3.14