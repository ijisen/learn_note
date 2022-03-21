package lesson.Day08_01_Opp.Test_04_Customer;

public class Index {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "5xdf";
        System.out.println(customer.name);

        // 销毁后， JVM会自动收回堆内存的垃圾
        customer = null;
        // null
        System.out.println(customer);
    }
}
