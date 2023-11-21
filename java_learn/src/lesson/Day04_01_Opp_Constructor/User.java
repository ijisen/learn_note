package lesson.Day04_01_Opp_Constructor;

/**
 * User 构造器【构造方法】 constructor
 * 1、构造器方法名和类名必须相同
 * 2、构造器不能有返回值
 * 3、在创建对象时，系统会自动调用该类的构造器，完成对象的初始化
 *
 * 作用：
 *  完成新对象的初始化
 *
 * */
public class User {
    /**
     * 缺省构造器
     */
    public User() {
        System.out.println("缺省构造器, 会自动执行");
    }

    /** 方法重载构造器 */
    public User(int age) {
        System.out.println("缺省构造器, 会自动执行。获取 AGE 参数：" + age);
    }

    /** 方法重载 构造器*/
    public User(String name) {
        System.out.println("缺省构造器, 会自动执行。获取 NAME 参数：" + name);
    }

}
