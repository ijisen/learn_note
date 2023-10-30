package lesson.Day02_03_ControlStatement.demo;

public class SwitchDemo1 {
    public static void main(String[] arg) {
        // 表达式值: byte short int char enum String
        // switch (value): char, byte, short, int, Character, Byte, Short, Integer, String, or an enum
        short value = 1;
        switch (value) {
            // case 值
            case 97:
                System.out.println("111111111");
                break;
            // Error: 从double转换到int可能会有损失
            // case 1.1:
            // Error:: 从int转换到short可能会有损失
            // case 32828:
            case 80 +1:
                // case 得值必须为常量（常量表达式），不能是变量
                System.out.println("22222222222");
                break;
            default:
                System.out.println("99999999999");
        }
    }
}
