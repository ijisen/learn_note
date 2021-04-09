/** ==================================
 *   模型查询【Model Querying】
 *   增删改查【CRUD】 create_read_update_delete
 * ==================================*/
const {DataTypes, Op} = require('sequelize');
const {sequelize} = require('../sequelize.mysql');

const UserManage = sequelize.define('UserManage',
  {
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
    paranoid: true,
  });

// 模型同步（创建表）
const modelSync = () => {
  UserManage.sync()
};

// 删除表
const droppingTables = () => {
  UserManage.drop();
};

// 模型实例（写入数据）
const modelInstances = () => {
  (async () => {
    const result = await UserManage.create({
      firstName: '冬梅',
      lastName: '马',
      age: 22,
      gender: 'female'
    });
    // console.log(result);
  })();
};

const modelQuery = () => {
  (async () => {
    // 读取所有数据
    // const result = await UserManage.findAll();

    // 按条件读取数据
    /*const result = await UserManage.findAll({
      where: {
        authorId: 12
        status: 'active'
      }
      // 只返回 id、firstName、lastName 字段
      // 将gender字段改成sex返回
      attributes: {
        include: [
          'id',
          [sequelize.fn('concat',
            sequelize.col('lastName'),
            sequelize.col('firstName')), 'userName'],
          'age'
        ],
        // 排除某些属性
        exclude: ['firstName', 'lastName', 'createdAt', 'updatedAt', 'deletedAt']
      }
    });*/
    // 按条件查询
    const result = await UserManage.findAll({
      // 查询条件： firstName包含ame 或者 gender===female
      where: {
       /* [Op.or]: [
          { authorId: 12 },
          { authorId: 13 }
        ],*/
      /*  authorId: {
          [Op.or]: [12, 13]
        },*/
        [Op.or]: [
          {
            firstName: {
              [Op.like]: `%name%`
            }
          },
          // {gender: 'female'},
          // 等价于 {gender: 'female'},
          {
            gender: {
              [Op.eq]: 'female'
            }
          }
        ],
      },
      // 只返回 id、firstName、lastName 字段
      // 将gender字段改成sex返回
      attributes: [
        'id',
        [sequelize.fn('concat',
          sequelize.col('lastName'),
          sequelize.col('firstName')), 'userName'],
        'age'
      ]
    });
    // console.log(JSON.stringify(result, null, 2));
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
