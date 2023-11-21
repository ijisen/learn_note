package lesson.Day04_025_Class_OverRide.demo.demo2;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("鸟儿吃虫子。。。");
    }

    public void eat(String food) {
        System.out.println("鸟儿吃" + food);
    }
}
