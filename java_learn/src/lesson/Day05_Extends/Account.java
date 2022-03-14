package lesson.Day05_Extends;

public class Account {
    // 私有属性不会被继承，只能通过set、get方法读取
    // 卡号
    private String no;
    // 余额
    private double balance;

    // 构造方法；不会被继承
    public Account() {
    }

    // 构造方法： 不会被继承
    public Account(String no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    // 实例方法： 设置账号
    public void setNo(String no) {
        this.no = no;
    }

    // 实例方法： 获取账号
    public String getNo() {
        return this.no;
    }

    // 实例方法： 设置余额
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 实例方法：获取余额
    public double getBalance() {
        return balance;
    }
}
