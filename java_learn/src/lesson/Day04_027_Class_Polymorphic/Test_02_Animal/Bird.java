package lesson.Day04_027_Class_Polymorphic.Test_02_Animal;

public class Bird extends Animal {
    @Override
    public void run () {
        System.out.println("鸟儿在捉虫子...");
    }
    public void fly () {
        System.out.println("鸟儿在飞行中...");
    }
}
