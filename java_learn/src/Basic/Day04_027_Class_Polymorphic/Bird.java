<<<<<<<< HEAD:java_learn/src/lesson/Day04_027_Class_Polymorphic/Test_02_Animal/Bird.java
package lesson.Day04_027_Class_Polymorphic.Test_02_Animal;
========
package Basic.Day04_027_Class_Polymorphic;
>>>>>>>> 6782f9ae50901231290f2af3e0f83b2b54b1f3c8:java_learn/src/Basic/Day04_027_Class_Polymorphic/Bird.java

public class Bird extends Animal {
    @Override
    public void run () {
        System.out.println("鸟儿在捉虫子...");
    }
    public void fly () {
        System.out.println("鸟儿在飞行中...");
    }
}
