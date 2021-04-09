/** ===============================================
 * 泛型【Generics】
 *
 * ===============================================  */
function identity(arg) {
    // Property 'length' does not exist on type 'T'.
    // console.log(arg.length);
    return arg;
}
// 申明类型
var input = identity('input');
// 利用类型推论，编译器自动判断类型
var output = identity('output');
var inputNumber = identity(10);
function loggingIdentity(arg) {
    console.log(arg.length);
    return arg;
}
var strLogInput = identity('input');
var arrLogInput = identity([1, 2, 3]);
var numberLogInput = identity(1);
