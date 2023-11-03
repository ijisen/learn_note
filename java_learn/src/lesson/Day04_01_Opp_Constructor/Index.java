package lesson.Day04_01_Opp_Constructor;

/**
 * 面向对象-构造方法（类的构造器）
 * --> 1、构造方法又被称为构造函数||构造器||Constructor
 * --> 2、构造方法结构：
 * -------> [修饰符列表] 构造方法名（形式参数列表） { 构造方法体 }
 * --> 3、构造方法的 “返回值类型” 不需要指定，并且也不能写 void； public name (params) {}
 * --> 4、构造方法名必须和类名一致
 * --> 5、构造方法的作用：
 * ------->通过调用构造方法，创建对象；
 * ------->通过调用构造方法，初始化实例对象；
 * --> 6、构造方法的调用
 * -------> new 构造方法名(参数)
 * --> 7、如果没有定义构造器，系统会默认构建一个无参构造器
 */
public class Index {
    public static void main(String[] args) {
        new User();
        new User(10);
        new User("timi");

        // 调用 static 方法： 类名.方法名
        Index.doSome();
        doSome();

        // 调用 无static 方法： 引用.方法名
        Index tt = new Index();
        tt.doOther();

        Account account = new Account(2021234567, 0);
        account.getAccount();
        account.getBalance();
        account.setBalance(999);
        account.getBalance();
    }

    /**
     * doSome with static
     */
    private static void doSome() {
        System.out.println("do some!");
    }

    /**
     * doOther without static
     */
    private void doOther() {
        System.out.println("do Other!");
    }
}
