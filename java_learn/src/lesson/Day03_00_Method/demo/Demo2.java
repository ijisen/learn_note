package lesson.Day03_00_Method.demo;

/**
 *
 * 引用数据类型 传参机制
 * */
public class Demo2 {

    public static void main(String[] arg) {
        B b = new B();
        Person p = new Person();
        p.age = 25;
        p.name = "jack";
        b.test100(p);
        System.out.println(p.age);

    }
}

class B  {
    public void test100(Person p) {
        p = null;

    }
}

class Person {
    int age;
    String name;
}
