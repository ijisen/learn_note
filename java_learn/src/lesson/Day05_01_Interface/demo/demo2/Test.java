package lesson.Day05_01_Interface.demo.demo2;

public class Test {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        bbb.job();
        BBBB bbbb = new BBBB();
        bbbb.job();
    }
}

class AAA {
    public void job() {
        System.out.println("AAA job");
    }

    public void run() {
        this.job();
    }
}

class BBB extends AAA {
    // 类的继承， 这里叫重写， 不重写不会报错
    @Override
    public void job() {
        System.out.println("BBB job");
    }
}

abstract class AAAA {
    // 抽象类实现
    abstract void job();
}

class BBBB extends AAAA {
    // 抽象类，不实现抽象方法会报错
    @Override
    public void job() {
        System.out.println("BBBB job");
    }
}
