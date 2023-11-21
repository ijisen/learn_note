package lesson.Day04_027_Class_Polymorphic;

public class Bird extends Animal {
    int count = 200;
    public void run () {
        System.out.println("鸟儿在捉虫子...");
    }
    public void fly () {
        System.out.println("鸟儿在飞行...");
    }
}
