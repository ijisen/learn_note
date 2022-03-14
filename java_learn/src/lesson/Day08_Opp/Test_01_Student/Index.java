package lesson.Day08_Opp.Test_01_Student;

public class Index {
    public static void main(String[] args) {
        // 在类加载的时候
        Student u = new Student();
        System.out.println(u.name);
        System.out.println(u.addr);
        u.name = "tom";
        System.out.println(u.name);
        u.addr = new Addr();
        u.addr.address = "xxxx";
        System.out.println(u.addr.address);
    }
}