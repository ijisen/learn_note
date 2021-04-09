/** ==================================
 *   关联【Associations】
 *   Sequelize 支持标准关联关系： One-To-One【一对一】, One-To-Many【一对多】, Many-To-Many【多对多】
 *   Sequelize 提供了 四种 关联类型：
 *     HasOne        关联类型
 *     BelongsTo     关联类型
 *     HasMany       关联类型
 *     BelongsToMany 关联类型
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


const A = sequelize.define('A', {});
const B = sequelize.define('B', {});
const C = sequelize.define('C', {});
const D = sequelize.define('D', {});
const E = sequelize.define('E', {});
const F = sequelize.define('F', {});

// A 有一个 B
// A 称为 源 模型
// B 称为 目标 模型
// 外键在目标模型【B】中定义
A.hasOne(B, {});
// B属于A
// A B之间存在一对一的关系
// A 称为 源 模型
// B 称为 目标 模型
// 外键在源模型【A】中定义
A.belongsTo(C, {});
// A 有多个C
// A D 之间存在一对多的关系
// A 称为 源 模型
// D 称为 目标 模型
// 外键在目标模型【D】中定义
A.hasMany(D, {});
// E 有多个属于A，通过联接表【junction table】 C
//  多对多【Many-To-Many】的关系
// through 是必填项
A.belongsToMany(E, {through: 'F'});

/**
 * Sequelize 关联通常成对定义
 * 创建一个 一对一 关系, hasOne 和 belongsTo 关联一起使用;
 * 创建一个 一对多 关系, hasMany he belongsTo 关联一起使用;
 * 创建一个 多对多 关系, 两个 belongsToMany 调用一起使用
 * */
const Foo = sequelize.define('Foo', {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  name: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  fooId: {
    type: DataTypes.UUID,
    defaultValue: DataTypes.UUIDV4
  }
});
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
Foo.hasOne(Bar, {
  // 可选参数 RESTRICT, CASCADE, NO ACTION, SET DEFAULT 和 SET NULL.
  onDelete: 'RESTRICT',
  onUpdate: 'RESTRICT',
  foreignKey: {
    name: 'fooId',
    type: DataTypes.UUID,
    defaultValue: DataTypes.UUIDV4,
    // 允许外键为空
    // allowNull: false
  }
});
Bar.belongsTo(Foo);

const createTable = () => {
  // 将创建表,如果表已经存在,则将其首先删除
  // 创建Foo时，会自动创建Bar
  Foo.sync({force: true}).then(() => {
    closeDb();
  }).catch((e) => {
    console.error(`Unable create table the database, ${e}`);
    closeDb();
  });
};

const manyToMany = () => {
  const Movie = sequelize.define('Movie', { name: DataTypes.STRING });
  const Actor = sequelize.define('Actor', { name: DataTypes.STRING });
  const ActorMovies = sequelize.define('ActorMovies', {
    MovieId: {
      type: DataTypes.INTEGER,
      references: {
        model: Movie, // 'Movies' 也可以使用
        key: 'id'
      }
    },
    ActorId: {
      type: DataTypes.INTEGER,
      references: {
        model: Actor, // 'Actors' 也可以使用
        key: 'id'
      }
    }
  });
  Movie.belongsToMany(Actor, { through: 'ActorMovies' });
  Actor.belongsToMany(Movie, { through: 'ActorMovies' });
  Movie.sync({force: true}).then(() => {
    closeDb();
  }).catch((e) => {
    console.error(`Unable create table the database, ${e}`);
    closeDb();
  });
  (async () => {
    const result = await Foo.create(
      {
        name: '张三',
        // fooId: DataTypes.UUIDV4
      });
    console.log(JSON.stringify(result));
  })();
};

const modelCreate = () => {
  (async () => {
    const result = await Foo.create(
      {
        name: 'jisen',
      });
    console.log(JSON.stringify(result));
  })();
};


sequelize.authenticate().then(() => {
  // createTable();
  modelCreate();
  // manyToMany();
  console.log(`connection database success`);
}).catch(e => {
  console.log(e);
});
