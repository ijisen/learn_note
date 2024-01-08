package lesson.Day04_022_Class_Static.demo.demo3;

public class Children {
    static int count;
    private String name;

    public Children(String name) {
        // count 自动++
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }
}
