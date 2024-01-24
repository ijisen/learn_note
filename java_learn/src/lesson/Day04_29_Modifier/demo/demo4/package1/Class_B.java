package lesson.Day04_29_Modifier.demo.demo4.package1;

/**
 * 同包 - 缺省
 * */
public class Class_B {
    public static void main(String[] args) {
        Class_A class_a = new Class_A();
        class_a.runA();
        System.out.println(class_a.public_a);
        System.out.println(class_a.protected_a);
        System.out.println(class_a.a);
        Class_A_Child class_a_child = new Class_A_Child();
        class_a_child.runAChild();
        System.out.println(class_a.public_a);
        System.out.println(class_a.protected_a);
        System.out.println(class_a.a);
    }
}
