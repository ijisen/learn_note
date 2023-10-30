package lesson.Day02_04_AssignmentOperation;

/**
 * 赋值运算
 */
public class Index {
    public static void main(String[] arg) {
        // 定义一个 String 类型的变量， 起名 userName， 赋值 Hmm
        String userName = "Hmm";
        // int 是基本数据类型， a 是变量名， 10 是int类型的字面值
        int a = 10;
        a = 10 + a;
        System.out.println(a);
        byte b = 10;
        /**
         * [b + 10] 为int类型
         * 大容量像小容量转换必须进行强制转换，不然会报错
         * */
        // 会报错， 左侧为 byte 类型； 右侧为 int
        //  b = b + 10;
        // 强制转换
        b = (byte) (b + 10);
        // 20
        System.out.println(b);
        // 等于  (byte) (b + 10);
        b += 10;
        // 30
        System.out.println(b);
    }
}
