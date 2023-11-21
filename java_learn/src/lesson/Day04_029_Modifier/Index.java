package lesson.Day04_029_Modifier;
/**
 * 【修饰符】
 * 作用：访问控制权限修饰符用来控制元素的访问范围
 * --> public  公开的
 * --> private 私有的，当前类中可访问
 * --> protected 受保护的； 同包 & 子类中直接访问
 * --> 默认级别： 没有修饰符号，向同一个包的类公开
 * 缺省 只能在同包下访问；
 * 修饰范围：
 * private < 缺省 < protected < public
 */


/**
 * 访问级别       同 包  同 类  子 类  不同包
 *
 * public          1     1     1      1
 *
 * protected       1     1     1      X
 *
 * 缺省            1     1     X      X
 *
 * private         X     1     X      X
 * */

/**
 * 使用修饰符注意事项：
 * 1、修饰符可以用来修饰类的属性、成员方法和类
 * 2、只有【缺省】和【public】才能修饰类
 * 3、
 *
 * */
public class Index {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.age);
        System.out.println(parent.name);
        System.out.println(parent.getParentType());

        System.out.println("------ children -----");

        Children children = new Children();
        System.out.println(children.age);
        System.out.println(children.name);
        System.out.println(children.getParentType());
        children.run();
    }
}
