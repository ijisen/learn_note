package lesson.Day07_Recursion;

/**
 * recursion【递归】
 *
 * */
public class Index {
    public static void main(String[] args) {
        System.out.println("main Begin");
        doSome();
        System.out.println("main Over");
    }

    public static void doSome() {
        System.out.println("doSome Begin");
        /** 栈内存溢出 */
        // Exception in thread "main" java.lang.StackOverflowError
        //   doSome();
        System.out.println("doSome Over");
    }
}
