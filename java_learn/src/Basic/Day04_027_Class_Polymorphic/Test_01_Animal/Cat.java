package Basic.Day04_027_Class_Polymorphic.Test_01_Animal;

public class Cat extends Animal {
    @Override
    public void run() {
        // super.run();
        System.out.println("猫儿在散步...");
    }

    public void eat() {
        System.out.println("猫儿爱吃鱼。。。");
    }
}
