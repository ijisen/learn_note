package lesson.Day04_021_Class_This.demo;

public class demo3 {
    public static void main(String[] arg) {
        Employee a = new Employee("jisen", true, 20, "works", 28000);
        a.getEmployer();
    }
}

class Employee {
    String name;
    boolean gender;
    int age;
    String work;
    double price;

    public Employee(String work, double price) {
        this.work = work;
        this.price = price;
    }

    public Employee(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name, boolean gender, int age, String work, double price) {
        this(name, gender, age);
        // this 构造器必须放第一条数据
//        this(work, price);
        this.work = work;
        this.price = price;
    }

    public void getEmployer() {
        System.out.println("name: " + this.name + ",gender: " + this.gender + ",age: " + this.age + ",work:" + this.work + ",price: " + this.price);
    }
}
