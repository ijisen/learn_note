package lesson.Day09_01_String.demo;

public class demo4 {
    public static void main(String[] args) {
        String s1 = "S1";
        String s2 = "S2";
        // 变量相加，看堆内存
        // StringBuilder sb = new StringBuilder();
        // sb.append("S1");
        // sb.append("S2");
        // s3 = sb.toString();
        String s3 = s1 +s2;
        // 常量相加，直接看变量池
        String s4 = "S1" +"S2";
        String s5 = "S1S2";
        System.out.println(s3);
        // false
        System.out.println(s3 == s4);
        // false
        System.out.println(s3 == s5);
        // true
        // intern 指针指向常量池
        System.out.println(s3.intern() == s5);
        System.out.println(s3.equals(s5));
    }
}
