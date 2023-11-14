package lesson.Day04_025_Class_OverRide.demo.demo1;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Index {
    public static void main(String[] arg) {
        Person p = new Person("Person", 25);
        p.say();
        System.out.println("----------------\n");
        Student student = new Student("Student", 15, 500, 80);
        student.say();
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void say() {
        System.out.println("my name is " + name + ", i am " + age + " old");
    }
}


class Student extends Person {
    int id;
    private double score;


    Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("my score is " + score);
    }
}
