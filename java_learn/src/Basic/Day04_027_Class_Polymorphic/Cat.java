<<<<<<<< HEAD:java_learn/src/lesson/Day04_027_Class_Polymorphic/Test_02_Animal/Cat.java
package lesson.Day04_027_Class_Polymorphic.Test_02_Animal;
========
package Basic.Day04_027_Class_Polymorphic;
>>>>>>>> 6782f9ae50901231290f2af3e0f83b2b54b1f3c8:java_learn/src/Basic/Day04_027_Class_Polymorphic/Cat.java

public class Cat extends Animal {
    String name;
    @Override
    public void run () {
        System.out.println("猫儿在捉老鼠...");
    }
    public void getFeature () {
        System.out.println("猫儿有四条腿...");
    }

    public void setCatName(String name) {
        this.name = name;
    }

    public void seAnimalName(String name) {
        this.animalName = name;
    }

    public void getName() {
        System.out.println(this.name);
    }
}
