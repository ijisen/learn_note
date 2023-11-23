package lesson.Day04_027_Class_Polymorphic.attr;

public class Index2 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        // 20
        System.out.println(sub.count);
        // 20
        sub.run();

        Base base = sub;


        System.out.println(sub == base);
        // 10
        System.out.println(base.count);
        // 20
        base.run();
    }
}
