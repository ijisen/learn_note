package lesson.day06_override;

public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("鸟儿在飞行");
    }
}
