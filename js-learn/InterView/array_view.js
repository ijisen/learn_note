/** =================
 *       【Array】
 *  ================= */

/** ====== Array 技巧 ===== */
// ... 扩展运算符
/** ------取最大值------ */
let arr = [14, 3, 12, 5];
// es5 写法
Math.max.apply(null, arr);
// es6 写法
Math.max(...arr);

/** ----数组合并----- */
let arr_a = [1, 2, 3, 4];
let arr_b = [5, 1, 2, 4];
// 原生API
arr_a.concat(arr_b);
// es5 apply
Array.prototype.push.apply(arr_a, arr_b);
// es6 写法， 会去重
arr_a.push(...[arr_b]);