package lesson.Day02_03_ControlStatement.demo;

public class ForDemo {
    public static void main(String[] arg) {
        // for 循环联系
    }
}

class ForDemo1 {
    public static void main(String[] args) {
        for (int y = 1; y < 10; y++) {
            String str = "";
            for (int x = 1; x <= y; x++) {
                int result = x * y;
                str = x + "*" + y + "=" + result;
                if (result < 10) {
                    str += "  ";
                } else {
                    str += " ";
                }
            }
            System.out.println(str);
        }
    }
}
class ForDemo2 {
    public static void main(String[] args) {
        int rows = 0;
        String str = "";
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                // 素数，只能被自己和1整除。
//                System.out.println(i + "%" + k + "=" + (i % k));
                if ((i % k) == 0) {
                    count++;
                    if (count > 2) {
                        break;
                    }
                }
            }
            if (count <= 2) {
                if (rows == 8) {
                    rows = 0;
                    System.out.println(str);
                    str = "";
                } else {
                    rows++;
                    str = str + i;
                    str += " ";
                }
            }
        }
    }
}

class ForDemo3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                count++;
                sum += i;
                System.out.println("i=" + i);
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}

class ForDemo4 {
    public static void main(String[] args) {

        for (int row = 1; row <= 9; row++) {
            String str = "";
            for (int i = 1; i <= row; i++) {
                str += (i + " * " + row + " = " + i * row) + '\t';

            }
            System.out.println(str);
        }
    }
}
