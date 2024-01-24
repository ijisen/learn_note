package lesson.Day04_29_Modifier.demo.demo4.package1;

/**
 * 子类
 */
class Class_A_Child extends Class_A {
    public static void main(String[] args) {
        Class_A_Child class_a_child = new Class_A_Child();
        class_a_child.runAChild();
        System.out.println(class_a_child.public_a);
        System.out.println(class_a_child.protected_a);
        System.out.println(class_a_child.a);
//        System.out.println(class_a_child.private_a);
    }
    public void runAChild() {
        System.out.println(public_a);
        System.out.println(protected_a);
        System.out.println(a);
        // 私有属性不能访问
//        System.out.println(private_a);
    }
}
