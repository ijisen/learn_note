package lesson.day07_polymorphic;

public class Bird extends Animal {
    public void run () {
        System.out.println("鸟儿在捉虫子...");
    }
    public void fly () {
        System.out.println("鸟儿在飞行中...");
    }
}
