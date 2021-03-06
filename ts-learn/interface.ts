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

let myObj = {name: 'timi', gender: 1, fn: '123'};

printLabel(myObj);