package Basic.Day03_01_Recursion;
/**
 * 递归 recursion
 * 递归容易造成栈内存泄漏
 */

public class test01_recursion_sum_01 {
    public static void main(String[] args) {
        System.out.println("11111");
        System.out.println(count(10));
        System.out.println(countWithRecursion(10));
        System.out.println(plusWithRecursion(5));
    }

    // 不使用递归求和
    public static int count(int max) {
        int total = 0;
        for (int i = 1; i <= max; i++) {
            total += i;
        }
        return total;

    }

    // 使用递归求和
    public static int countWithRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return n + countWithRecursion(n - 1);
    }

    public static int plusWithRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return n * plusWithRecursion(n - 1);
    }
}