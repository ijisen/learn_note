package lesson.Day09_01_OverRide.Test01_Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫儿爱吃鱼");
    }
}
