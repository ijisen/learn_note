package lesson.Day09_01_String.demo;

public class demo1 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
    }
}
