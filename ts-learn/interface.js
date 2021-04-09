/** ===============================================
 * 接口
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
function printLabel(labelObj) {
    console.log(labelObj.name);
    return "my name is " + labelObj.name + ", i'm " + labelObj.age;
}
var myObj = { name: 'timi', gender: 1, fn: '123' };
printLabel(myObj);
var Animal = /** @class */ (function () {
    function Animal() {
    }
    return Animal;
}());
var Dog = /** @class */ (function (_super) {
    __extends(Dog, _super);
    function Dog() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Dog;
}(Animal));
