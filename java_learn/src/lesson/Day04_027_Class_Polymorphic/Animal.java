package lesson.Day04_027_Class_Polymorphic;

public class Animal {
    String animalName;
    int count = 20;

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
