package lesson.day07_polymorphic;

public class Cat extends Animal {
    public void run () {
        System.out.println("猫儿在捉老鼠...");
    }
    public void getFeature () {
        System.out.println("猫儿有四条腿...");
    }
}
