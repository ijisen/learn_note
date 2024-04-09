package lesson.Day09_01_String;

/**
 * String
 * 1、 String 对象用于保存字符串，也就是一组字符序列
 * 2、字符串的字符使用的是Unicode编码，一个字符（不区分字母还是汉字）占两个子节
 * 3、String 实现了
 * --> Comparable   可相互比较
 * --> Serializable  可网络传输
 * 4、String 是final类型， 赋值以后不能修改（是指地址不可以修改，因为他是引用类型）
 */
public class Index {
    public static void main(String[] args) {
        // 创建方式一：
        String str = "  韩  密  码  ";
        System.out.println(str.length());
        System.out.println(str.hashCode());
        System.out.println(str.trim());
        // 创建方式二：
        str = new String("李雷");
        System.out.println(str);
    }
}
