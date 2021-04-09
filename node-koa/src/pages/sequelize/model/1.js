/** ==================================
 *   关联DEMO
 *
 * ==================================*/
const {DataTypes, Op} = require('sequelize');
const {sequelize} = require('../sequelize.mysql');
const closeDb = () => {
  sequelize.close().then(() => {
    console.log(`connection has been closed`)
  }).catch(e => {
    console.log(`Unable to close the database ${e}`)
  });
};

const option = {
  paranoid: true,
  timestamps: true
};
const Product = sequelize.define('Product', {
  productId: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  title: DataTypes.STRING
}, option);

const User = sequelize.define('User', {
  userId: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  name: DataTypes.STRING
}, option);

const Address = sequelize.define('Address', {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  address: DataTypes.STRING,
  tel: DataTypes.STRING
}, option);


Product.User = Product.belongsTo(User, {
  // 可选参数 RESTRICT, CASCADE, NO ACTION, SET DEFAULT 和 SET NULL.
  onDelete: 'RESTRICT',
  onUpdate: 'RESTRICT',
  foreignKey: {
    name: 'userId',
    // 允许外键为空
    // allowNull: false
  }
});
User.Address = User.hasMany(Address, {
  // 可选参数 RESTRICT, CASCADE, NO ACTION, SET DEFAULT 和 SET NULL.
  onDelete: 'RESTRICT',
  onUpdate: 'RESTRICT',
  foreignKey: {
    name: 'userId',
    // 允许外键为空
    // allowNull: false
  }
});

const createTable = () => {
  User.sync({force: true}).then(() => {
    closeDb();
  }).catch((e) => {
    console.error(`Unable create table the database, ${e}`);
    closeDb();
  });
};

const createData = () => {
  (async () => {
    const result = await Product.create(
      {
        title: 'apple',
        userId: 2,
        user: {
          userId: 2,
          name: 'jisen',
          address: [
            {
              userId: 1,
              address: '四川',
              tel: '125152101'
            }
          ]
        },
        // fooId: DataTypes.UUIDV4
      }, {
        include: [{
          association: Product.User,
          include: [ User.Address ]
        }]
      });
    console.log(JSON.stringify(result));
  })();
};


sequelize.authenticate().then(() => {
  // createTable();
  createData();
  // manyToMany();
  console.log(`connection database success`);
}).catch(e => {
  console.log(e);
});
