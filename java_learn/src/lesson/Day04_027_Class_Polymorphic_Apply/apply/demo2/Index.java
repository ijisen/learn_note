package lesson.Day04_027_Class_Polymorphic_Apply.apply.demo2;

/**
 * 多态应用实例 => 多态参数
 * <p>
 * Animal  Food
 */
public class Index {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 1000);
        Manager manager = new Manager("manger", 1000, 50);

        Index a = new Index();
        a.showEmpAnnual(tom);
        a.showEmpAnnual(manager);
    }

    public void showEmpAnnual(Employee e) {
        e.getAnnual();
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).work();
        }

    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getAnnual() {
        System.out.println(salary * 12);
    }
}


class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + "is work");
    }

    @Override
    public void getAnnual() {
        super.getAnnual();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println(getName() + "is manage");
    }

    @Override
    public void getAnnual() {
        System.out.println(getSalary() * 13);
    }

}
