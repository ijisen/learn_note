package lesson.Day04_027_Class_Polymorphic;

/**
 * 多态 【Polymorphic】
 * --> 多态是同一个方法或对象具有多个不同表现形式或形态的能力。 OOP的三大特征之一，是建立在封装和继承的基础之上
 * 【​多态存在的三个必要条件】
 * --> 1、继承
 * --> 2、重写
 * --> 3、父类引用指向子类对象：Parent p = new Child();
 * 【多态的优点】
 * -->  1. 消除类型之间的耦合关系, 提高代码的拓展性
 * -->  2. 可替换性
 * -->  3. 可扩充性
 * -->  4. 接口性
 * -->  5. 灵活性
 * -->  6. 简化性
 * 【多态的具体表先形式】
 * --> 1. 方法 => 重写体现多态
 * --> 2. 方法 => 重载体现多态
 * --> 3. 对象多态【编译阶段；运行阶段】
 * 方法的重写(Overriding)和重载(Overloading)是java多态性的不同表现，重写是父类与子类之间多态性的一种表现，重载可以理解成多态的具体表现形式。
 * (1)方法重载是一个类中定义了多个方法名相同,而他们的参数的数量不同或数量相同而类型和次序不同,则称为方法的重载(Overloading)。
 * (2)方法重写是在子类存在方法与父类的方法的名字相同,而且参数的个数与类型一样,返回值也一样的方法,就称为重写(Overriding)。
 * (3)方法重载是一个类的多态性表现,而方法重写是子类与父类的一种多态性表现。
 */
public class Index {
    public static void main(String[] args) {
        /**
         * 向上转型   upcasting 自动转换 [本质： 父类的引用指向了子类]
         * --》一多态本身就是向上转型过的过程
         * --》使用格式：父类类型 变量名=new 子类类型();
         * --》适用场景：当不需要面对子类类型时，通过提高扩展性，或者使用父类的功能就能完成相应的操作。
         * 向下转型【downcasting 强制转换 】
         * --》一个已经向上转型的子类对象可以使用强制类型转换的格式，将父类引用类型转为子类引用各类型】
         * --》使用格式：子类类型 变量名=（子类类型） 父类类型的变量；
         * --》适用场景：当要使用子类特有功能时。
         * instanceof：
         * --》向下转型需要考虑安全性，如果父类引用的对象是父类本身，那么在向下转型的过程中是不安全的，编译不会出错，但是运行时会出现java.lang.ClassCastException错误。
         * --》它可以使用instanceof来避免出错此类错误即能否向下转型，只有先经过向上转型的对象才能继续向下转型。
         * */
        Animal animal = new Bird();
        /** 方法运行结果，看运行类型 */
        // 鸟儿在捉虫子
        animal.run();
        /** ps: 属性没有重写之说，属性的值看编译类型 */
        // 20
        System.out.println(animal.count);
        // 编译阶段无法找到bird.fly
        // bird.fly();
        // 【向下转型】
        // 鸟儿在飞行...
        ((Bird) animal).fly();
        // 200
        System.out.println(((Bird) animal).count);

        // animal 强制向下转型
        Bird bird = (Bird) animal;
        // 鸟儿在飞行...
        bird.fly();
        // 运行报错 =》 ClassCastException：猫儿不能强制转换成鸟儿
        // Cat cat = (Cat) animal;

        /**
         *  instanceof：
         *  --》向下转型需要考虑安全性，如果父类引用的对象是父类本身，那么在向下转型的过程中是不安全的，编译不会出错，但是运行时会出现java.lang.ClassCastException错误。
         *  --》它可以使用instanceof来避免出错此类错误即能否向下转型，只有先经过向上转型的对象才能继续向下转型。
         *  */
        // true
        System.out.println(bird instanceof  Animal);
        // true
        System.out.println(bird instanceof  Bird);

    }
}
