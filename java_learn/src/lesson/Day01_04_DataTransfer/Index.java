package lesson.Day01_04_DataTransfer;

/**
 * 数据类型自动转换规则
 * char => int => long => float => double
 * byte => short => int => long => float => double
 * (byte, short) 和  char 之间不能自动转换， 字节数和取值范围不一样，Error: 可能会有损失
 */
public class Index {
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
    }
}

/**
 * 强制数据转换
 */
class domainTransferForce {
    public static void main(String[] args) {
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
