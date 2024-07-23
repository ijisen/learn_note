package lesson.Day14_00_Collection._collection.demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class index {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("hmm", 10));
        arrayList.add(new Dog("lss", 8));
        arrayList.add(new Dog("wf", 12));

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("\n for 强制遍历");

        for (Object o :arrayList) {
            System.out.println(o);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
