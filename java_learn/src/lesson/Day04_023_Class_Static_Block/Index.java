package lesson.Day04_023_Class_Static_Block;

/**
 * 静态代码块
 * static { System.out.println("类加载-->1"); }
 * 1. 语法格式：
 * 2. 静态代码块有且只执行一次
 * 3. 静态代码块可以编写多个，且自上而下执行。
 * <p>
 * 静态代码块的作用
 * --> 1、 程序执行前需要加载的东西，eg： 调用日志、初始化连接池、解析XML配置文件
 */
public class Index {
    // 构造函数
    public Index() {
        // 1、super() 执行父类
        // 2、执行本类的普通代码块
        System.out.println("Polymorphic");
    }

    // 静态代码块
    static {
        System.out.println("静态代码块-->1");
    }

    // 静态代码块
    static {
        System.out.println("静态代码块-->2");
    }

    // 实例代码块
    {
        System.out.println("实例代码块-->1");
    }

    // 实例代码块
    {
        System.out.println("实例代码块-->2");
    }

    // 【重点】静态代码块和静态属性初始化优先级一样，主要看代码定义顺序
    // 【静态属性初始化】
    public static int age = getAge();

    // 【静态代码块】
    static {
        System.out.println("静态代码块--> 3");
    }

    // 静态方法
    public static int getAge() {
        System.out.println("静态属性初始化--> 4");
        return 20;
    }

    // 【重点】普通代码块和普通属性初始化优先级一样，主要看代码定义顺序
    // 普通属性初始化
    public int no = getNo();

    // 普通代码块|实例代码块
    {
        System.out.println("实例代码块--> 3");
    }

    // 普通方法
    public int getNo () {
        System.out.println("普通属性初始化--> 4");
        return 20;
    }

    // 主方法
    public static void main(String[] arg) {
        System.out.println("main ");
        // 构造函数执行一次， 实例代码块就执行一次
        new Index();
        //        new Index();
    }
}
