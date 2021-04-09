/** =============================
 * sequelize 连接 SQLite 数据库
 * SQLite 是一个软件库，实现了自给自足的、无服务器的、零配置的、事务性的 SQL 数据库引擎。
 * SQLite 是在世界上最广泛部署的 SQL 数据库引擎。SQLite 源代码不受版权限制。
 * ============================= */
const {Sequelize} = require('sequelize');


// 方法 1: 传递一个连接 URI
// const sequelize = new Sequelize("sqlite::memory");

// 方法 2: 分别传递参数 (sqlite)
const sequelize = new Sequelize({
  dialect: 'sqlite',
  storage: 'database/database.sqlite',
  options: {
    logging: (...msg) => console.log(msg),
  }
});

const closeDb = () => {
  sequelize.close().then(() => {
    console.log(`connection has been closed`)
  }).catch(e => {
    console.log(`Unable to close the database ${e}`)
  });
};

sequelize.authenticate().then(() => {
  console.log(`connection has been established successfully.`);
  setTimeout(() => {
    closeDb();
  }, 2000)
}).catch(e => {
  {
    console.error(`Unable to connect to the database, ${e}`)
  }
});