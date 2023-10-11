package lesson.Day04_027_Class_Polymorphic.demo;
/**
 *
 * 创建一个Dog对象，继承Pet
 * */
public class Dog extends Pet {
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗儿啃骨头...");
    }
}
