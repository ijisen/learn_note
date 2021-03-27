自1997年Javascript被标准化以来，它定义了六种基本类型。
直到ES6，JS程序中任何一个值都属于以下几种类型之一。

Undefined
Null
Boolean
Number
String
Object ([],{})



Symbol


Symbol是一个集，但它的元素既不是字符串也不是对象。它是ES6的新成员：第七种基本类型。 

var obj = {
    a: 1
};
var safeKey = Symbol("know");
console.log(safeKey);//Symbol(know)
obj[safeKey] = 'value';
console.log(obj[safeKey]);  // value