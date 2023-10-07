package lesson.Day04_029_Modifier;
/**
 * 访问控制权限修饰符
 * 作用：访问控制权限修饰符用来控制元素的访问范围
 * public  公开的
 * private 私有的，当前类中可访问
 * protected 受保护的； 同包 & 子类中直接访问
 * 缺省 只能在同包下访问；
 * 修饰范围：
 * private < 缺省 < protected < public
 */
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
