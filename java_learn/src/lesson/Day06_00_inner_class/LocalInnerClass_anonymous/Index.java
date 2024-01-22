package lesson.Day06_00_inner_class.LocalInnerClass_anonymous;

/**
 * 局部内部类 - 匿名内部类
 * 1、定义再外部类的局部位置，并且没有类名称
 * 什么时候用：
 * 1、 该类只使用一次
 * 特点：
 * 1、可以访问外部类的所有属性和方法，包括私有属性
 * 2、匿名内部类不能添加修饰符，因为本身就是局部变量
 * 3、作用域范围 {}
 * 4、外部不能直接访问匿名内部类
 * 5、外部成员与匿名内部类成员同名时，就近原则
 * */
public class Index {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.anonymous();
    }
}
