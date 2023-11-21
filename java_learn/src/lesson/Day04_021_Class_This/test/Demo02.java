package lesson.Day04_021_Class_This.test;

public class Demo02 {
    public static void main(String[] arg) {
        MaxNum a = new MaxNum();
        a.getMaxNum(5.00, 50);

    }
}

class MaxNum {
    // 缺省构造器
    public MaxNum () {
        System.out.println("我是缺省构造器");
    }

    public double getMaxNum (double a, double b) {
        return a > b ? a : b;
    }
}
