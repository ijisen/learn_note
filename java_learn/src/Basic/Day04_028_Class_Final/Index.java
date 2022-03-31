package Basic.Day04_028_Class_Final;

/**
 * 关于 final 关键字特性：
 * --》1、final 是一个关键字，表示最终的，不可变的
 * --》2、final 修饰的类 不可被继承
 * --》3、final 修饰的方法 不可被重写
 * --》4、final 修饰的变量，不可重新赋值
 * 使用小技巧：
 * --》1、final 一般与 static 搭配使用修饰实例变量 => 常量
 */
public class Index {
    // 常量名
    static final String COUNTRY = "中国";
    public static final double PI = 3.1415926;
}
