/** ==============================
 *    变量的解构赋值 Destruction
 * =============================== */

/** ------ 数组的解构赋值 ----- */
let [ a, b, c ] = [ 1, 2, 3 ];
console.log(a); // 1
console.log(b); // 2
console.log(c); // 3

// 嵌套数组解构
let [ foo, [ [ bar ], baz ] ] = [ 1, [ [ 2 ], 3 ] ];

// 如果解构不成功 会返回 undefined
let [ x, y ] = [ 'x' ];
console.log(y); // undefined


// 不完全解构； 等号左侧的模式只与右侧的一部分匹配
let [ q, w, e ] = [ 1, 2, 3, 4, 5 ];

// 数组解构默认值
// ps: es6 内部使用严格的===判断一个位置是否有值，只有当一个数组成员 === undefined 才会生效
let [ po = 1, bo = 2, bx = 3 ] = [ , undefined, null ];
console.log(po); // 1
console.log(bo); // 2
console.log(bx); // null

/** ------ 对象的解构赋值 ----- */
let { fo, ba } = { fo: 'foo', ba: 'bar' };
// 对象解构默认值
let { oa = 'oa', ob = 'ob' } = { oa: 'oa1', ob: 'ob1' };
console.log(oa); // oa1
console.log(ob); // ob1

/** ------ 字符串的解构赋值 ----- */
const [ sa, sb, sc ] = 'hello';
console.log(sa); // h
console.log(sb); // e
console.log(sc); // l

/** ------ 数值和布尔值的解构赋值 ----- */
let { toString: sn } = 123;
console.log(sn === Number.prototype.toString); // true

let { toString: str } = true;
console.log(str === Boolean.prototype.toString); // true

/** ------ 函数参数的解构赋值 ----- */
function add([ x, y ]) {
  return x + y;
}

add(1, 2);

function move({ x = 0, y = 0 } = {}) {
  return [ x, y ]
}

move({ x: 3, y: 4 }); // [3, 4]
move({ x: 3 }); // [3, 0]
move({ y: 4 }); // [0, 4]
move(); // [0, 0]

/** ------ 对象解构赋值 ----- */
const props = { role: null };
const {
  userId = 'userId',
  userName = 'userName',
  role = { roleId: 'roleId', roleName: 'roleName' }
} = props || {};

const { roleId, roleName } = role || {};
console.log(userId)
console.log(role)
console.log(roleId)
