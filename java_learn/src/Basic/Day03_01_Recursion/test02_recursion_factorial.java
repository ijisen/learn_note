package Basic.Day03_01_Recursion;

/**
 * factorial 【递归阶乘】
 */
public class test02_recursion_factorial {
    public static void main(String[] args) {
        System.out.println(factorialMethod(5));
    }

    public static int factorialMethod(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorialMethod(n - 1);
    }
}
