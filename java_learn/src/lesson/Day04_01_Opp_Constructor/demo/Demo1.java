package lesson.Day04_01_Opp_Constructor.demo;

public class Demo1 {
    public static void main(String[] arg) {
        new Person("jisen", 25);
        new Person("Tom");
        new Person();

    }
}


class Person {
    String name;
    int age;

    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
        System.out.println("name: " + name + "; age: " + age);
    }

    public Person(String pName) {
        name = pName;
        System.out.println("name: " + name);
    }

    public Person() {
        System.out.println("缺省构造器");
    }
}