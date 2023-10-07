package lesson.Day03_00_Method;

/**
 * java 中的叫方法， 不叫函数；
 * 对应js的函数
 * -- 方法必须定义在类当中，方法定义顺序没有先后之说
 * -- 形参是局部变量
 */

public class Method {
    /**
     * 程序入口声明方式说明：
     * public static: 修饰符列表
     * -- public 表示公开的
     * -- static 表示静态的
     * void： 表示方法执行结束后返回的数据类型
     * main: 方法名，主方法
     * String[]: 是一种引用数据类型
     * args： 是一种局部变量参数名称
     * ps: main主方法是固定形式，不可自定义
     */
    public static void main(String[] args) {
        Method.sumInt(2, 5);
    }

    // 求和方法

    /**
     * public static： 修饰符列表
     * void： 返回数据类型
     * int a / int b: 形参
     * {}: 方法体
     * sumInt(23,23): 实参
     */
    public static void sumInt(int num1, int num2) {
        int count = num1 + num2;
        System.out.println(count);
    }
}