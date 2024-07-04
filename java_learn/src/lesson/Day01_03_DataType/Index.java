package lesson.Day01_03_DataType;

/**
 * 数据类型
 * 申明不同的数据类型，分配的空间不一样
 * 基本数据类型【原始数据类型】
 * ======  第一类： Integer【整数型】 ======
 * ------- 数据类型 ------- 占用空间大小【单位：子节】 ------- 默认值
 * byte             1 【-128 - 127】                0  2^7
 * short            2 【-32768 - 32767】            0  2^15
 * int              4 【-2147483648 - 2147483647】  0  2^31
 * long             8                               0  2^56
 * ======  第二类： Float【浮点型】 ======
 * ------- 数据类型 ------- 占用空间大小【单位：子节】 ------- 默认值
 * float              4     0.0f
 * double             8     0.0
 * ======  第三类： Boolean【布尔型】 ======
 * ------- 数据类型 ------- 占用空间大小【单位：子节】 ------- 默认值
 * boolean            1 【true, false】              false
 * ======  第四类： String【字符型】 ======
 * ------- 数据类型 ------- 占用空间大小【单位：子节】 ------- 默认值
 * char               2 【0-65535】                  \u0000
 * ps: short & char 有效位数一样，只不过char能表示更多的正数
 * <p>
 * 引用数据类型  null
 * 接口
 * 数组
 */
public class Index {
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
        System.out.println(e);
        int ff = 127;
        System.out.println(ff);
        byteTest();
    }

    public static void byteTest() {
        char str = 'a';
        System.out.println("type\tsize\tmin\t\t\t\t\t max");
        System.out.println("byte\t" + Byte.SIZE + "\t\t" + Byte.MIN_VALUE + " \t\t\t\t " + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.SIZE + "\t\t" + Short.MIN_VALUE + " \t\t\t\t " + Short.MAX_VALUE);
        System.out.println("int \t" + Integer.SIZE + "\t\t" + Integer.MIN_VALUE + "\t\t\t " + Integer.MAX_VALUE);
        System.out.println("long\t" + Long.SIZE + "\t\t" + Long.MIN_VALUE + " " + Long.MAX_VALUE);

        System.out.println(str);
        for (int i = 0; i < 6; i++) {
            str += 'A';
        }
        System.out.println(str);

    }
}

/**
 * 数据类型-整数型
 * java 语言中会把 "整数型字面值" 默认当作 int类型处理
 */
class DataTypeNumber {
    public static void main(String[] arg) {
        /**
         * 为什么 byte short 申明不用强制转型
         * ==》 JVM特性，一般byte还是占用和int一样大小:4个字节；也就说在JVM看来，short,byte,int都是同一个东西。
         *
         * */
        byte byte_a = 10; // -128 - 127
        short short_a = 10; // -32768 - 32767
        int int_a = 10;
        long long_a = 10;

        System.out.println("byte: " + byte_a);
        System.out.println("short: " + short_a);
        System.out.println("int: " + int_a);
        System.out.println("long: " + long_a);
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
 * double 双精度【8个子节】，可以存储大约6~7位有效数字。
 * float  单精度【4个子节，精度较高】,可以存储大约15位有效数字
 * java 语言中会把 "浮点型字面值" 默认当作 double 类型处理
 * double 精度低【相对的】，不适合财务软件， sun 提供了  java.math.BigDecimal 类库，
 * double类型的取值范围比float类型的取值范围更大且精度更高
 * float和double类型用来表示近似的数值数据。
 * => 因为现实世界中有这种无限循环的数据 例如：1/3。
 * => 数据实际上是无限循环，但是计算机的内存有限，用一个有限的资源表示无限的数据，只能存储近似值。
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
        /**
         * 精度损失
         * */
        double double_a = 2.7;
        double double_b = 8.1 / 3; // 2.6999999999999997
        System.out.println(double_b);
        System.out.println(double_b == double_a); // false
        System.out.println(2.0 == 2); // true
        System.out.println(9.0/3); // 3
        System.out.println(3 == 9.0/3); // true
        System.out.println(9.3/3); // 3.1
        System.out.println(3.1 == 9.3/3); // true
        System.out.println(10.2/3); // 3.4
        System.out.println(3.4 == 10.2/3); // true
    }
}

/**
 * 数据类型-字符(char)
 * 字符型使用单引号' '表示，只能存储一个字符。
 * char 的本质是一个无符号的整数行；表示Unicode字符
 * 输出unicode码对应的字符
 * char 因为本质是一个整数，所以可以参与运算
 * char 以二进制存储，
 */
class DataTypeChar {
    public static void main(String[] arg) {
        char a = 'a';
        System.out.println(a); // a
        // 输出 a 对应的unicode码
        System.out.println((int) a); // 97
        char b = 97;
        // 输出该编码对应的字符
        System.out.println(b); // a
        System.out.println(b + 10); // 107
        System.out.println(a + 10); // 107
    }
}

