package Basic.Day04_027_Class_Polymorphic;

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
