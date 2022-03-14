package lesson.Day07_Polymorphic.demo;

public class Cat extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("猫儿吃鱼...");
    }
}
