package lesson.day07_polymorphic;

public class Cat extends Animal {
    String name;
    @Override
    public void run () {
        System.out.println("猫儿在捉老鼠...");
    }
    public void getFeature () {
        System.out.println("猫儿有四条腿...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(this.name);
    }
}
