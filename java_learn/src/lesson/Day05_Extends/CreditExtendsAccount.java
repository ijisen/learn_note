package lesson.day05_extends;

public class CreditExtendsAccount extends Account {
    // 信用
    private double credit;

    // 构造函数
    public CreditExtendsAccount() {
    }
    // 构造函数
    public CreditExtendsAccount(String no, double balance, double credit) {
        // 将参数传递给 父类、基类、超类、派生类
        super(no, balance);
        this.credit = credit;
    }

    // 实例方法： 设置信用
    public void setCredit(double credit) {
        this.credit = credit;
    }

    // 实例方法： 获取信用
    public double getCredit() {
        return credit;
    }
}
