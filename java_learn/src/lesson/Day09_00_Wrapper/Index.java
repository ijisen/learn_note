package lesson.Day09_00_Wrapper;

/**
 * Wrapper 包装类
 * <p>
 * 针对八种基本定义相应的引用类型-包装类 （就是对基础数据类型的拓展）
 * 基本数据类型      包装类
 * byte             Byte      1   -128-127      0  --> Byte --> 父类： Number
 * short            Short     2   -32768-32767  0  --> Short --> 父类： Number
 * int              Integer   4   -2^32-2^32-1  0  --> Integer --> 父类： Number
 * long             Long      8   -2^64-2^64-1  0  --> Long --> 父类： Number
 * <p>
 * float            Float     4                 0.00f  --> Float --> 父类： Number
 * double           Double    8                 0.0  --> Double --> 父类： Number
 * <p>
 * boolean          Boolean   1   false  --> Boolean --> 父类： Object
 * <p>
 * char             Character      2   0-65535  --> Character --> 父类： Object
 *
 * --> 包装类的常用方法
 * Integer：
 * ----> Integer.MIN_VALUE // 返回最小值
 * ----> Integer.MAX_VALUE // 返回最大值
 * Character：
 * ----> Character.isDigit('a'); //  判断是否为数字
 * ----> Character.isLetter('a'); // 判断是否为字母
 * ----> Character.isUpperCase('a'); // 判断是否为大写字母
 * ----> Character.isLowerCase('a'); // 判断是否为小写字母
 * ----> Character.isWhitespace('a'); // 判断是否为空格
 * ----> Character.toUpperCase('a'); // 转大写字母
 * ----> Character.toLowerCase('A'); // 转小写字母
 */
public class Index {
    public static void main(String[] args) {
        Byte a_byte = 0;
        Short a_short = 32767;
        Integer a_int = 2147483647;
        Long a_long = 5L;
        Float a_float = 0.05F;
        Double a_double = 0.05;
        Boolean a_boolean = true;
        Character a_char = 'a';

        byte b_byte = 0;
        short b_short = 32767;
        int b_int = 2147483647;
        long b_long = 5L;
        float b_float = 0.05f;
        double b_double = 0.05d;
        boolean b_boolean = true;
        char b_char = 'b';

        /**
         * 基本数据类型转包装类（自动装箱）
         * */
        int a_1 = 10;
        // jdk 5 以前
        // Integer a_a = new Integer(a_1);
        // Integer a_a_1 = a_a.valueOf(a_1);
        // 最新方法
        Integer a_a_1 = a_1;
        /**
         * 包装类型转基本数据类型（自动拆箱）
         * */
        // 最新方法, jdk5 以前需要手动处理
        int a_a_2 = a_a_1;

        // 三元运算符得看测一个整体。// 1.0
        System.out.println(true? new Integer(1) : new Double(2.0));


        System.out.println(Integer.MAX_VALUE);

    }
}
