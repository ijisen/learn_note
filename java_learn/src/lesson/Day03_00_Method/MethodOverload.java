package lesson.Day03_00_Method;

/**
 * 方法重载（overLoad）
 * 方法名相同，形参不一样（个数，参数类型）
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.5, 2.5));
        System.out.println("\t");

        MethodOverloadM a = new MethodOverloadM();
        System.out.println(a.cp(10));
        System.out.println(a.cp(10, 20));
        System.out.println(a.cp("20000"));
        System.out.println("\t");

        MethodOverloadMax b = new MethodOverloadMax();
        System.out.println(b.max(10, 50));
        System.out.println(b.max(10.0, -20.01));
        System.out.println(b.max(10, -20.0, 200));

    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}

class MethodOverloadM {
    public int cp (int a) {
        return a*a;
    }
    public int cp (int a, int b) {
        return a*b;
    }
    public String cp (String a) {
        return a;
    }
}

class MethodOverloadMax {
    public int max (int a, int b ) {
        return a > b ? a : b;
    }
    public double max (double a, double b) {
        return a > b ? a : b;
    }
    public double max (double a, double b, double c) {
        return a > b ? (a > c ? a :c) : (b > c ? b : c);
    }
}
