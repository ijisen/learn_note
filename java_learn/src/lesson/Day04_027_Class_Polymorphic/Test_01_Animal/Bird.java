package lesson.Day04_027_Class_Polymorphic.Test_01_Animal;

public class Bird extends Animal {
    @Override
    public void run() {
        System.out.println("鸟儿在飞");
        // super.run();
    }
}
