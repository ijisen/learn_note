/** ===============================================
 * 原始数据类型（Primitive data types）
 *   布尔值、数值、字符串、null、undefined、Symbol
 * 对象类型（Object types）
 *   Object、Array
 * ===============================================  */

/**
 *  原始类型 */

// 布尔值
const gender: boolean = true;

// 只允许赋值 Number
let age: number = 23;

// String
const named: string = 'tom';

const userId: null = null;

let userName: undefined = undefined;

// any 则允许被赋值为任意类型(原始类型&对象类型)。
let userType: any = '0';
userType = 1;
userType = '1';

// 联合类型（Union Types）表示取值可以为多种类型中的一种。
let setType: string | number = '';
setType = '5';
console.log(setType);
setType = 10;
console.log(setType);

let str = `my name is ${named}, i'm ${gender ? 'boy' : 'girl'}, i'm ${age}`;
console.log(userType);

/**
 *  对象类型
 *  在 TypeScript 中，我们使用接口（Interfaces）来定义对象的类型。
 *  一旦定义了任意属性，那么确定属性和可选属性的类型都必须是它的类型的子集*/

interface iUserInfo {
  // 必需属性
  name: string;
  // 必需属性
  age: number;
  // 只读属性
  readonly userType: string;
  // 可选属性
  setType?: number | string;
  // 多选属性
  gender: number | string;

  // 任意属性
  [propName: string]: any;
}

let userInfo: iUserInfo = {
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
let fibArr: number[] = [1, 2, 3, 4, 5];
console.log(fibArr);

// 2、数组泛型（Array Generic） 表示法
let accArr: Array<number | string> = [1, 2, 3, '5'];
console.log(accArr);

// 3、用接口表示数组
interface INumberArray {
  [index: number]: number
}

let fibonacci: INumberArray = [1, 2, 3, 4];
console.log(fibonacci);

// 4、类数组，类数组（Array-like Object）不是数组类型
function sum() {
  // IArguments typeScript 内置对象
  let args: IArguments = arguments;
}

// any 在数组中的应用
let list: any[] = ['a', 1, {name: 'jisen'}];
console.log(list);

/**
 *  元组 Tuple
 *  元组类型允许表示一个已知元素数量和类型的数组，各元素的类型不必相同。
 *  */
let tuple_arr: [string, number];

// Error
// tuple_arr = ['hello', 'hello'];

tuple_arr = ['hello', 4];
console.log(list);

/**
 *  枚举
 *  enum类型是对JavaScript标准数据类型的一个补充。
 *  */
enum Color {
  Red,
  Green,
  Blue
}

let green: Color = Color.Green;
let red:Color = Color.Red;
let bule = Color.Blue;
let colorName:string = Color[1];
