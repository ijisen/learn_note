/**
 * 变量
 * 变量名[标识符]： 数字 字母 下划线 $
 * 申明变量
 * 1.必须申明数据类型
 * 2.必须赋值
 * 3.先申明才能访问，没有变量申明提前
 */
public class Variable {
    // 成员变量
    /**
     * 成员变量申明未赋值时，系统会默认赋值
     * byte,short,0,0
     * float，double: 0.0
     * boolean: false
     * chart: \u000
     * */
    static int id = 0;
    // 成员变量 静态属性
    static int keys = 20;
    // 成员变量 私有属性
    private String userName = null;
    // 成员变量 公共属性
    public boolean gender = false;
    // 成员变量 公共静态属性
    public static int age = 0;

    public static void main(String[] arg) {
        // 局部变量
        int i = 10;
        System.out.print(i);
    }

    /**
     * 变量作用域
     * 块级作用域
     */
    public void variableScope() {
        // 局部变量
        int age = 20;
        // 这里无法访问main里面的方法
        System.out.print(userName);
        // 20
        System.out.print(age);
    }
}

