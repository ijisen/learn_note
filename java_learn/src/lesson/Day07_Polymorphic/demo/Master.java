package lesson.day07_polymorphic.demo;

public class Master {
    // 多态应用场景， 向上转型。
    public void feed(Pet pet) {
        pet.eat();
    }
}
