package demo.demo7;


public class Index {
    public static void main(String[] args) {
        Person[] person = new Person[4];

        person[0] = new Teacher("teacher1", 30, true, 5);
        person[1] = new Student("student1", 15, "515");
        person[2] = new Student("student2", 13, "513");
        person[3] = new Teacher("teacher2", 30, false, 5);

        for (int i = 0; i < person.length; i++) {
            Person item = person[i];
            for (int j = i + 1; j < person.length; j++) {
                Person nextItem = person[j];
                if (item.getAge() < nextItem.getAge()) {
                    person[i] = nextItem;
                    person[j] = item;
                }
            }
        }


        for (Person item : person) {
            if (item instanceof Teacher) {
                ((Teacher) item).teach();
            } else if (item instanceof Student) {
                ((Student) item).study();
            }
            item.play();
        }
    }
}

class Person {
    private String name;
    private int age;

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

    public void play() {
        System.out.println("我就是爱玩！");
    }
}

class Student extends Person {
    private String stu_id;

    public Student(String name, int age, String stu_id) {
        super(name, age);
        this.stu_id = stu_id;
    }

    public String getStuId() {
        return stu_id;
    }

    public void setStuId(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我要认真学习");
    }

    public void play() {
        System.out.println(getName() + "爱玩足球");
    }
}


class Teacher extends Person {
    private boolean sex;
    private int work_age;

    public Teacher(String name, int age, boolean sex, int work_age) {
        super(name, age);
        this.sex = sex;
        this.work_age = work_age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getWorkAge() {
        return work_age;
    }

    public void setWorkAge(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我要认真教学");
    }

    public void play() {
        System.out.println(getName() + "爱下象棋");
    }
}