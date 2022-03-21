package lesson.Day09_00_Extends.Test_01_Account;

/**
 * 创建一个 creditAccount
 */
public class CreditAccount extends Account {

    // 信用
    private double credit;


    public double getCredit() {
        return credit;
    }

    public CreditAccount(double credit) {
        this.credit = credit;
    }

    public CreditAccount(int no, String name, double balance, double credit) {
        super(no, name, balance);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}
