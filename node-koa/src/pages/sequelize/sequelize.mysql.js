/** =========================
 * sequelize 连接mysql
 * ==========================*/

const {Sequelize} = require('sequelize');

const db = {
  // 方言： 数据库类型 MySQL || Oracle
  dialect: 'mysql',
  host: 'localhost',
  port: 3306,
  username: "root",
  password: '123456',
  database: 'test',
};

// 方法 1: 传递一个连接 URI
const sequelize = new Sequelize(db); // Postgres 示例

const closeDb = () => {
  sequelize.close().then(() => {
    console.log(`connection has been closed`)
  }).catch(e => {
    console.log(`Unable to close the database ${e}`)
  });
};

sequelize.authenticate().then(() => {
  console.log('----------------------------------------');
  console.log('DATABASE √');
  console.log('    HOST     %s', db.host);
  console.log('    PORT     %s', db.port);
  console.log('    DATABASE %s', db.database);
  console.log('----------------------------------------');
  console.log(`connection has been established successfully.`);
  /*setTimeout(() => {
    closeDb();
  }, 2000)*/
}).catch(e => {
  {
    console.error(`Unable to connect to the database, ${e}`)
  }
});

module.exports = { // eslint-disable-line
  sequelize,
  db,
  closeDb,
};
