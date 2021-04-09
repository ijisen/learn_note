/** ===============================================
 * 枚举【Enums】
 *  使用枚举我们可以定义一些带名字的常量。
 *  使用枚举可以清晰地表达意图或创建一组有区别的用例。
 *  TypeScript支持数字的和基于字符串的枚举。
 * ===============================================  */
/**
 * 数字枚举【Numeric enums】
 * */
//  Up使用初始化为 1。 其余的成员会从 1开始自动增长。
var Direction;
(function (Direction) {
    Direction[Direction["UP"] = 1] = "UP";
    Direction[Direction["Down"] = 2] = "Down";
    Direction[Direction["Left"] = 3] = "Left";
    Direction[Direction["right"] = 4] = "right";
})(Direction || (Direction = {}));
function changeDirection(recipient, direction) {
    return recipient + " has moved " + direction;
}
changeDirection('jmi', Direction.Down);
/**
 * 字符串枚举【String enums】
 * */
//  在一个字符串枚举里，每个成员都必须用字符串字面量，或另外一个字符串枚举成员进行初始化。
var StringDirection;
(function (StringDirection) {
    StringDirection["UP"] = "up";
    StringDirection["Down"] = "down";
    StringDirection["Left"] = "left";
    StringDirection["Right"] = "right";
})(StringDirection || (StringDirection = {}));
