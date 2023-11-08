package lesson.Day04_024_Class_Encapsulation.demo.demo2;

public class Account {
    private String name;
    private String password;
    private double amount;

    public Account(String name, String password, double amount) {
        this.setName(name);
        this.setPassword(password);
        this.setAmount(amount);
    }

    public void setName(String name) {
        int len = name.length();
        if (len > 4 || len < 2) {
            System.out.println("用户名不正确");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        int len = password.length();
        if (len < 6 || len > 8) {
            System.out.println("密码不正确");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setAmount(double amount) {
        if (amount < 20) {
            System.out.println("余额必须大于20");
        } else {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void info() {
        System.out.println(name + " " + amount + " " + password);
    }
}
