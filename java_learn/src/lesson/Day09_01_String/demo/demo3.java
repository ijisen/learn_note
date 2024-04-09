package lesson.Day09_01_String.demo;

public class demo3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jisen";

        Person p2 = new Person();
        p2.name = "jisen";

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        System.out.println(p1.name == "jisen");
    }
}

class Person {
    String name;
}
