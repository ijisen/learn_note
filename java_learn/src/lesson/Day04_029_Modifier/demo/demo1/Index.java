package lesson.Day04_029_Modifier.demo.demo1;

import java.util.Date;
/**
 *
 * 我是demo1包下的类
 *
 * */

/**
 * public： 对外公开
 * protected：对子类和同一个包类开放
 * 默认： 没有修饰符号，同一个包类开放
 * private： 私有的， 对类本身访问，不对外公开
 * <p>
 * 一个java文件中只能有一个public对外公开
 **/
public class Index {
    public static void main(String[] arg) {
        Person a = new Person("jisen", 25);
        System.out.println(a.getName());
        System.out.println(a.id);
        // private： 私有的， 对类本身访问，不对外公开
        // Error: age可以在Person中访问private
        // System.out.println(a.age);
        System.out.println(a.getAge());
        System.out.println("-----------");
        Person ba = new Person("Tom", 16);
        System.out.println(ba.getName());
        System.out.println("-----------");
        Person c = new Person("Lucy", 5);
        System.out.println(c.getName());
        System.out.println("-----------");
    }
}


// 默认属性， 仅对当前包和类开放
class Person {
    // protected 受保护的属性，仅能在当前包和类中使用
    protected String id;
    // private 私有属性，仅在当前类中使用， 不对外开放
    private int age;
    String name;


    public Person(String name, int age) {
        this.id = new Date().toString();
        if (age < 10) {
            new BabySpeak();
        } else if (age < 20) {
            Student student = new Student("五年级");

            System.out.println(student.getClassName());
        } else if (age > 60) {

        } else {
            Worker worker = new Worker("程序员");

            System.out.println(worker.getJob());
        }
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Student {

    String className;


    public Student(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}


class Worker {

    String job;


    public Worker(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}