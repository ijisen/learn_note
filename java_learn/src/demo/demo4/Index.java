package demo.demo4;

public class Index {
    public static void main(String[] args) {
        Work work = new Work("work", 1000);
        work.getInfo();
        Worker worker = new Worker("work", 1000);
        worker.getInfo();
        Peasant peasant = new Peasant("work", 1000);
        peasant.getInfo();
        Waiter waiter = new Waiter("work", 1000);
        waiter.getInfo();
        Teacher teacher = new Teacher("work", 1000);
        teacher.getInfo();
        Teacher teacher1 = new Teacher("work", 1000, 10);
        teacher1.getInfo();
        Teacher teacher2 = new Teacher("work", 1000, 100, 20);
        teacher2.getInfo();
        Scientist scientist = new Scientist("work", 1000);
        scientist.getInfo();

    }
}


class Work {
    private String name;
    private double salary;

    public Work(String name, double salary) {
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

    public void getInfo() {
        System.out.println(name + " " + salary);
    }
}

class Worker extends Work {
    private String type = "Worker";

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void getInfo() {
        System.out.println(type + " " + this.getName() + " " + this.getSalary());
    }
}

class Peasant extends Worker {
    private String type = "Peasant";

    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void getInfo() {
        System.out.println(type + " " + this.getName() + " " + this.getSalary());
    }
}

class Waiter extends Worker {
    private String type = "Waiter";

    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void getInfo() {
        System.out.println(type + " " + this.getName() + " " + this.getSalary());
    }
}

class Teacher extends Worker {
    private String type = "Teacher";
    private double ratio = 50;
    private int workDay = 365;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public Teacher(String name, double salary, double ratio) {
        super(name, salary);
        this.ratio = ratio;
    }


    public Teacher(String name, double salary, double ratio, int workDay) {
        super(name, salary);
        this.ratio = ratio;
        this.workDay = workDay;
    }

    @Override
    public void getInfo() {
        double salary = this.getSalary() + (workDay * ratio);
        System.out.println(type + " " + this.getName() + " " + salary);
    }
}

class Scientist extends Worker {
    private String type = "Scientist";
    private double ratio = 2;

    public Scientist(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void getInfo() {
        double salary = this.getSalary() + (ratio * this.getSalary());
        System.out.println(type + " " + this.getName() + " " + salary);
    }
}
