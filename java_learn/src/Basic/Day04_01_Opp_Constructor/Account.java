package Basic.Day04_01_Opp_Constructor;

/**
 * 创建一个 account 对象
 */
public class Account {
    // 账户
    private int account;
    // 余额
    private double balance;

    /**
     * 读取账户
     */
    public int getAccount() {
        System.out.println(account);
        return account;
    }

    /**
     * 设置账户余额
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 读取账户余额
     */
    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public Account(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }
}
