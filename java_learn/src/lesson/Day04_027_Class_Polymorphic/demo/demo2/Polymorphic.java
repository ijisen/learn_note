package lesson.Day04_027_Class_Polymorphic.demo.demo2;

public class Polymorphic {
    public static void main (String[] arg) {
        Master master = new Master("主人");
        master.feed(new Cat("小猫"), new Fish("鱼"));
        master.feed(new Dog("小狗"), new Bone("骨头"));
    }
}

