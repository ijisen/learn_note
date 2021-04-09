/** ==================================
 *   UPDATE 查询
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
    // If true, only non-deleted records will be returned.
    // If false, both deleted and non-deleted records will be returned.
    // Only applies if options.paranoid is true for the model.
    paranoid: true,
  });


// 按条件删除数据
const modelUpdate = () => {
  (async () => {
    const result = await UserManage.update({firstName: 'sen'},{
      where: {
        id: 7,
      },
    });
    if (result && result[0] > 0) {
      console.log(`更新成功`)
    } else {
      console.log(`更新失败`)
    }
    console.log(JSON.stringify(result));
  })();
};

// 按条件查询数据
const modelCreate = () => {
  (async () => {
    const result = await UserManage.create({
      firstName: 'sen',
      lastName: 'ji',
      age: 27
    });
    console.log(JSON.stringify(result));
  })();
};

sequelize.authenticate().then(() => {
  // modelSync();
  // modelCreate();
  modelUpdate();
}).catch(e => {
  console.log(e);
});
