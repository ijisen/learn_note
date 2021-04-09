/** ===============================================
 * 原始数据类型（Primitive data types）
 *   布尔值、数值、字符串、null、undefined、Symbol
 * 对象类型（Object types）
 *   Object、Array
 * ===============================================  */
/**
 *  原始类型 */
// 布尔值
var gender = true;
// 只允许赋值 Number
var age = 23;
// String
var named = 'tom';
var userId = null;
var userName = undefined;
// any 则允许被赋值为任意类型(原始类型&对象类型)。
var userType = '0';
userType = 1;
userType = '1';
// 联合类型（Union Types）表示取值可以为多种类型中的一种。
var setType = '';
setType = '5';
console.log(setType);
setType = 10;
console.log(setType);
var str = "my name is " + named + ", i'm " + (gender ? 'boy' : 'girl') + ", i'm " + age;
console.log(userType);
var userInfo = {
    name: 'timi',
    age: 25,
    gender: 1,
    userType: 'online'
};
console.log(userInfo);
userInfo = {
    name: 'tom',
    age: 27,
    userType: 'offline',
    setType: 1,
    gender: 'boy'
};
console.log(userInfo);
/**
 *  对象类型-数组类型
 *  在 TypeScript 中，我们使用接口（Interfaces）来定义对象的类型。*/
// 1、「类型 + 方括号」表示法
var fibArr = [1, 2, 3, 4, 5];
console.log(fibArr);
// 2、数组泛型（Array Generic） 表示法
var accArr = [1, 2, 3, '5'];
console.log(accArr);
var fibonacci = [1, 2, 3, 4];
console.log(fibonacci);
// 4、类数组，类数组（Array-like Object）不是数组类型
function sum() {
    // IArguments typeScript 内置对象
    var args = arguments;
}
// any 在数组中的应用
var list = ['a', 1, { name: 'jisen' }];
console.log(list);
/**
 *  元组 Tuple
 *  元组类型允许表示一个已知元素数量和类型的数组，各元素的类型不必相同。
 *  */
var tuple_arr;
// Error
// tuple_arr = ['hello', 'hello'];
tuple_arr = ['hello', 4];
console.log(list);
/**
 *  枚举
 *  enum类型是对JavaScript标准数据类型的一个补充。
 *  */
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var green = Color.Green;
var red = Color.Red;
var bule = Color.Blue;
var colorName = Color[1];
