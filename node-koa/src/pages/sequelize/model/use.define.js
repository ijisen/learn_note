/** ******************************
 * 模型【model】是 Sequelize 的本质. 模型是代表数据库中表的抽象.
 * 在 Sequelize 中,它是一个 Model 的扩展类.
 * */

const {DataTypes} = require('sequelize');
const {sequelize, closeDb} = require('../sequelize.mysql');

// 使用 sequelize.define: 定义模型
const User = sequelize.define('User', {
  firstName: {
    type: DataTypes.STRING,
    allowNull: false
  },
  lastName: {
    type: DataTypes.STRING
  }
}, {
  // 这是其他模型参数
  // 默认情况下,当未提供表名时,Sequelize 会自动将模型名复数并将其用作表名.
  // 参数停止 Sequelize 执行自动复数化.
  // freezeTableName === false 时，会自动创建users表
  // freezeTableName === true 时，会自动创建user表
  freezeTableName: false,
  timestamps: true,
  // If true, only non-deleted records will be returned.
  // If false, both deleted and non-deleted records will be returned.
  // Only applies if options.paranoid is true for the model.
  paranoid: true,
  // 声明表名
  // tableName: 'Employees'
});

// `sequelize.define` 会返回模型
console.log(User === sequelize.models.User);

sequelize.authenticate().then(() => {
  // 将创建表,如果表已经存在,则将其首先删除
  User.sync({force: true}).then(() => {
    closeDb();
  }).catch((e) => {
    console.error(`Unable create table the database, ${e}`);
    closeDb();
  });
}).catch(e => {
  console.error(`Unable to connect to the database, ${e}`)
});

