package lesson.day07_polymorphic.demo;

public class Dog extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("小狗啃骨头...");
    }
}
