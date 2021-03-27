/** ===========================
 *       【closure 闭包】
 *  =========================== */
/**
 * 定义：闭包可以让一个函数访问并操作其声明时的作用域中的变量和函数，
 *       并且即使声明时的作用域消失了，也可以调用
 * 应用：
 *    1. 私有变量
 *    2. 回调与计时器
 *    3. 绑定函数上下文
 *    4. 偏应用函数
 *    5. 函数重载：缓存记忆、函数包装
 *    6. 即时函数：独立作用域、简洁代码、循环、类库包装、通过参数限制作用域内的名称
 * */

// 封装私有变量
function Classname () {
  this.name = 'jisen';
  this.getName = () =>{
    return this.name
  };
  this.setName = (name) => {
    this.name = name
  }
}
var cln = new Classname();
cln.getName();