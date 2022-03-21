package lesson.Day08_02_This.Test_03_Customer;

public class Index {
    public static void main(String args[]) {
        Customer user1 = new Customer();
        user1.setName("张三");
        System.out.println(user1.getName());
        System.out.println(user1.shopping());
        Customer.doSome();
        Customer user2 = new Customer();
        System.out.println(user2.getName());
        System.out.println(user2.shopping());
    }
}
