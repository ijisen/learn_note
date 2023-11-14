package lesson.Day04_027_Class_Polymorphic.demo.demo1;

public class Index {
    public static void main(String[] args) {
        Master li = new Master();

        Cat cat = new Cat();
        li.feed(cat);

        Dog dog = new Dog();
        li.feed(dog);
    }
}

/**
 *
 * 创建一个Master对象，用来喂养动物
 *
 * */
class Master {
    public void feed(Pet pet) {
        pet.eat();
    }
}