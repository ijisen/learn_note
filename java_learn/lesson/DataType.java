/**
 * 数据类型
 * 申明不同的数据类型，分配的空间不一样
 * 基本数据类型【原始数据类型】
 * 第一类： Integer【整数型】
 * ------- 数据类型 ------- 占用空间大小【单位：子节】
 *          byte               1 【-128 - 127】
 *          short              2 【-32768 - 32767】
 *          int                4 【-2147483648 - 2147483647】
 *          long               8
 * 第二类： Float【浮点型】
 *          float              4
 *          double             8
 * 第三类： Boolean【布尔型】
 *          boolean            1 【true, false】
 * 第四类： String【字符型】
 *          char               2 【0-65535】
 * ps: short & char 有效位数一样，只不过char能表示更多的正数
 *
 * 引用数据类型
 * 接口
 * 数组
 */
public class DataType {
    // 成员变量申明后可以不赋值
    static int e;

    public static void main(String[] args) {
        char c = '1';
        // Too many characters in character literal
        // char c = 'aa';
        System.out.println(c);
        char d = '过';
        // Too many characters in character literal
        // char d = '国家';
        System.out.println(d);
        // 申明后必须赋值，不然会报错
        /*char f;
        f = 'd';
        System.out.print(f);*/
        // 0
        System.out.print(e);
    }
}

class DataTypeNumber {
    public static void main(String[] arg) {
        /**
         * java 语言中会把 数字 当作 int类型处理
         * */
        // 添加 L 是将 2147483648 转换成long类型
        // Error: Integer number too large
        // long a = 2147483648
        long a = 2147483648L;
        // 强制转换, 损失精度非常严重
        int e = (int)a;
        System.out.println(a);
        // -2147483648
        System.out.println(e);
    }
}

class DataTypeChar {
    public static void main(String[] arg) {
        char a = 'a';
        System.out.print(a);
    }
}

