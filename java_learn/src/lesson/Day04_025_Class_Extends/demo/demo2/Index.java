package lesson.Day04_025_Class_Extends.demo.demo2;

public class Index {

    public static void main(String[] arg) {
        Sub_Pupil a = new Sub_Pupil("meimei", 12, 80, "123");
        a.testing();
        System.out.println("-------------\n");
        Sub_Graduate b = new Sub_Graduate("tom", 24, 251, "789");
        b.testing();

    }

}
