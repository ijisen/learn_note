package demo.demo5;

public class Index {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        bankAccount.deposit(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withDraw(500);
        System.out.println(bankAccount.getBalance());

        System.out.println("---------------");
        CheckingAccount checkingAccount = new CheckingAccount(500);
        checkingAccount.deposit(1000);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withDraw(500);
        System.out.println(checkingAccount.getBalance());
        System.out.println("---------------");

        System.out.println("---------------");
        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withDraw(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withDraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withDraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        System.out.println("---------------");

    }
}


class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 存款
    public void deposit(double amount) {
        balance += amount;
    }

    // 取款
    public void withDraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    // 重写存款
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    // 重写取款
    @Override
    public void withDraw(double amount) {
        super.withDraw(amount + 1);
    }
}


class SavingsAccount extends BankAccount {
    private int freeCount = 3;
    private double rate = 0.01;

    public SavingsAccount(double balance) {
        super(balance);
    }


    // 重写存款
    @Override
    public void deposit(double amount) {
        if (freeCount > 0) {
            freeCount -= 1;
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
    }

    // 重写取款
    @Override
    public void withDraw(double amount) {
        if (freeCount > 0) {
            freeCount -= 1;
            super.withDraw(amount);
        } else {
            super.withDraw(amount + 1);
        }
    }

    public void resetFreeCount() {
        this.freeCount = 3;
        super.deposit(getBalance() * rate);
    }
}
