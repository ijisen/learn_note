package lesson.Day08_Opp_Constructor;

public class User {
    /**
     * 缺省构造器
     */
    public User() {
        System.out.println("缺省构造器, 会自动执行");
    }

    /** 方法重载 */
    public User(int age) {
        System.out.println("缺省构造器, 会自动执行。获取 AGE 参数：" + age);
    }

    /** 方法重载 */
    public User(String name) {
        System.out.println("缺省构造器, 会自动执行。获取 NAME 参数：" + name);
    }

}
