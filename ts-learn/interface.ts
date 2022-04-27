/** ===============================================
 * 接口
 *   TypeScript的核心原则之一是对值所具有的结构进行类型检查。
 *   它有时被称做“鸭式辨型法”或“结构性子类型化”。
 *   在TypeScript里，接口的作用就是为这些类型命名和为你的代码或第三方代码定义契约。
 * ===============================================  */

interface GenderObj {
  name: string;
  age?: number;
  readonly gender: number;

  // 任意属性
  [propName: string]: any;
}

function printLabel(labelObj: GenderObj): string | number {
  console.log(labelObj.name);
  return `my name is ${labelObj.name}, i'm ${labelObj.age}`
}

let myObj = { name: 'timi', gender: 1, fn: '123' };

printLabel(myObj);

interface A {
  name: string;
}

/** interface可以合并同名接口，type不可以 */
interface A {
  age: number;
}

type B = {
  gender: boolean;
}

// interface 继承 interface
interface C extends A {
  /** interface 无法重写 A 的属性 */
  // name: boolean;
  no: number;
}

// interface 继承 type
interface D extends B {
  /** interface 无法重写 B 的属性 */
  // gender: string;
  type: string;
}

// type 继承 interface, 不可以重写 A 的属性
// ps: 错误的重写方法，并不能生效
// type E = { code: string; name: number; } & A;
type E = { code: string; } & A;
const EObj: E = { code: 'timi', name: 'name', age: 25 };

// type 继承 type, 不可以重写 B 的属性
// ps: 错误的重写方法，并不能生效
// type F = { code: string; gender: string; } & B;
type F = { code: string; } & B;
const FObj: F = { code: 'timi', gender: true };


interface Todo {
  title: string;
  description: string;
  completed: boolean;
  createdAt: number;
}

let todo: Todo = {
  title: "Clean room",
  completed: false,
  createdAt: 1615544252770,
  description: '888'
};
/**
 * Omit 删除掉某一条属性
 * */
type TodoPreview = Omit<Todo, "description" | 'createdAt'>;
const todo2: TodoPreview = {
  title: "Clean room",
  completed: false,
  // createdAt: 1615544252770,
  // description: '888'
};


/**
 * 类型属性重写
 *
 * */
type Merge<M, N> = Omit<M, Extract<keyof M, keyof N>> & N;

interface AA {
  name: string;
  color: string;
}

const aTodo: AA = {
  name: '12',
  color: '999'
}
// redefine name to be string | number
type BB = Merge<AA, {
  name: number;
  color: number;
  favorite?: boolean;
}>;
const aTodo2: BB = {
  name: 12,
  color: 99
}
