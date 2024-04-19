package lesson.Day09_02_StringBuffer.demo;

public class demo1 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer buffer1 = new StringBuffer();
        System.out.println(buffer1);

        buffer1.append(str);
        System.out.println(buffer1);
        System.out.println(buffer1.length());
        System.out.println(buffer1.capacity());

        // java.lang.StringBuffer;
//        StringBuffer bu = new StringBuffer(str);
//        System.out.println(bu);

    }
}
