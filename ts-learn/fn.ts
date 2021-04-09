/**
 * 函数声明(Function Declaration)
 * */

// 一个函数有输入和输出，要在 TypeScript 中对其进行约束，需要把输入和输出都考虑到，
function sum(x: number, y: number): number {
  return x + y
}

console.log(sum(5, 6));

/**
 * 函数表达式(Function Expression)
 * TypeScript => 用来表示函数的定义，左边是输入类型，需要用括号括起来，右边是输出类型
 * ES6 => 叫做箭头函数
 * 函数类型包含两部分：参数类型和返回值类型。
 * ps: 如果函数没有返回任何值，你也必须指定返回值类型为 void而不能留空。
 * */
// total 未定义类型，而是类型推论
let total = function (x: number, y: number): number {
  return x + y
};

let mySum: (x: number, y: number) => number = function (x: number, y: number): number {
  return x + y
};

let mySumEs6: (x: number, y: number) => number = (x: number, y: number): number => {
  return x + y;
};

let mySumEs7: (x: number, y: number) => void = (x: number, y: number): void => {
  console.log(x + y)
};

console.log(total(5, 7));

console.log(mySum(5, 7));

console.log(mySumEs6(5, 7));

console.log(mySumEs7(5, 7));

/**
 * 类型推断
 * 如果在赋值语句的一边指定了类型但是另一边没有类型，TypeScript编译器会自动识别出类型：
 * */

// 等价于 mySumEs7的效果
let mySumEs8 = (x: number, y: number): void => {
  console.log(x + y)
};


/**
 * 用接口定义函数的形状
 * */
interface iSearch {
  (x: number, y: number): number
}

let count: iSearch = function (x: number, y: number): number {
  return x + y
};

console.log(count(5, 7));

/**
 * 可选参数
 * 可选参数后面不允许再出现必需参数
 * */
interface iHelloWord {
  (name: string,
   gender: boolean,
   age?: number): string
}

let helloWord: iHelloWord = function (name: string, gender: boolean, age: number): string {
  if (age) {
    return `my name is ${name}, i'm ${gender ? 'boy' : 'girl'}, i'm ${age}`
  } else {
    return `my name is ${name}, i'm ${gender ? 'boy' : 'girl'}`
  }
};

console.log(helloWord('timi', true, 25));
console.log(helloWord('tom', true));

function buildName(name: string = '', age: number = 0) {
  return `my name is ${name}, i'm ${age}`
}

/**
 * 参数默认值
 * TypeScript 会将添加了默认值的参数识别为可选参数：
 * */
interface iDemo {
  name: string;
  age: number
}

function demo({name = '', age = 0}: iDemo): string {
  return `my name is ${name}, i'm ${age}`
}

function demod(name: string = 'ks', age: number = 25): string {
  return `my name is ${name}, i'm ${age}`
}

console.log(demo({name: 'jisen', age: 25}));

console.log(demod('tom'));

console.log(demod('lucy', 25));

/**
 * 剩余参数
 * */
function push(array: any[], ...items: any[]) {
  items.forEach(function (item) {
    array.push(item);
  });
}

let a = [];
push(a, 1, 2, 3);

function democ(...items: any[]): any[] {
  let _array: any[] = [];
  items.forEach(function (item) {
    _array.push(item);
  });
  return _array
}

democ(1, 2, 3, 4, 6, 7);


/**
 *  重载
 *  重载允许一个函数接受不同数量或类型的参数时，作出不同的处理
 *  TypeScript 会优先从最前面的函数定义开始匹配，
 *    所以多个函数定义如果有包含关系，需要优先把精确的定义写在前面。
 *  */

function reverse(x: number | string) {
  if (typeof x === 'number') {
    return 'number'
  } else {
    return 'string'
  }
}

reverse('5');
