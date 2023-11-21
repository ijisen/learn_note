package demo.demo2;

public class Index {
    public static void main(String[] args) {
        Person[] person = new Person[6];
        person[0] = new Person("tom", 25, "worker");
        person[1] = new Person("lucy", 80, "older");
        person[2] = new Person("jack", 45, "teacher");
        person[3] = new Person("tomi", 10, "child");
        person[4] = new Person("jisen", 15, "student");
        person[5] = new Person("hmm", 15, "student");


        for (Person item: person) {
            System.out.println(item.name + " " + item.age + " " + item.job);
        }
        System.out.println("------------");
        for (int i = 0; i < person.length; i++) {
            Person item = person[i];

            for (int k = i + 1; k < person.length; k++) {
                Person nextItem = person[k];
                if (nextItem.age > item.age) {
                    person[k - 1] = nextItem;
                    person[k] = item;
                }
            }
        }
        for (Person item: person) {
            System.out.println(item.name + " " + item.age + " " + item.job);
        }

    }
}


class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}


/**
 * 不同包|同包|同类|子类
 * public 公共的  不同包|同包|同类|子类
 *
 * protected 受保护的 同包|同类|子类
 *
 * 省略  同类|同包
 *
 * private 私有的 同类
 *
 *
 * */