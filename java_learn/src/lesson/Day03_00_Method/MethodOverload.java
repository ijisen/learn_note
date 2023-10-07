package lesson.Day03_00_Method;

/**
 * 方法重载
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.5, 2.5));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}
