package lesson.day06_override;

public class Bird extends Animal {
    @Override
    public void move() {
        // 当需要在子类中调用父类的被重写方法时，要使用 super 关键字。
        super.move();
        System.out.println("鸟儿在飞行");
    }
}
