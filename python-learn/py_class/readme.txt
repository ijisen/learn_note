面向对象编程
|————— 类（Class） 不可变数据
|      |————— __private_name 类私有变量（private）
|      |————— 子类（Subclass）
|      |————— 被继承的class称为基类、父类或超类（Base class、Super class）。
|————— 实例（Instance）
|————— 判断对象类型，使用type()函数
|————— 判断一个变量是否是某个类型可以用isinstance()： isinstance(obj, Animal)
|————— dir() 获得一个对象的所有属性和方法
|————— getattr(obj, 'name') | getattr(obj, 'z', 404) # 获取属性'z'，如果不存在，返回默认值404
|————— hasattr(obj, 'name')
|————— setattr(obj, 'gender', 'boy')
|————— __slots__ = ('name', 'age') # 用tuple定义允许绑定的属性名称, 限制属性
|————— @property 属性检查 eg: property.py
|————— 多重继承