/** ===============================================
 * 类
 *   TypeScript的核心原则之一是对值所具有的结构进行类型检查。
 *   它有时被称做“鸭式辨型法”或“结构性子类型化”。
 *   在TypeScript里，接口的作用就是为这些类型命名和为你的代码或第三方代码定义契约。
 * ===============================================  */

interface IAnimal {
  name: string;

  [propName: string]: any
}

// 基类 || 超类
class Animal {
  // 公共属性
  name: string;
  // 公共属性 默认为 public
  public age: number = 5;
  // 私有属性, 不能在声明它的类的外部访问；在派生类(字类)中不可以访问
  private distance: number = 0;
  // 私有属性, 与 private 修饰符很相似，但protected成员在派生类(字类)中仍可以访问
  protected gender: number = 1;
  // 只读属性
  readonly type: string = 'animal';

  // 构造函数
  constructor(props: IAnimal) {
    this.name = props.name
  };

  // 方法
  getName(): string {
    return this.name
  };

  move(distance: number = 0) {
    this.distance += distance;
    console.log(`${this.name} moved ${distance}`)
  }
}

// 派生类 || 子类
class Snack extends Animal {
  constructor(props: IAnimal) {
    super(props);
  };

  move(distance: number = 5) {
    console.log(`Slithering...`);
    console.log(this.name);
    // Error: Property 'distance' is private and only accessible within class 'Animal'.
    // console.log(this.distance);
    console.log(this.gender);
    super.move(distance);
  }
}

// 派生类 || 字类
class Horse extends Animal {
  constructor(props: IAnimal) {
    super(props);
  };

  move(distance: number = 10) {
    console.log(`Galloping...`);
    super.move(distance);
  }
}


let snack = new Snack({name: 'lucy'});
let horse = new Horse({name: 'timi', gender: 1});

console.log(snack.getName());
console.log(snack.name);

console.log(horse.getName());
console.log(horse.name);
console.log(horse.age);
// Error: Property 'distance' is private and only accessible within class 'Animal'.
// console.log(snack.distance);
// Error: Property 'gender' is protected and only accessible within class 'Animal' and its subclasses.
// console.log(horse.gender);

/** ===============================================
 * 类-存取器
 * ===============================================  */
class Employee {
  // 私有属性, 不能在声明它的类的外部访问；在派生类(字类)中不可以访问
  private passCode: string = 'secret';
  name: string;

  get fullName(): string {
    return this.name
  }

  set fullName(name: string) {
    if (this.passCode === 'secret') {
      this.name = name;
    } else {
      console.log('Error: Unauthorized update of employee!')
    }
  }
}

let employee = new Employee();
employee.name = 'Bob Smith';
if (employee.name) {
  console.log(employee.name);
  // Error: Property 'passCode' is private and only accessible within class 'Employee'.
  // console.log(employee.passCode);
}


/** ===============================================
 * 类-静态属性
 * 仅当类被实例化的时候才会被初始化的属性。
 * 我们也可以创建类的静态成员，这些属性存在于类本身上面而不是类的实例上。
 * 类有两部分：静态部分和实例部分。
 * ===============================================  */
class Grid {
  static origin = {
    x: 0,
    y: 0
  };
  scale: number = 1;

  constructor(scale: number) {
    this.scale = scale;
  }

  calculateDistance(point: { x: number, y: number }) {
    let xDist = (point.x - Grid.origin.x);
    let yDist = (point.y - Grid.origin.y);
    return Math.sqrt(xDist * xDist + yDist * yDist) / this.scale;
  }
}

let grid1 = new Grid(1.0);
console.log(grid1.calculateDistance({x: 1, y: 2}));