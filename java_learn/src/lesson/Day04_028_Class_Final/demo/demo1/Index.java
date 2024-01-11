package lesson.Day04_028_Class_Final.demo.demo1;

/**
 * static + final 修饰的静态常量不会引起类的加载
 *
 * */
public class Index {
    public static void main(String[] arg) {

        // System.out.println(A.AGE);
        A.getAge();
//        B.getAge();
        // 不会执行B的静态代码块
        System.out.println(B.AGE);
    }
}


class A {
    public static int AGE = 25;

    public static void getAge() {
        System.out.println(AGE);
    }

    static {
        System.out.println("A 的静态代码块");
    }
}
class B {
    public static final int AGE = 20;

    /*
    不推荐的写法 'static' method declared 'final'
    public static final void getAge() {
        System.out.println(AGE);
    }*/

    static {
        System.out.println("B 的静态代码块");
    }
}
