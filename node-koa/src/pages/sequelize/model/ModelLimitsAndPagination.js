/** ==================================
 *   限制和分页 ModelLimitsAndPagination
 *   create 创建单个实例
 *   bulkCreate 创建多个实例
 * ==================================*/
const {DataTypes} = require('sequelize');
const {sequelize} = require('../sequelize.mysql');

const UserManage = sequelize.define('UserManage', {
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
    gender: {
      type: DataTypes.TEXT,
      defaultValue: 'male'
    },
    age: {
      type: DataTypes.INTEGER,
      allowNull: false,
    },
  },
  {
    timestamps: true,
    // If true, only non-deleted records will be returned.
    // If false, both deleted and non-deleted records will be returned.
    // Only applies if options.paranoid is true for the model.
    paranoid: true,
  });


// 创建单个实例
const modelFindAll = () => {
  (async () => {
    const amount = await UserManage.count({
      where: {
        gender: 'male'
      }
    });
    console.log(amount);
    const result = await UserManage.findAll({
      // // 提取10个实例/行
      limit: 2,
      // 跳过1个实例/行
      offset: 1,
      where: {
        gender: 'male'
      },
      attributes: ['lastName', 'age']
    });
    console.log(JSON.stringify(result));
  })();
};


sequelize.authenticate().then(() => {
  modelFindAll();
  console.log(`connection database success`);
}).catch(e => {
  console.log(e);
});
