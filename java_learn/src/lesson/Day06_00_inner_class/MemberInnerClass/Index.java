package lesson.Day06_00_inner_class.MemberInnerClass;

/**
 * 成员内部类
 */
public class Index {
    public static void main(String[] args) {
        Class_A class_a = new Class_A();
        class_a.runA();
        /**
         * 外部其它内使用成员内部类得两种方式
         * */
        // 第一种： 直接使用，遵循修饰符访问规则
        // 同包不可以访问私有类
        // Class_A.InnerB innerB = class_a.new InnerB();

        Class_A.InnerA innerA = class_a.new InnerA();
        System.out.println(innerA.name);
        System.out.println(innerA.public_name);
        System.out.println(innerA.protected_name);
        System.out.println("-----innerA run-----");
        innerA.run();
        // 私有属性，不可以访问
        // System.out.println(innerA.private_name);

        System.out.println("---------------");
        // 第二种方式： 外部内写一个方法返回实例对象，遵循修饰符访问规则
        Class_A.InnerA innerA2 = class_a.returnInnerA();
        System.out.println(innerA2.name);
        System.out.println(innerA2.public_name);
        System.out.println(innerA2.protected_name);
        // 私有属性，不可以访问
        // System.out.println(innerA2.private_name);


        /**
         * 静态成员内部类的访问方式
         * */
        new Class_A.InnerC();
    }
}
