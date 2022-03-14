package lesson.Day08_Opp.Test_01_Student;

public class Index {
    public static void main(String[] args) {
        /**
         * u 是一个变量，是一个引用。是局部变量； u保存内容地址指向堆内存的Student对象
         * new Student 是一个学生对象
         * ps: 堆内存方法不能直接调用
         * */
        Student u = new Student();
        // 输出Student对象内部实例变量的值
        System.out.println(u.name);
        System.out.println(u.addr);
        // 修改 Student 对象内部实例变量值
        u.name = "tom";
        System.out.println(u.name);
        //
        u.addr = new Addr();
        u.addr.address = "xxxx";
        System.out.println(u.addr.address);
    }
}