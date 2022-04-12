package lesson.Day04_027_Class_Polymorphic.Test_03_Animal;

public class Cat extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("猫儿吃鱼...");
    }
}
