package lesson.Day04_027_Class_Polymorphic.demo.demo2;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 传统写法
   /* public void feed(Dog dog, Bone bone) {
        System.out.println(dog.getName() + bone.getName());
    }*/
    // 方法重载
    /*public void feed(Cat cat, Fish fish) {
        System.out.println(cat.getName() + fish.getName());
    }*/

    // 多态写法
    public void feed(Animal animal, Food food) {
        System.out.println(animal.getName() + food.getName());
    }

}
