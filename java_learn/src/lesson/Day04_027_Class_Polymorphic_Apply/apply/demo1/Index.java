package lesson.Day04_027_Class_Polymorphic_Apply.apply.demo1;

/**
 * 多态应用实例 => 多态数组
 *
 * */
public class Index {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("person", 80);
        persons[1] = new Teacher("teacher", 30, 50000);
        persons[2] = new Student("student1", 15, 80);
        persons[3] = new Student("student2", 14, 90);
        persons[4] = new Student("student3", 14, 96);

        for (Person item : persons) {
            item.say();
            // 判断 item 的运行类型是否为 Teacher
            if (item instanceof Teacher) {
                // Person 中没有 teach方法，所以需要强转类型
                // 强转只是为了编译通过
                ((Teacher) item).teach();
            }

            // 判断 item 的运行类型是否为 Student
            else if (item instanceof Student) {
                // Person 中没有 study方法，所以需要强转类型
                // 强转只是为了编译通过
                ((Student) item).study();
            }
            System.out.println("---------\n");
        }
    }
}

class Person {
    private String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + " " + this.age);
    }
}


class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void say() {
        System.out.println(getName() + " " + age + " " + score);
    }

    public void study() {
        System.out.println("老师" + getName() + "正在学习");
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void say() {
        System.out.println(getName() + " " + age + " " + salary);
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在讲课");
    }
}
