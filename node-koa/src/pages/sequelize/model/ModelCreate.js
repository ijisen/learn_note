/** ==================================
 *   创建实例
 *   create 创建单个实例
 *   bulkCreate 创建多个实例
 * ==================================*/
const {DataTypes, Op} = require('sequelize');
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
const modelCreate = () => {
  (async () => {
    const result = await UserManage.create({
      firstName: '三',
      lastName: '张',
      age: 18
    });
    console.log(JSON.stringify(result));
  })();
};

// 创建多个实例
const modelCreateMultiple = () => {
  (async () => {
    const result = await UserManage.bulkCreate([
      {
        firstName: '四',
        lastName: '李',
        age: 18
      },
      {
        firstName: '五',
        lastName: '王',
        age: 28
      }
    ], {
      // 创建多个实例时，bulkCreate不会去校验数据，
      // 配置 validate===true强制去校验，但会降低性能，不推荐
      validate: true
    });
    console.log(JSON.stringify(result));
  })();
};

sequelize.authenticate().then(() => {
  modelCreateMultiple();
  console.log(`connection database success`);
}).catch(e => {
  console.log(e);
});
