package lesson.Day05_01_Interface.demo.demo1;

public class Index {
    public static void main(String[] args) {
        TV tv = new TV();
        run(tv);
        CP cp = new CP();
        run(cp);


    }

    public static void run(A a) {
        a.open();
        a.close();
    }
}

/**
 * interface 定义接口规范
 */
interface A {

    public static final String type = "type";

    // 在接口中，抽象方法可以省略 abstract
    // public 可省略, 虽然省略了， 但实际上还是public修饰, 并不是【缺省】修饰
    void open();

    void close();
}

/**
 * implements 中规范具体化
 */
class TV implements A {

    @Override
    public void open() {
        System.out.println("TV implements open");
    }

    @Override
    public void close() {
        System.out.println("TV implements close");
    }
}


class CP implements A {

    public void open() {
        System.out.println("CP implements open");
    }

    public void close() {
        System.out.println("CP implements close");
    }
}
