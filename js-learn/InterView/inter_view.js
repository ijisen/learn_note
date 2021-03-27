/** ==========================
 *       【interView 面试题】
 *  ========================== */

/** --------- for 循环 ---------*/
// eg1
let a = [];
for (var i = 0; i < 10; i++) {
  a[i] = function () {
    console.log(i)
  }
}
a[6](); // 10

// eg2
for (var n = 0; n < 10; n++) {
  a[n] = (function (n) {
    return n
  })(n)
}
a[6]; // 6

// eg3
for (let k = 0; k < 10; k++) {
  a[k] = function () {
    console.log(k)
  }
}
a[6](); // 6;