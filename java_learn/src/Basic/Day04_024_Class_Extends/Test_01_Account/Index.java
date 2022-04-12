package Basic.Day04_024_Class_Extends.Test_01_Account;

public class Index {

    public static void main(String[] args) {
        Account t1 = new Account(11111, "timi", 99999);
        System.out.println(t1.name);
        System.out.println(t1.getBalance());
        System.out.println(t1.getCellphone());

        CreditAccount t2 = new CreditAccount(22222, "lucy", 100000, 100);
        System.out.println(CreditAccount.bank);
        System.out.println(t2.name);
        t2.setCredit(80);
        System.out.println(t2.getCredit());
    }
}
