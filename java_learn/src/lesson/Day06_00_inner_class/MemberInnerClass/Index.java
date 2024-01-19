package lesson.Day06_00_inner_class.MemberInnerClass;

/**
 * 成员内部类
 * 成员内部类分为：
 * --> 1、普通成员内部类
 * --> 2、静态成员内部类
 * 声明规则遵循普通属性和方法申明方式， public[private|protected|缺省] static final class {}
 * 两者使用方式和限制规则都是一样的，只是申明时多了一个 static
 * --> 私有属性和方法不能访问&不会被返回
 * 内部类访问外部类的属性和方法 外部类名+this.属性或方法名
 */
public class Index {
    public static void main(String[] args) {
        /**
         * 外部其它内使用成员内部类得两种方式
         * */
        // 第一种： 直接使用，遵循修饰符访问规则
        // 同包不可以访问私有类
        // Class_A.InnerB innerB = class_a.new InnerB();
        Class_A class_a = new Class_A();
        class_a.runA();
        Class_A.InnerA innerA = class_a.new InnerA();
        System.out.println(innerA.name);
        System.out.println(innerA.public_name);
        System.out.println(innerA.protected_name);
        System.out.println("-----innerA run-----");
        innerA.run();
        // 私有属性，不可以访问
        // System.out.println(innerA.private_name);

        // 第二种方式： 外部内写一个方法返回实例对象，遵循修饰符访问规则
        System.out.println("---------------");
        Class_A.InnerA innerA2 = class_a.getInnerA();
        System.out.println(innerA2.name);
        System.out.println(innerA2.public_name);
        System.out.println(innerA2.protected_name);
        // 私有属性，不可以访问
        // System.out.println(innerA2.private_name);


        /**
         * 外部其它类访问[静态成员内部类]的两种方法
         * */

        System.out.println("----- static innerC ------");
        Class_A.InnerC innerC = new Class_A.InnerC();
        innerC.runInnerC();
        System.out.println(innerC.name);
        System.out.println(innerC.public_name);
        System.out.println(innerC.protected_name);
        // 私有属性，不可以访问
        // System.out.println(innerC.private_name);
        System.out.println("----------");
        Class_A.InnerC innerC1 = class_a.getInnerC();
        innerC1.runInnerC();
        // 私有属性，不可以访问
        // System.out.println(innerC1.private_name);
    }
}
