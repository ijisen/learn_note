package lesson.Day04_29_Modifier.demo.demo4.package2;

import lesson.Day04_29_Modifier.demo.demo4.package1.Class_A;

/**
 * 不同包
 *
 * */
public class Class_C {
    public static void main(String[] args) {
        Class_A class_a = new Class_A();
        // 不同包，只能访问public修饰的属性和方法
        class_a.runA();
        System.out.println(class_a.public_a);
        // 缺省不能访问
        // System.out.println(class_a.a);
        // 受保护的不能访问
        // System.out.println(class_a.protected_a);
        // 私有的的不能访问
        // System.out.println(class_a.private_a);
        // 缺省的不能访问
//        new Class_A_Child();
    }
}