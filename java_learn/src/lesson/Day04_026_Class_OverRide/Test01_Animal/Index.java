package lesson.Day04_026_Class_OverRide.Test01_Animal;

public class Index {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();

        Bird bird = new Bird();
        bird.eat();
        bird.eat("草");
    }
}
