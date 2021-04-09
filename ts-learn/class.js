/** ===============================================
 * 类
 *   TypeScript的核心原则之一是对值所具有的结构进行类型检查。
 *   它有时被称做“鸭式辨型法”或“结构性子类型化”。
 *   在TypeScript里，接口的作用就是为这些类型命名和为你的代码或第三方代码定义契约。
 * ===============================================  */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// 基类 || 超类
var Animal = /** @class */ (function () {
    // 构造函数
    function Animal(props) {
        // 公共属性 默认为 public
        this.age = 5;
        // 私有属性, 不能在声明它的类的外部访问；在派生类(字类)中不可以访问
        this.distance = 0;
        // 私有属性, 与 private 修饰符很相似，但protected成员在派生类(字类)中仍可以访问
        this.gender = 1;
        // 只读属性
        this.type = 'animal';
        this.name = props.name;
    }
    ;
    // 方法
    Animal.prototype.getName = function () {
        return this.name;
    };
    ;
    Animal.prototype.move = function (distance) {
        if (distance === void 0) { distance = 0; }
        this.distance += distance;
        console.log(this.name + " moved " + distance);
    };
    return Animal;
}());
// 派生类 || 子类
var Snack = /** @class */ (function (_super) {
    __extends(Snack, _super);
    function Snack(props) {
        return _super.call(this, props) || this;
    }
    ;
    Snack.prototype.move = function (distance) {
        if (distance === void 0) { distance = 5; }
        console.log("Slithering...");
        console.log(this.name);
        // Error: Property 'distance' is private and only accessible within class 'Animal'.
        // console.log(this.distance);
        console.log(this.gender);
        _super.prototype.move.call(this, distance);
    };
    return Snack;
}(Animal));
// 派生类 || 字类
var Horse = /** @class */ (function (_super) {
    __extends(Horse, _super);
    function Horse(props) {
        return _super.call(this, props) || this;
    }
    ;
    Horse.prototype.move = function (distance) {
        if (distance === void 0) { distance = 10; }
        console.log("Galloping...");
        _super.prototype.move.call(this, distance);
    };
    return Horse;
}(Animal));
var snack = new Snack({ name: 'lucy' });
var horse = new Horse({ name: 'timi', gender: 1 });
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
var Employee = /** @class */ (function () {
    function Employee() {
        // 私有属性, 不能在声明它的类的外部访问；在派生类(字类)中不可以访问
        this.passCode = 'secret';
    }
    Object.defineProperty(Employee.prototype, "fullName", {
        get: function () {
            return this.name;
        },
        set: function (name) {
            if (this.passCode === 'secret') {
                this.name = name;
            }
            else {
                console.log('Error: Unauthorized update of employee!');
            }
        },
        enumerable: false,
        configurable: true
    });
    return Employee;
}());
var employee = new Employee();
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
 * ===============================================  */
var Grid = /** @class */ (function () {
    function Grid(scale) {
        this.scale = 1;
        this.scale = scale;
    }
    Grid.prototype.calculateDistance = function (point) {
        var xDist = (point.x - Grid.origin.x);
        var yDist = (point.y - Grid.origin.y);
        return Math.sqrt(xDist * xDist + yDist * yDist) / this.scale;
    };
    Grid.origin = {
        x: 0,
        y: 0
    };
    return Grid;
}());
var grid1 = new Grid(1.0);
console.log(grid1.calculateDistance({ x: 1, y: 2 }));
