/** ================
 *    log 封装方法
 * ================= */

function logs () {
  // console.log.apply(null, arguments)
  console.log.apply(this, arguments)
}
logs(1, 2, 3, 4);

// es6 对象解构赋值， log不能更改
let { log } = console;
log(1, 2, 3, 4);