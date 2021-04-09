# node-lxf
NodeJs 学习笔记   廖雪峰课程

module.exports vs exports

    如果要输出一个键值对象{}，可以利用exports这个已存在的空对象{}，并继续在上面添加新的键值；

    如果要输出一个函数或数组，必须直接对module.exports对象赋值。

    强烈建议使用module.exports = xxx的方式来输出模块变量
global 
    NodeJs 唯一全局对象  === js  Window
process
    NodeJs 进程
    process.version  == node -v
    process.platform  “win32”
    process.arch  "x64"
    process.cwd()  '当前工作目录'  // d:\\nodejs\\node-lxf
    process.chdir('/nodejs/gits')  //切换当前工作目录
NodeJs 常见框架
    常见的Web框架包括：Express，Sails.js，koa，Meteor，DerbyJS，Total.js，restify……
        express 是第一代流行的web框架  基于ECMA5
        koa 是Express的下一代基于Node.js的web框架  基于ECMA6
        koa2 基于ECMA7 特点： async  异步调用

    ORM框架比Web框架要少一些：Sequelize，ORM2，Bookshelf.js，Objection.js……

    模版引擎PK：Jade，EJS，Swig，Nunjucks，doT.js……

    测试框架包括：Mocha，Expresso，Unit.js，Karma……

    构建工具有：Grunt，Gulp，Webpack……