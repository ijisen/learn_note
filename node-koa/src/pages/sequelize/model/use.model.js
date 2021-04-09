/** ******************************
 * 模型【model】是 Sequelize 的本质. 模型是代表数据库中表的抽象.
 * 在 Sequelize 中,它是一个 Model 的扩展类.
 * */

const {DataTypes, Model} = require('sequelize');
const {sequelize, closeDb} = require('../sequelize.mysql');

// 扩展Model
class userManage extends Model {
}

userManage.init({
  firstName: {
    type: DataTypes.STRING,
    allowNull: false
  },
  lastName: {
    type: DataTypes.STRING
  }
}, {
  // 这是其他模型参数
  // 我们需要传递连接实例
  sequelize,
  // 我们需要选择模型名称
  // 申明modelName， 数据库表明 === modelName；
  // 申明modelName，数据库表名 === users
  // 不申明modelName，数据库表名 === userManages
  // modelName: 'User'
});

// `sequelize.define` 会返回模型
console.log(userManage === sequelize.models.userManage);

sequelize.authenticate().then(() => {
  // 将创建表,如果表已经存在,则将其首先删除
  userManage.sync({force: true}).then(() => {
    closeDb();
  }).catch((e) => {
    console.error(`Unable create table the database, ${e}`);
    closeDb();
  });
}).catch(e => {
  console.error(`Unable to connect to the database, ${e}`)
});

