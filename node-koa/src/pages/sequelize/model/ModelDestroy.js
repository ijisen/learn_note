/** ==================================
 *   删除实例
 *   删除数据 delete
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
    // 偏执表
    // If true, only non-deleted records will be returned.
    // If false, both deleted and non-deleted records will be returned.
    // Only applies if options.paranoid is true for the model.
    paranoid: true,
  });


// 按条件删除数据
const modelDestroy = () => {
  (async () => {
    const result = await UserManage.destroy({
      where: {
        id: {
          [Op.or]: [1]
        },
      },
      // 强制删除，针对 paranoid === true
      force: true
    });
    if (result > 0) {
      console.log(`删除成功 ${result}`)
    } else {
      console.log(`删除失败 ${result}`);
    }
  })();
};

// 按条件查询数据
const modelQuery = () => {
  (async () => {
    const result = await UserManage.findAll({
      where: {
        deletedAt: {
          [Op.not]: null
        }
      },
      attributes: [
        'id',
        [sequelize.fn('concat',
          sequelize.col('lastName'),
          sequelize.col('firstName')), 'userName'],
        'age',
        'deletedAt'
      ]
    });
    console.log(JSON.stringify(result));
  })();
};

sequelize.authenticate().then(() => {
  // modelSync();
  // modelInstances();
  modelQuery();
  console.log(`connection database success`);
}).catch(e => {
  console.log(e);
});
