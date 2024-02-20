package lesson.Day08_Exception;

/**
 * run exception【运行时异常】- 四种常见运行时异常类型
 * --> 空指针异常 NullPointerException
 * --> 数组下标越界 ArrayIndexOutOfBoundsException
 * --> 类型转换异常 ClassCastException
 * --> 数字格式不正确 NumberFormatException
 */
public class Run_Exception {
    public static void main(String[] args) {

        // NullPointerException
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            // java.lang.NullPointerException
            e.printStackTrace();
        }

        // ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            // java.lang.ArrayIndexOutOfBoundsException
            e.printStackTrace();
        }

        // ClassCastException
        try {
            A b = new B();
            B b2 = (B) b;
            C b3 = (C) b;
        } catch (Exception e) {
            // java.lang.ClassCastException
            e.printStackTrace();
        }

        // NumberFormatException
        try {
            String num = "123g";
            int num2 = Integer.parseInt(num);
            System.out.println(num2);
        } catch (NumberFormatException e) {
            // java.lang.NumberFormatException
            e.printStackTrace();
        }
    }
}


class A {

}

class B extends A {
}

class C extends A {
}
