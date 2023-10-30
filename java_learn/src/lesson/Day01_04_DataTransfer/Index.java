package lesson.Day01_04_DataTransfer;

public class Index {
    public static void main(String[] args) {
        float a = 10;
        short b = 10;
        float c = a + b;
        byte d = 14;
        // byte short char 他们三者可以计算，在计算时首先转换为int类型
        // Error: 从int转换到short可能会有损失
        // short e = d + b;

    }
}

/**
 * 数据类型自动转换规则
 * --> char => int => long => float => double
 * --> byte => short => int => long => float => double
 * --> (byte, short) 和  char 之间不能自动转换， 字节数和取值范围不一样，Error: 可能会有损失
 * --> byte short char 他们三者可以计算，在计算时首先转换为int类型
 * --> boolean 类型不参与自动转换
 * --> 自动提升原则： 表达式结果的类型提升为 操作数据中最大的类型
 * --> char 可以保存int的常量值，但不能保存int的变量值
 */
class DataTransferAuto {
    public static void main(String[] arg) {
        int int_a = 10;
        System.out.println(int_a);

        // 混合运算，系统会将所有数据转换为最大容量类型 =》 double
        // Error:(35, 31) java: 不兼容的类型: 从double转换到float可能会有损失
        // float float_c = int_a + 1.1;
        float float_a = int_a + 1.1f;
        System.out.println(float_a);

        float float_b = int_a + (float) 1.1;
        System.out.println(float_b);

        // 大容量类型赋值给小容量，会不错， 不能自动转换
        // Error： double -> int
        // int int_b = 2.2;


        // byte -> int
        // 先判断数值范围是否在byte范围内
        byte byte_a = 10;
        System.out.println(byte_a);
        // Error:从int转换到byte可能会有损失
        // byte byte_b = int_a;
        short short_aa = byte_a;

        // byte -> char  byte 不能转为 char
        // byte -128 - 127  1个子节
        // char  0-65535  2个子节
        // Error:从 byte 转换到 char 可能会有损失
        // char char_a = byte_a;


        // short -> char  short 不能转为 char

        char char_b = 10;
        System.out.println(char_b); // 10

        // char -> byte
        // byte -128 - 127  1个子节
        // char  0-65535  2个子节
        // Error:从 char 转换到 byte 可能会有损失
        // byte byte_c = char_b;

        // char -> short
        // short -32768 - 32767  1个子节
        // char  0-65535  2个子节
        // Error:从 char 转换到 short 可能会有损失
        // short short_c = char_b;

        // byte short char 他们三者可以计算，在计算时首先转换为int类型
        byte byte_b = 1;
        byte byte_c = 2;
        // Error:从int转换到short可能会有损失
        // short short_a = byte_b + byte_c;
        // Error:从int转换到byte可能会有损失
        // byte byte_d = byte_b + byte_c;
        int int_b = byte_a + byte_b;
    }
}

/**
 * 强制数据转换
 */
class DataTransferForce {
    public static void main(String[] args) {
        int n1 = (int) 1.9;
        System.out.println(n1); // 1; 精度损失

        byte byte_a = (byte) 2000;
        System.out.println(byte_a); // -48; 溢出

        // char 2个子节 65535
        char char_a = 122;
        char char_b = 65535;
        System.out.println(char_a); // z
        // char 转 byte 可以转，但容易出错；
        // byte 1个子节 -128 - 127
        System.out.println((byte) char_a); // 122
        System.out.println((int) char_a); // 122
        System.out.println((short) char_a); // 122
        System.out.println(char_b); // ￿  乱码
        System.out.println("byte: " + (byte) char_b); // -1
        // short 2个子节 -32768 - 32767
        System.out.println("short: " + (short) char_b); // -1
        System.out.println("int: " + (int) char_b); // 65535
        System.out.println("long: " + (long) char_b); // 65535
        System.out.println("float: " + (float) char_b); // 65535.0
        System.out.println("double: " + (double) char_b); // 65535.0
    }
}

/**
 * 基本数据类型 转 String
 * --> 确保字符串类型转换成有效的数据类型； eg: "hello" -> number 类型
 * --> 异常处理
 */
class DataTransferString {
    public static void main(String[] args) {
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        char c1 = 100;
        // 基本类型转字符串
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        String s5 = c1 + "";
        System.out.println("int to string: " + s1); // 100
        System.out.println("float to string: " + s2); // 1.1
        System.out.println("double to string: " + s3); // 4.5
        System.out.println("boolean to string: " + s4); // true
        System.out.println("char to string: " + s5); // d

        // 字符串转基本类型（包装类）
        // 都是强制转换
        System.out.println("\n字符串转基本类型");
        System.out.println("string to int: " + Integer.parseInt(s1)); // 100
        System.out.println("string to long: " + Long.parseLong(s1)); // 100
        System.out.println("string to float: " + Float.parseFloat(s1)); // 100.0
        System.out.println("string to double: " + Double.parseDouble(s1)); // 100.0
        System.out.println("string to float: " + Float.parseFloat(s2)); // 1.1
        System.out.println("string to double: " + Double.parseDouble(s3)); // 4.5
        System.out.println("string to boolean: " + Boolean.parseBoolean(s4)); // true
        // 字符串 转 字符 不适用
        // 含义： 取字符串中的第一个字符进行转换
         System.out.println(s5.charAt(0)); // d

    }
}
