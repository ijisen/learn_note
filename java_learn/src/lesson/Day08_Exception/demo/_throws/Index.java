package lesson.Day08_Exception.demo._throws;

/**
 * throws 异常抛出
 *
 * */
public class Index {
    public static void main(String[] args) {
        method();

    }

    public static void method () throws NullPointerException {
        int i = 1;
        while (true) {
            i++;
            if (i > 10) {
                throw new Error("123");
            }
            System.out.println(i);
        }
    }
}
