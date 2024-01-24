package lesson.Day05_01_Interface;

/**
 * 接口
 * interface + implements
 * 使用技巧：
 * 1、接口interface不可以被实例化
 * 2、接口interface中的抽象方法，可以省略abstract
 * 2、接口interface中的抽象方法，可以省略public, 虽然省略了，但实际还是【public】修饰，而不是【省略】修饰
 * 3、普通类中，必须都实现接口中定义的方法，快捷键： 光标 + alt + enter
 * 4、implements 可以多实现接口;eg:   class pg implements A,B {}
 * 5、接口 interface 中的【属性】都是 public static final； 这三个都可以省略
 * 6、接口 interface 不能继承其它类，但可以继承其它接口；eg: interface A extends B,C {} [ps: B 和 C都必须是interface]
 * 7、接口 interface 修饰符只能是 缺省 | public
 * 【继承】 和 【接口】的区别：
 * 1、价值不同：
 * --> 继承的主要价值： 在于解决代码的复用性和可维护性
 * --> 接口的主要价值： 设计好各种规范（方法），让其他类去实现这些方法，更加灵活
 * 2、接口比继承更加灵活
 * 3、接口在一定程度上能实现代码解耦
 * 【抽象类】 和 【接口】的关系：
 * --> 接口（interface）可以说成是抽象类的一种特例
 * ----> 1、接口中的所有【方法】都是抽象的（public abstract）
 * ----> 2、接口中的所有【属性】都是静态的（public static final）
 * ----> 3、接口中不能有构造方法，抽象类中可以有；
 * ----> 4、接口中没有普通属性（原因第二点），抽象类中可以有；
 * ----> 5、接口中没有普通方法（原因第一点），抽象类中可以有；
 * ----> 6、一个类可以继承多个接口，但只能继承一个抽象类； class FF extends EE implements A, B
 */
public class Index {

    public static void main(String[] args) {
        System.out.println("implements");
    }

}