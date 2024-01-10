package lesson.Day04_29_Class_Abstract;

/**
 * 抽象类(abstract)
 * <p>
 * 1、抽象类会被集成，由子类来实现具体的方法
 * 2、抽象类不可以被实例化
 * 3、抽象类可以没有抽象方法
 * 4、abstract只可以修饰类和方法， 不能修饰属性和其他的
 * 5、抽象类的本质还是类
 * 6、 抽象方法不能用
 * --》 final（禁止重写）
 * --》 private（私有的访问不到）
 * --》 static（静态的，类加载就有了）来修饰，因为这些都不能被重写。
 */
public class Index {
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 这是一个eat方法， 但么有什么意义
    // 即： 父类方法的不确定性问题
    /*public void eat() {
        System.out.println("这是一个动物，但不知道吃什么。");
    }*/
    // ==》 考虑设计为抽象（abstract）方法, 同时类名必须添加 abstract 修饰符
    public abstract void eat();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // 有 {} 即重写了抽象方法
    public void eat() {

    }
}
