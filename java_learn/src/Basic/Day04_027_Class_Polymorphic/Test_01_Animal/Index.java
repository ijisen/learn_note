package Basic.Day04_027_Class_Polymorphic.Test_01_Animal;

/**
 * 面向对象三大特性：
 * --》1、封装
 * ----》
 * --》2、继承
 * ----》 Cat 继承 Animal；
 * ----》 Bird 继承 Animal；
 * ==》3、多态 【依赖继承关系】
 * ----》 a、向上转型【upcasting】 子类型 =》 父类型； 自动转换
 * ---》  b、向下转型【downcasting】 父类型 =》 子类型； 强制转换
 */
public class Index {
    public static void main(String[] args) {
        /** 常规写法 */
        Animal a = new Animal();
        // 动物在减肥...
        a.run();
        ;

        Cat cat = new Cat();
        // 猫儿在散步...
        cat.run();

        Bird bird = new Bird();
        // 鸟儿在飞...
        bird.run();


        /** 使用多态方法 */
        /**
         * Demo1 向上转型【upcasting】
         * Animal 和 Cat 是继承关系； Animal 是父类， Cat是子类；
         * new Cat() 创建的对象类型是Cat；
         * cat2 的引用数据类型是 Animal；
         * 1、子类型转换成父类型，称为向上转型【upcasting】,或自动类型转换
         * 2、编译阶段，编译器检查cat2这个引用数据类型为Animal，由于Animal字节码
         * 中有move()方法，所有编译通过，这个过程我们称为静态绑定【编译阶段绑定】；由于Animal字节码
         * 中没有eat()方法，所以编译不通过，程序没法执行。
         * 3、在程序运行阶段，JVM堆内存当中真是创建的对象是Cat，所有程序运行阶段会调用
         * Cat对象的move方法，此时称为程序的动态绑定【运行阶段绑定】。
         * 4、无论Cat中有无重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层
         * 真实对象就是Cat。
         * 5、父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态，
         * 这种机制称为多态语法机制。
         * */
        Animal cat2 = new Cat();
        // 猫儿在散步...
        cat2.run();
        // Animal中 找不到符eat方法， 静态编译阶段会报错;
        // cat2.eat();
        // 这时就需要向下转型【downcasting】强制转换
    }
}
