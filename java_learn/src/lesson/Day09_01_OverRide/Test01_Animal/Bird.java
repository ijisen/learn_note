package lesson.Day09_01_OverRide.Test01_Animal;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("鸟儿吃虫子。。。");
    }

    public void eat(String food) {
        System.out.println("鸟儿吃" + food);
    }
}
