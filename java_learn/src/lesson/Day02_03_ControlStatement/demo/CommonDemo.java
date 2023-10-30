package lesson.Day02_03_ControlStatement.demo;

public class CommonDemo {
    public static void main(String[] arg) {
        /**
         * 某人有100000元，每次经过路口需要交过路费，缴费规则如下：
         * 1） 当现金>50000时，每次交5%；
         * 2） 当现金<=50000时，每次交1000
         * 编程计算该人可以经过多少个路口，要求使用while break方式完成
         *
         * */

        double amount = 100000;
        int count = 0;
        while (true) {
            double price = 1000;
            if (amount > 50000) {
                price = amount*0.05;
            }
            System.out.println("本次过路费：" + price);
            amount -= price;
            System.out.println("余额：" + amount);
            count++;
            if (amount < 1000) {
                break;
            }
        }
        System.out.println(count);

    }
}
