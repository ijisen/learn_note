package Basic.Day03_01_Recursion;

/**
 * 递归求和实例
 */
public class test01_recursion_sum {
    public static void main(String[] args) {
        System.out.println(sumCount(4));
    }

    public static int sumCount(int n) {
        if (n > 1) {
            return sumCount(n - 1) + n;
        } else {
            return n;
        }
    }
}
