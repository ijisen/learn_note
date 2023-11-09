package lesson.Day04_025_Class_Extends.demo.demo5;

public class Index {
    public static void main(String[] arg) {
        new C();
    }
}

class A {
    A() {
        System.out.println("i an A");
    }
}

class B extends A {
    B() {
        System.out.println("i an B, without params");
    }

    B(String name) {
        System.out.println("i an B, with params");
    }
}

class C extends B {
    C() {
        this("hello");
        System.out.println("i an C, without params");
    }

    C(String name) {
        super(name);
        System.out.println("i an C, with params");
    }

}
