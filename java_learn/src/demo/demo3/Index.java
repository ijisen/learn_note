package demo.demo3;

public class Index {
    public static void main(String[] args) {
        Person person = new Person("tom", 25, "普工", 1000);
        person.introduce();
        Teacher teacher = new Teacher("tom", 25, "教授", 1000, 1.3);
        teacher.introduce();
        Teacher teacher1 = new Teacher("tom", 25, "副教授", 1000, 1.2);
        teacher1.introduce();
        Teacher teacher2 = new Teacher("tom", 25, "讲师", 1000, 1.1);
        teacher2.introduce();

    }
}

class Person {
    private String name;
    private int age;
    private String post;
    private double salray;

    public Person(String name, int age, String post, double salray) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salray = salray;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalray() {
        return salray;
    }

    public void setSalray(double salray) {
        this.salray = salray;
    }

    public void introduce () {
        System.out.println(name + " " + age + " " + post + " " + salray);
    }
}


class Teacher extends Person {
    private double ratio;

    public Teacher(String name, int age, String post, double salray, double ratio) {
        super(name, age, post, salray);
        this.ratio = ratio;
    }

    @Override
    public void introduce () {
        System.out.println(getName() + " " + getAge() + " " + getPost() + " " + getSalray() * ratio);
    }
}
