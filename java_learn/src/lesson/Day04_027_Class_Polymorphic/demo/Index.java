package lesson.Day04_027_Class_Polymorphic.demo;

public class Index {
    public static void main(String[] args) {
        Master li = new Master();

        Cat cat = new Cat();
        li.feed(cat);

        Dog dog = new Dog();
        li.feed(dog);
    }
}
