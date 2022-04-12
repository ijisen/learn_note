<<<<<<<< HEAD:java_learn/src/lesson/Day04_027_Class_Polymorphic/Test_02_Animal/Animal.java
package lesson.Day04_027_Class_Polymorphic.Test_02_Animal;
========
package Basic.Day04_027_Class_Polymorphic;
>>>>>>>> 6782f9ae50901231290f2af3e0f83b2b54b1f3c8:java_learn/src/Basic/Day04_027_Class_Polymorphic/Animal.java

public class Animal {
    String animalName;

    public void run() {
        System.out.println("动物在奔跑中...");
    }

    public void setAnimalName(String name) {
        this.animalName = name;
    }

    public void getAnimalName() {
        System.out.println(this.animalName);
    }
}
