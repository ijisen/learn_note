/**
 * 数据类型
 * 申明不同的数据类型，分配的空间不一样
 * 基本数据类型【原始数据类型】
 * 第一类： Integer【整数型】
 * ------- 数据类型 ------- 占用空间大小【单位：子节】
 * byte               1 【-128 - 127】
 * short              2 【-32768 - 32767】
 * int                4 【-2147483648 - 2147483647】
 * long               8
 * 第二类： Float【浮点型】
 * float              4
 * double             8
 * 第三类： Boolean【布尔型】
 * boolean            1 【true, false】
 * 第四类： String【字符型】
 * char               2 【0-65535】
 * ps: short & char 有效位数一样，只不过char能表示更多的正数
 * <p>
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

/**
 * 数据类型-整数型
 * java 语言中会把 "整数型字面值" 默认当作 int类型处理
 */
class DataTypeNumber {
    public static void main(String[] arg) {
        /**
         * java 语言中整数型有三种书写方式 十进制、八进制、十六进制
         * */
        // 十进制 10
        int aa = 10;
        // 八进制 8
        int bb = 010;
        // 十六进制 16
        int cc = 0x10;
        /**
         * 大容量转换成小容量，需要进行强制类型转换
         * 强制类型转换容易损失精度
         * */
        // 添加 L 是将 2147483648 转换成long类型
        // Error: Integer number too large
        // long a = 2147483648
        long a = 2147483648L;
        // 强制转换, 损失精度非常严重
        int b = (int) a;
        System.out.println(a);
        // -2147483648
        System.out.println(b);
        /**
         * 大容量转小容量需要进行强制类型转换，以下代码编译没有报错。
         * 是因为当前字面值没有超出所属数据类型的取值范围，可以正常编译。
         * */
        byte aByte = 70;
        System.out.println(aByte);
        // 从int转换到byte可能会有损失
        // byte bByte = 127;
        // System.out.println(bByte);
        int aInt = 70;
        // 大容量转小容量，需要强制转换
        short aShort = (short) aInt;
        long aLong = aInt;
        System.out.println(aLong);
    }
}

/**
 * 数据类型-浮点型
 * double 双精度【8个子节】
 * float  单精度【4个子节，精度较高】
 * java 语言中会把 "浮点型字面值" 默认当作 double 类型处理
 * double 精度低【相对的】，不适合财务软件， sun 提供了  java.math.BigDecimal 类库，
 */

class DataTypeFloat {
    public static void main(String[] arg) {
        double a = 5.0;
        System.out.println(a);
        /**
         * 大容量转换成小容量，需要进行强制类型转换
         * 强制类型转换容易损失精度
         * 5.0 是 double 类型的字面值
         * b 是 float 类型的变量
         * */
        // 强制转换
        float b = (float) 5.0;
        System.out.println(b);
        // 没有类型转换
        float c = 5.1f;
        System.out.println(c);
    }
}

/**
 * 数据类型-字符串
 */
class DataTypeChar {
    public static void main(String[] arg) {
        char a = 'a';
        System.out.print(a);
    }
}

