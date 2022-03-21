package lesson.Day08_02_This.Test_02_Method;

public class Index {
    /**
     * 实例变量
     */
    private int i = 10;

    /**
     * 静态方法
     */
    public static void doSome() {
        System.out.println("do Some");
    }

    /**
     * 实例方法
     */
    public void doOther() {
        System.out.println("do Other");
    }

    /**
     * 静态方法
     */
    public static void method1() {
        System.out.println("method 1");
        // 调用 doSome 【静态方法】
        // 完整方法调用: 类名.方法名
        Index.doSome();
        // 完整方法调用2
        Index ee = new Index();
        /**
         * 【静态方法】调用既可使用 类名.方法名  也可使用 ee.方法名；
         *  但即使采用 ee.方法名 调用，实际上执行的时候和引用的对象无关；
         *  建议调用静态方法使用： 类名.方法名
         * */
        ee.doSome();
        ee = null;
        // 下面的方法不会报 空指针异常错误
        ee.doSome();
        // 省略方法调用
        doSome();

        // 调用 doOther【实例方法】
        // 完整方法调用： 使用构造方法调用
        Index cc = new Index();
        cc.doOther();
        // 省略方法调用
        // -- 无发调用： 实例方法不能再静态方法中直接访问

        // 访问i
        // 完整方式访问
        System.out.println(cc.i);
        // 省略方式访问
        // 无法访问： 实例变量不能再静态方法中直接访问

    }

    /**
     * 实例方法
     */
    public void method2() {
        System.out.println("method 2");
        // 调用 doSome【静态方法】
        // 完整方法调用： 类名.静态方法名
        Index.doSome();
        // 省略方法调用
        doSome();

        // 调用 doOther【实例方法】
        // 完整方法调用： this.实例方法名
        this.doOther();
        // 省略方法调用
        doOther();

        // 访问i
        // 完整方式访问
        System.out.println(this.i);
        // 省略方式访问
        System.out.println(i);
    }

    // 主方法【静态方法】
    public static void main(String[] args) {
        // 要求在这个调用 method1【静态方法】
        // 使用完整方法： 类名.静态方法名
        Index.method1();
        // 使用省略方法
        method1();
        // 要求在这里调用method2【实例方法】
        // 使用完整方法： 使用构造方法调用
        Index cc = new Index();
        cc.method2();
        // 使用省略方法
        // -- 无发调用： 实例方法不能再静态方法中直接访问

    }
}
