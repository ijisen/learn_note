package lesson.Day04_027_Class_Polymorphic.Test_03_Animal;

/**
 * 多态应用场景（polymorphic）
 *
 *  多态的作用：
 *    低耦合，高拓展
 */
public class Index {
    public static void main(String[] args) {
        Master liLei = new Master();
        Cat cat = new Cat();
        liLei.feed(cat);
        Dog dog = new Dog();
        liLei.feed(dog);
    }
}
