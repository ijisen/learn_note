package lesson.Day10_This.Test_01_Customer;

public class Customer {

    // 实例变量
    String name;


    // 实例方法
    public void shopping() {
        System.out.println(name);
    }

    // this 不能在带有 static 方法中使用
    // java: 无法从静态上下文中引用非静态 变量 name
    public static void doSome() {
        System.out.println("9999");
        // System.out.println(name);
        // System.out.println(this.name);
        Customer cc = new Customer();
        cc.name = "456";
        System.out.println(cc.name);
    }

}
