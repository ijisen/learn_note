package lesson.Day04_29_Class_Abstract.demo.demo2;

public class Index {
    public static void main(String[] arg) {
        Employee work = new Employee("work", "123", 5800.0);
        work.work();
        Manager manager = new Manager("manager", "123", 5800.0, 80.0);
        manager.work();
    }
}


abstract class CommonEmployee {
    private String name;
    private String id;
    private Double salary;

    public CommonEmployee(String name, String id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    // 抽象方法
    public abstract void work();
}


class Employee extends CommonEmployee {

    public Employee(String name, String id, Double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("员工 " + this.getName() + "工作中");
    }

}

class Manager extends CommonEmployee {
    private Double bonus;

    public Manager(String name, String id, Double salary, Double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理 " + this.getName() + "工作中");

    }
}
