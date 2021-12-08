package lesson.day06_override;

/**
 * 方法重写（方法覆盖） override
 * --> 是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
 * 什么时候使用：
 * --> 父类的方法不满足子类的需求时
 * ​重写的规则：
 * ​  1，参数列表必须与被重写方法相同。
 * ​  2，访问权限不能比父类中被重写的方法的访问权限更低（public>protected>(default)>private）。
 * ​  3，父类成员的方法只能被它的子类重写。
 * ​  4，被final修饰的方法不能被重写。
 * ​  5，构造方法不能
 * Super 关键字的使用
 *   当需要在子类中调用父类的被重写方法时，要使用 super 关键字。
 * 【重写与重载之间的区别】
 *      区别点	    重载方法	重写方法
 *      参数列表	必须修改	一定不能修改
 *      返回类型	可以修改	一定不能修改
 *      异常	    可以修改	可以减少或删除，一定不能抛出新的或者更广的异常
 *      访问	    可以修改	一定不能做更严格的限制（可以降低限制）
 * 方法的重写(Overriding)和重载(Overloading)是java多态性的不同表现，重写是父类与子类之间多态性的一种表现，重载可以理解成多态的具体表现形式。
 *     (1)方法重载是一个类中定义了多个方法名相同,而他们的参数的数量不同或数量相同而类型和次序不同,则称为方法的重载(Overloading)。
 *     (2)方法重写是在子类存在方法与父类的方法的名字相同,而且参数的个数与类型一样,返回值也一样的方法,就称为重写(Overriding)。
 *     (3)方法重载是一个类的多态性表现,而方法重写是子类与父类的一种多态性表现。
 */
public class Index {
    public static void main(String[] args) {
        // 鸟需要飞行
        Bird bird = new Bird();
        bird.move();
        // 猫可以爬行
        Cat cat = new Cat();
        cat.move();
    }
}
