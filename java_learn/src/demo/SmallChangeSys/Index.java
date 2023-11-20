package demo.SmallChangeSys;

import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
       /* System.out.println("---------零钱通菜单-----------");
        System.out.println("[1]: 零钱通明细");
        System.out.println("[2]: 入账");
        System.out.println("[3]: 消费");
        System.out.println("[4]: 退出");
        System.out.println("请选择(1-4):");
        Scanner myScanner = new Scanner(System.in);
        int inputNum = myScanner.nextInt();
        System.out.println(inputNum);*/
        new Change(500);

    }
}


/*
class ChangelogItem {
    String[] item = new String[4];
}
*/

class ChangeLog {
    String logs[] = new String[0];

    public void getArray() {
        if (logs.length > 0) {
            for (String item : logs) {
                System.out.println(item);
            }
        } else {
            System.out.println("还没有历史数据");
        }
    }

    public void setArray(String item) {
        String[] newArr = new String[logs.length + 1];
        newArr[newArr.length - 1] = item;
        for (int i = 0; i < logs.length; i++) {
            newArr[i] = logs[i];
        }

        // arr 重新赋值
        logs = newArr;
    }
}

class Change {
    double amount;
    ChangeLog log = new ChangeLog();

    Scanner myScanner = new Scanner(System.in);

    public Change(double amount) {
        this.amount = amount;
        System.out.println("---------零钱通菜单-----------");
        System.out.println("[1]: 零钱通明细");
        System.out.println("[2]: 入账");
        System.out.println("[3]: 消费");
        System.out.println("[4]: 退出");
        voidInputType();
    }

    public void voidInputType() {
        System.out.println("请选择(1-4):");
        int inputNum = myScanner.nextInt();
        System.out.println(inputNum);
        inputTypeValidator(inputNum);
    }


    public void inputTypeValidator(int type) {
        switch (type) {
            case 1:
                getList();
                System.out.println("\t");
                voidInputType();
                break;
            case 2:
                inCrease();
                System.out.println("\t");
                voidInputType();
                break;
            case 3:
                deCrease();
                System.out.println("\t");
                voidInputType();
                break;
            case 4:
                myScanner.close();
                System.out.println("关闭成功");
                break;
            default:
                System.out.println("请选择有效的参数");
                System.out.println("\t");
                voidInputType();
        }

    }

    public void getList() {
        log.getArray();

    }

    public boolean inputValueValidator(double num) {
        return (num > 0 && num < 50000);
    }

    public void inCrease() {
        System.out.println("请输入收益金额！");
        int inputNum = myScanner.nextInt();
        System.out.println(inputNum);
        if (inputValueValidator(inputNum)) {
            amount += inputNum;
            System.out.println("添加成功，当前余额：" + amount);
            log.setArray("入账\t +" + inputNum + "\t时间\t余额：" + amount);
        } else {
            System.out.println("输入的money有问题！");
        }

    }

    public void deCrease() {
        System.out.println("请输入消费金额！");
        int inputNum = myScanner.nextInt();
        System.out.println(inputNum);
        if (inputValueValidator(inputNum) && inputNum <= amount) {
            amount -= inputNum;
            System.out.println("添加成功，当前余额：" + amount);
            log.setArray("消费\t +" + inputNum + "\t时间\t余额：" + amount);
        } else {
            System.out.println("输入的money有问题！");
        }

    }


}

