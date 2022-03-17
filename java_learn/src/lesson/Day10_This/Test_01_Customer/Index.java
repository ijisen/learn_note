package lesson.Day10_This.Test_01_Customer;

public class Index {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "c1";
        c1.shopping();

        Customer c2 = new Customer();
        c2.name = "c2";
        c2.shopping();
        Customer.doSome();
    }
}
