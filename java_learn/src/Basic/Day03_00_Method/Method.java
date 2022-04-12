package Basic.Day03_00_Method;

/**
 * java 中叫方法， 不叫函数
 * -- 方法必须定义在类当中， 方法定义顺序没有先后顺序
 * -- 形参是局部变量
 */
public class Method {
    /**
     * 程序入口声明方式说明
     * public static： 修饰符列表
     * --  public 表示公开的
     * --  static 表示静态的
     * void： 表示方法执行结束后不需要返回数据
     * main： 方法名，主方法
     * String[]: 是一种引用数据类型
     * args： 是一个局部变量的变量名
     * ps:主方法就是这样的固定格式,不可自定义
     */
    public static void main(String[] args) {
        sumInt(10, 20);
        Method.sumInt(20, 20);
    }

    // 求和方法

    /**
     * public static： 修饰符列表
     * void： 方法返回数据类型 void 即不反回任何数据
     * sumInt：  方法名\
     * (int a \ int b) ： 形参
     * {} : 方法体, 方法体由java语句构成，以 ; 结束
     * sumInt(20, 20) ： 实参
     */
    public static void sumInt(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public static boolean isExit(int a) {
        return a > 0;
    }
}

/**
 * 方法重载
 *
 * 方法重载机制只和 方法名称 和 参数列表有关系，
 *
 */

class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.20, 2.40));
    }

    public static int sum(int a, int b) {
        System.out.println("sum float");
        return a + b;
    }

    public static double sum(double a, double b) {
        System.out.println("sum int");
        return a + b;
    }
}
