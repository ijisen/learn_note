/**
 * 类型断言
 *  类型断言（Type Assertion）可以用来手动指定一个值的类型。
 *  联合类型可以被断言为其中一个类型
 *  父类可以被断言为子类
 *  任何类型都可以被断言为 any
 *  any 可以被断言为任何类型
 **/
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
function getName(animal) {
    return typeof animal.swim === 'function';
}
/**
 * ps: 类型断言只能够「欺骗」TypeScript 编译器，无法避免运行时的错误，
 *        反而滥用类型断言可能会导致运行时错误
 * */
function swim(animal) {
    animal.swim();
}
var tom = {
    name: 'Tom',
    run: function () { console.log('run'); }
};
swim(tom);
getName({
    name: 'jisen',
    run: function () {
        console.log('cat');
    }
});
var ApiError = /** @class */ (function (_super) {
    __extends(ApiError, _super);
    function ApiError() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.code = 0;
        return _this;
    }
    return ApiError;
}(Error));
var HttpError = /** @class */ (function (_super) {
    __extends(HttpError, _super);
    function HttpError() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.statusCode = 200;
        return _this;
    }
    return HttpError;
}(Error));
function isApiError(error) {
    return typeof error.statusCode === 'number';
}
function testAnimal(animal) {
    return animal;
}
function testCat(cat) {
    return cat;
}
testAnimal({
    name: 'cat'
});
