package lesson.Day04_028_Class_Final;

/**
 * 关于 final 关键字特性：
 * --》1、final 是一个关键字，表示最终的，不可变的
 * --》2、final 修饰的类 不可被继承
 * --》3、final 修饰的方法 不可被重写
 * --》4、final 修饰的变量，不可重新赋值
 * 使用小技巧：
 * --》1、final 一般与 static 搭配使用修饰实例变量 => 常量, 用大写， 有点类似js的const
 * --》2、final + static 修饰的静态常量，不会引起类加载
 */
public class Index {
    // 实例常量名赋值方式1: 直接赋值
    public final double age = 20;
    // 实例常量名赋值方式2:  构造器里面赋值
    public final double RATE;
    public Index(double rate) {
        RATE = rate;
    }
    // 实例常量名赋值方式3:  实例代码块里面赋值
    public final double RATE2;
    {
        RATE2 = 20;
    }

    // 静态常量赋值1： 直接赋值
    static final String COUNTRY = "中国";
    public static final double PI = 3.1415926;
    // 静态常量赋值2： 静态代码块中赋值
    public static final  double SCORE;
    static  {
        SCORE =80;
    }
}

/**
 * final 类
 * 可以实例化，即 new A()
 * */
final class A {

}