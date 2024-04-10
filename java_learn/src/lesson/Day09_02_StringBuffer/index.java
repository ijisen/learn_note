package lesson.Day09_02_StringBuffer;

public class index {
    public static void main(String[] args) {
        // 构建一个不带字符的字符串缓冲区，长度为16位， char[16]
        StringBuffer str = new StringBuffer();
        System.out.println(str);
        // 16
        System.out.println(str.capacity());
        // 字符串 转 StringBuffer
        str.append("lucy");
        System.out.println(str);
        // 16
        System.out.println(str.capacity());

        // 指定 buffer长度为100  =》 char[100]
        StringBuffer str2 = new StringBuffer(100);
        System.out.println(str2);

        // 初始buffer值 =》 char[16 + 3]
        StringBuffer tom = new StringBuffer("tom");
        System.out.println(tom);
        // 19
        System.out.println(tom.capacity());
        // 3
        System.out.println(tom.length());

        // StringBuffer 转 字符串
        String str4 = tom.toString();
        System.out.println(str4);
        String str5 = new String(tom);
        // java: 不兼容的类型: java.lang.StringBuffer无法转换为java.lang.String
        // String str6 = tom;
        System.out.println(str5);

    }
}
