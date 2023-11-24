package lesson.Day04_022_Class_Static.demo.demo2;

public class Index {
    public static void main(String[] arg) {
        Child child = new Child("1");
        child.count++;
        System.out.println(Child.count);

        Child child2 = new Child("2");
        child2.count++;
        System.out.println(Child.count);

        Child child3 = new Child("3");
        child2.count++;
        System.out.println(Child.count);

    }
}


class  Child {
    private String name;
    public static int count;

    public Child(String name) {
        this.name = name;
    }
}