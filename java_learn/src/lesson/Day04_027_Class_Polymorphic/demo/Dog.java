package lesson.Day04_027_Class_Polymorphic.demo;

public class Dog extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("小狗啃骨头...");
    }
}
