package lesson.Day07_01_Annotation.demo.demo3;

public class Index {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        cat.shout();
        dog.shout();
    }
}


abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫儿叫");
    }
}


class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("Dog叫");
    }
}


