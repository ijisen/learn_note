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
