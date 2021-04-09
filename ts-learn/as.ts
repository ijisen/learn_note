/**
 * 类型断言
 *  类型断言（Type Assertions）可以用来手动指定一个值的类型。
 *  1.联合类型可以被断言为其中一个类型
 *  2.父类可以被断言为子类
 *  3.任何类型都可以被断言为  as any (window as any).foo = 1
 *  4. any 可以被断言为任何类型
 **/

interface iCat {
  name: string;
  run(): void
}

interface iFish {
  name: string;
  swim(): void;
}

function getName(animal: iCat | iFish) {
  return typeof (animal as iFish).swim === 'function';

}

getName({
  name: 'jisen',
  run: function () {
    console.log('cat')
  }
});

/**
 * ps: 类型断言只能够「欺骗」TypeScript 编译器，无法避免运行时的错误，
 *        反而滥用类型断言可能会导致运行时错误
 * */
function swim(animal: Cat | iFish) {
  (animal as iFish).swim();
}

// 例子编译时不会报错，但在运行时会报错：
// Uncaught TypeError: animal.swim is not a function`
swim({
  name: 'Tom',
  run() { console.log('run') }
});

class ApiError extends Error {
  code: number = 0;
}

class HttpError extends Error {
  statusCode: number = 200;
}

function isApiError(error: Error) {
  return typeof (error as HttpError).statusCode === 'number';
}

interface Animal {
  name: string;
}

interface Cat {
  name: string;

  run(): void;
}

function testAnimal(animal: Animal) {
  return (animal as Cat);
}

function testCat(cat: Cat) {
  return (cat as Animal);
}

testAnimal({
  name: 'cat'
});

/**
 * 将 any 断言为一个具体的类型
 * */
function getCacheData(key: string): any {
  return (window as any).cache[key];
}

interface Cat {
  name: string;
  run(): void;
}

const tom = getCacheData('tom') as Cat;
tom.run();