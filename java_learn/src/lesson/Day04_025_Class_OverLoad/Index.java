package lesson.Day04_025_Class_OverLoad;
/**
 * 重载(Overload)
 * --> 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。最常用的地方就是构造器的重载。
 * ​重载的规则：
 * ​  1，被重载的方法必须改变参数列表(参数个数或类型不一样)；
 * ​  2，被重载的方法可以改变返回类型；
 * ​  3，被重载的方法可以改变访问修饰符；
 * ​  4，被重载的方法可以声明新的或更广的检查异常；
 * ​  5，方法能够在同一个类中或者在一个子类中被重载。
 * ​  6，无法以返回值类型作为重载函数的区分标准。
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
        OverLoad_Class user = new OverLoad_Class();
        user.setInfo();
        user.setInfo(25);
        user.setInfo("liLei");
        user.setInfo("hmm", 30);
    }
}
