package lesson.Day04_29_Modifier.demo.demo4.package1;

/**
 * 父类
 * */
public class Class_A {
    public String public_a = "class public A";
    protected String protected_a = "class protected A";
    String a = "class  A";
    private String private_a = "class private A";

    public static void main(String[] args) {
        Class_A class_a = new Class_A();
        class_a.runA();
        System.out.println("-----------");
        System.out.println(class_a.public_a);
        System.out.println(class_a.a);
        System.out.println(class_a.protected_a);
        System.out.println(class_a.private_a);
    }
    public void runA () {
        System.out.println(public_a);
        System.out.println(protected_a);
        System.out.println(a);
        System.out.println(private_a);
        class Class_A_Inner {
            public void runAInner () {
                System.out.println("inner class" + a);
            }
        }
        new Class_A_Inner().runAInner();
    }
}
