package Basic.Day04_024_Class_Extends.Test_01_Account;

/**
 * 创建一个 account 对象
 */
public class Account {
    /**
     * 发卡行
     */
    static String bank = "中国银行";
    /**
     * 账号
     */
    int no;
    /**
     * 用户名
     */
    String name;
    /**
     * 手机号
     */
    int cellphone;
    /**
     * 余额
     * 私有属性，不会被继承
     */
    private double balance;

    /**
     * 缺省构造器 【构造函数】 不会被继承
     */
    public Account() {
    }

    /**
     * 缺省构造器 【构造函数】 不会被继承
     */
    public Account(int no, String name, double balance) {
        this.no = no;
        this.name = name;
        this.balance = balance;
    }

    /**
     * 读取手机号
     */
    public int getCellphone() {
        return cellphone;
    }

    /**
     * 修改手机号
     */
    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * 读取余额
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置余额
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
