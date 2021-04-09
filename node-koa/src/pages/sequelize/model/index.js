/** ******************************
 * 模型【model】
 *    是 Sequelize 的本质. 模型是代表数据库中表的抽象.
 * 通常,模型具有单数名称(例如,User),而表具有复数名称(例如, Users),当然这是完全可配置的.
 *
 * 【模型定义】方法
 * 1.调用 sequelize.define(modelName, attributes, options)
 * 2.扩展 Model 并调用 init(attributes, options)
 *
 * 【表名推断】
 * 默认情况下,当未提供表名时,Sequelize 会自动将模型名复数并将其用作表名.
 * 这种复数是通过称为 inflection 的库在后台完成的,
 *   modeName === Person, tableName === people;
 *   modeName === User, tableName === users;
 *   modeName === ipManage, tableName === ipmanages;
 * 1. 强制表名称等于模型名称
 *      freezeTableName: true
 * 2. 也可以为 sequelize 实例全局定义此行为：
 *    const sequelize = new Sequelize('sqlite::memory:', {
 *      define: {
 *        freezeTableName: true
 *      }
 *    });
 * 3. 直接提供表名:
 *    tableName: 'Employees'
 * 【模型同步】
 *   1. User.sync() - 如果表不存在,则创建该表(如果已经存在,则不执行任何操作)
 *   2. User.sync({ force: true }) - 将创建表,如果表已经存在,则将其首先删除
 *   3. User.sync({ alter: true }) - 将检查数据库中表的当前状态(它具有哪些列,它们的数据类型等),然后在表中进行必要的更改以使其与模型匹配.
 *   一次同步所有模型：
 *     await sequelize.sync({ force: true });
 * 【删除表】
 *    await User.drop();
 *    await sequelize.drop();
 * 【创建实例】
 *   const jane = await User.create({ name: "Jane" });
 *     // Jane 现在存在于数据库中！
 *     console.log(jane instanceof User); // true
 *     console.log(jane.name); // "Jane"
 * 【更新实例】
 *     jane.name = "Ada";
 *     // 数据库中的名称仍然是 "Jane"
 *     // Model.create() 方法是使用 Model.build() 构建未保存实例并使用 instance.save() 保存实例的简写形式.
 *     await jane.save();
 *     // 现在该名称已在数据库中更新为 "Ada"！
 *【删除实例】
 *    const jane = await User.create({ name: "Jane" });
 *    console.log(jane.name); // "Jane"
 *    await jane.destroy();
 *    // 现在该条目已从数据库中删除
 *【重载实例】
 *    const jane = await User.create({ name: "Jane" });
 *    console.log(jane.name); // "Jane"
 *    jane.name = "Ada";
 *    // 数据库中的名称依然是 "Jane"
 *    await jane.reload();
 *    console.log(jane.name); // "Jane"
 *【仅保存部分字段】
 *    const jane = await User.create({ name: "Jane" });
 *    console.log(jane.name); // "Jane"
 *    console.log(jane.favoriteColor); // "green"
 *    jane.name = "Jane II";
 *    jane.favoriteColor = "blue";
 *    await jane.save({ fields: ['name'] });
 *    console.log(jane.name); // "Jane II"
 *    console.log(jane.favoriteColor); // "blue"
 *    // 上面显示为 "blue",因为本地对象将其设置为 "blue",
 *    // 但是在数据库中它仍然是 "green"：
 *    await jane.reload();
 *    console.log(jane.name); // "Jane II"
 *    console.log(jane.favoriteColor); // "green"
 * */

const {DataTypes, Deferrable, Op } = require('sequelize');
const {sequelize} = require('../sequelize.mysql');

const Bar = sequelize.define('Bar', {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  name: {
    type: DataTypes.STRING,
    allowNull: false,
  },
});

// 使用 sequelize.define: 定义模型
const Person = sequelize.define('Person', {
  // autoIncrement 可用于创建 auto_incrementing 整数列
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  firstName: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  lastName: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  uuid: {
    type: DataTypes.UUID,
    defaultValue: DataTypes.UUIDV1,
  },
  myDate: {
    type: DataTypes.DATE,
    defaultValue: DataTypes.NOW,
  },
  // 可以创建外键：
  bar_id: {
    type: DataTypes.INTEGER,
    references: {
      // 这是对另一个模型的参考
      model: Bar,

      // 这是引用模型的列名
      key: 'id',

      // 使用 PostgreSQL,可以通过 Deferrable 类型声明何时检查外键约束.
      deferrable: Deferrable.INITIALLY_IMMEDIATE
      // 参数:
      // - `Deferrable.INITIALLY_IMMEDIATE` - 立即检查外键约束
      // - `Deferrable.INITIALLY_DEFERRED` - 将所有外键约束检查推迟到事务结束
      // - `Deferrable.NOT` - 完全不推迟检查(默认) - 这将不允许你动态更改事务中的规则
    }
  },
}, {
  // 强制表名称等于模型名称
  // freezeTableName === false 时，会自动创建 people 表
  // freezeTableName === true 时，会自动创建 person 表
  freezeTableName: true,
  // 默认情况下,Sequelize 自动向每个模型添加 createdAt 和 updatedAt 字段.
  timestamps: true,
  // 不想要 createdAt
  // createdAt: false,
  // 想要 updatedAt 但是希望名称叫做 updateTimestamp
  // updatedAt: 'updateTimestamp',
  paranoid: false,
  // 声明表名
  // tableName: 'Employees'
});

sequelize.authenticate().then(() => {
  // 将创建表,如果表已经存在,则将其首先删除
  // Bar.sync({force: true});
  // Person.sync({force: true});
  /*Bar.create({
    name: 'jisen'
  })*/
 // sequelize.drop();
}).catch(e => {
  console.error(`Unable to connect to the database, ${e}`)
});

