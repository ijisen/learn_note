package lesson.Day09_01_String.demo;

public class demo2 {
    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");

        // False
        System.out.println(s2 == s3);
        // True
        System.out.println(s2 == s4);
        // True
        System.out.println(s2.equals(s3));
        // False
        System.out.println(s2 == s1);
    }
}
