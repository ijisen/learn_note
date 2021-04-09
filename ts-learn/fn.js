/**
 * 函数声明(Function Declaration)
 * */
// 一个函数有输入和输出，要在 TypeScript 中对其进行约束，需要把输入和输出都考虑到，
function sum(x, y) {
    return x + y;
}
console.log(sum(5, 6));
/**
 * 函数表达式(Function Expression)
 * TypeScript => 用来表示函数的定义，左边是输入类型，需要用括号括起来，右边是输出类型
 * ES6 => 叫做箭头函数
 * */
// total 未定义类型，而是类型推论
var total = function (x, y) {
    return x + y;
};
var mySum = function (x, y) {
    return x + y;
};
var mySumEs6 = function (x, y) {
    return x + y;
};
console.log(total(5, 7));
console.log(mySum(5, 7));
console.log(mySumEs6(5, 7));
var count = function (x, y) {
    return x + y;
};
console.log(count(5, 7));
var helloWord = function (name, gender, age) {
    if (age) {
        return "my name is " + name + ", i'm " + (gender ? 'boy' : 'girl') + ", i'm " + age;
    }
    else {
        return "my name is " + name + ", i'm " + (gender ? 'boy' : 'girl');
    }
};
console.log(helloWord('timi', true, 25));
console.log(helloWord('tom', true));
function buildName(name, age) {
    if (name === void 0) { name = ''; }
    if (age === void 0) { age = 0; }
    return "my name is " + name + ", i'm " + age;
}
function demo(_a) {
    var _b = _a.name, name = _b === void 0 ? '' : _b, _c = _a.age, age = _c === void 0 ? 0 : _c;
    return "my name is " + name + ", i'm " + age;
}
function demod(name, age) {
    if (name === void 0) { name = 'ks'; }
    if (age === void 0) { age = 25; }
    return "my name is " + name + ", i'm " + age;
}
console.log(demo({ name: 'jisen', age: 25 }));
console.log(demod('tom'));
console.log(demod('lucy', 25));
/**
 * 剩余参数
 * */
function push(array) {
    var items = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        items[_i - 1] = arguments[_i];
    }
    items.forEach(function (item) {
        array.push(item);
    });
}
var a = [];
push(a, 1, 2, 3);
function democ() {
    var items = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        items[_i] = arguments[_i];
    }
    var _array = [];
    items.forEach(function (item) {
        _array.push(item);
    });
    return _array;
}
democ(1, 2, 3, 4, 6, 7);
function reverse(x) {
    if (typeof x === 'number') {
        return 'number';
    }
    else {
        return 'string';
    }
}
