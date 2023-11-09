package lesson.Day04_025_Class_Extends;

/**
 * 继承 extends
 * 1、面向对象的三大特征：
 * 封装【encapsulation】
 * 继承【extend】
 * 多态【Polymorphic】
 * 2、java语言中的继承只支持【单继承】;
 * 3、B类继承 A类
 * ----> A类称为： 父类、基类、超类、superclass
 * ----> B类称为： 子类、派生类、subclass
 * 4、 类继承注意事项
 * ----> 1）私有的不支持继承,不能直接访问
 * ----> 2）构造方法不支持继承，得使用 super 调用父类构造方法
 * ----> 3) 如果子类中有构造方法， 会自动调用父类的构造方法，调用方式 super();
 * --------> ps: 每一个类中都有一个默认的无参构造方法
 * ----> 4）父类中有有参构造方法且没有无参构造方法时， 子类构造中必须调用super传参给父类  eg： demo2
 * ----> 5）super() === this() 二选一使用，必须放第一行
 * ----> 6) 类最终继承的是Object
 * 5、 类在没有继承的情况下；默认继承 java.lang.Object
 * 6、 语法
 * ----> class B extends A {}
 */
public class Index {
}
