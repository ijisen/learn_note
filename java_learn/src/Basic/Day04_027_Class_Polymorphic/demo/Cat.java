<<<<<<<< HEAD:java_learn/src/lesson/Day04_027_Class_Polymorphic/Test_03_Animal/Cat.java
package lesson.Day04_027_Class_Polymorphic.Test_03_Animal;
========
package Basic.Day04_027_Class_Polymorphic.demo;
>>>>>>>> 6782f9ae50901231290f2af3e0f83b2b54b1f3c8:java_learn/src/Basic/Day04_027_Class_Polymorphic/demo/Cat.java

/**
 * 创建一个Cat对象， 继承Pet
 */
public class Cat extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("猫儿吃鱼...");
    }
}
