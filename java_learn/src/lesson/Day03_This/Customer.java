package lesson.day03_this;

/**
 * 关于java对象this的指向问题
 * 1. this 是一个变量，变量中保存了内存地址指向了自身，this储存在JVM堆内存java对象内部。
 * 2. this 可以出现在“实例方法”中
 * 3. this 在多数情况下，是可以省略不写的。
 */
public class Customer {
    private int id;
    // 没有static关键字的变量：实例变量
    private String name;
    int i;
    static int key;

    /**
     * 构造方法
     */
    public Customer() {
        // 不传参时，采用构造方法调用重置数据；这种方法不会创建新对象
        // this() 只能出现在构造方法的第一行
        this(10, "Default");
        System.out.println("Customer Default Method");
        System.out.println(System.currentTimeMillis());
    }

    /**
     * 构造方法 重载
     */
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 没有static关键字的方法： 实例方法
    // 当一个行为/动作执行的过程需要对象参与，那么这个方法一定要定义为 "实例方法"
    public String getName() {
        return "实例方法 get name: " + this.name;
    }

    // 设置顾客名称
    public void setName(String name) {
        this.name = name;
        this.getName();
    }

    // 读取ID
    public int getId() {
        return this.id;
    }

    // 设置ID
    public void setId(int id) {
        this.id = id;
    }

    // 获取顾客购物状态
    public String shopping() {
        if (this.name != null) {
            return this.name + "购物中...";
        }
        doSome();
        return "么有顾客在购物中";
    }

    // 主方法
    public static void main(String args[]) {
        // 在主方法中调用 method1
        // 完整方式
        Customer.method1();
        // 省略方式
        method1();
        // 在主方法中调用 method2
        // 完整方式
        Customer t = new Customer();
        t.method2();
        // 省略方式 => 没有方式可调用 【static 不能调用实例方法】
    }

    // static 方法
    public static void method1() {
        // 调用 doSome
        // 完整方式
        Customer.doSome();
        // 省略方式
        doSome();
        // 调用 doOther
        // 完整方式
        Customer t = new Customer();
        t.doOther();
        // 省略方式 => 没有方式可调用 【static 不能调用实例方法，也不能调用实例变量】

        System.out.println(key);
        System.out.println("method1");
    }

    // 实例方法
    public void method2() {
        // 调用 doSome
        // 完整方式
        Customer.doSome();
        // 省略方式 static 方法；
        doSome();
        // 调用 doOther
        // 完整方式
        this.doOther();
        // 省略方式 => 没有方式可调用
        doOther();
        key ++;
        System.out.println(key);
        System.out.println(this.id);
        System.out.println("method2");
    }

    // 带 static 无法访问"实例变量", 也无法调用 "实例方法"; 因为实例变量和实例方法都依赖对象；static方法中没有this
    // 带 static 的方法只能通过类名方法调用  Customer.doSome();
    public static void doSome() {
        System.out.println("doSome");
    }

    public void doOther() {
        System.out.println("doOther");
    }
}
