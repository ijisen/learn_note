package lesson.Day06_00_inner_class.LocalInnerClass;
/**
 * 局部内部类
 * 1、局部内部类，可以访问外部类的所有属性和方法，包括私有属性
 * 2、局部内部类的作用域仅在他的方法或代码块中， 即 {}，外部无法访问到
 * 3、局部内部类不能添加修饰符，但可以用 final 修饰， 因为局部变量可以用final修饰
 * 4、局部内调用得放到申明后面
 * 5、外部类中如何使用局部内部类方法？
 * --> 在外部类方法中， 直接实例化局部内部类， 执行方法 或 return
 * 局部内部类访问外部类的属性和方法 外部类名+this.属性或方法名
 */
public class Index {
    public static void main(String[] args) {
        Outer outer = new Outer();
    }
}
