package lesson.day04_static;

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
public class Static_Block {
    // 构造函数
    public Static_Block() {
        System.out.println("Static_Block");
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

    // 主方法
    public static void main(String arg[]) {
        System.out.println("main ");
        // 构造函数执行一次， 实例代码块就执行一次
        new Static_Block();
        new Static_Block();
    }
}
