package lesson.Day05_01_Interface;

/**
 * 接口
 * interface
 * implements
 * 使用技巧：
 * 1、接口interface不可以被实例化
 * 2、接口interface中的抽象方法，可以省略abstract
 * 2、接口interface中的抽象方法，可以省略public, 虽然省略了，但实际还是【public】修饰，而不是【省略】修饰
 * 3、普通类中，必须都实现接口中定义的方法，快捷键： 光标 + alt + enter
 * 4、implements 可以多实现接口;eg:   class pg implements A,B {}
 * 5、接口 interface 中的属性都是 public static final； 这三个都可以省略
 * 6、接口 interface 不能继承其它类，但可以继承其它接口；eg: interface A extends B,C {}
 * 7、接口 interface 修饰符只能是 缺省 | public
 */
public class Index {

    public static void main(String[] args) {
        System.out.println("implements");
    }

}