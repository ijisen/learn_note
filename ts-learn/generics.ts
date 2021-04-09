/** ===============================================
 * 泛型【Generics】
 *软件工程中，我们不仅要创建一致的定义良好的API，同时也要考虑可重用性。
 * 组件不仅能够支持当前的数据类型，同时也能支持未来的数据类型，这在创建大型系统时为你提供了十分灵活的功能。
 *
 * 在像C#和Java这样的语言中，可以使用【泛型】来创建可重用的组件，一个组件可以支持多种类型的数据。
 * 这样用户就可以以自己的数据类型来使用组件。
 * ===============================================  */

function identity<T>(arg: T): T {
  // Property 'length' does not exist on type 'T'.
  // console.log(arg.length);
  return arg
}

// 申明类型
let input = identity<string>('input');

// 利用类型推论，编译器自动判断类型
let output = identity('output');

let numberInput = identity(10);


function loggingIdentity<T>(arg: T[]): T[] {
  console.log(arg.length);
  return arg;
}

let arrLogInput = loggingIdentity([1, 2, 3]);
// Argument of type '"input"' is not assignable to parameter of type 'unknown[]'.
// let strLogInput = loggingIdentity('input');
// Argument of type '1' is not assignable to parameter of type 'unknown[]'.
// let numberLogInput = loggingIdentity(1);


/** ===============================================
 * 泛型类型【Generics Type】
 *
 * ===============================================  */

// 泛型函数的类型与非泛型函数的类型没什么不同，只是有一个类型参数在最前面，像函数声明一样：
let myIdentity: <U>(arg: U) => U = identity;

// 泛型接口
interface IIdentity {
  <T>(arg: T): T;
}

let identityType: IIdentity = identity;

// 把泛型参数当作整个接口的一个参数
interface IIdentityParams<T> {
  (arg: T): T;
}

// 传入一个类型参数来指定泛型类型（这里是：number），锁定了之后代码里使用的类型。
let numberIdentityType: IIdentityParams<number> = identity;


/** ===============================================
 * 泛型类【Generic Classes】
 *  泛型类看上去与泛型接口差不多。 泛型类使用（ <>）括起泛型类型，跟在类名后面。
 *  类有两部分：静态部分和实例部分。
 *      泛型类指的是实例部分的类型，所以类的静态属性不能使用这个泛型类型。
 * ===============================================  */
class GenericNumber<T> {
  value: T;
  add: (x: T, y: T) => T;
}

let numberGenericNumber = new GenericNumber<number>();
numberGenericNumber.value = 10;
numberGenericNumber.add = function (x, y) {
  return x + y
};

let stringGenericNumber = new GenericNumber<string>();
stringGenericNumber.value = '10';
stringGenericNumber.add = function (x, y) {
  return x + y
};


/** ===============================================
 * 泛型约束【Generic Constraints】
 * ===============================================  */
interface ILengthwise {
  length: number
}

function lengthwise<T extends ILengthwise>(arg: T): T {
  console.log(arg.length);
  return arg;
}

// Argument of type '3' is not assignable to parameter of type 'ILengthwise'.
// lengthwise(3);

// 传入符合约束类型的值，必须包含必须的属性：
lengthwise({length: 1, value: 3});
