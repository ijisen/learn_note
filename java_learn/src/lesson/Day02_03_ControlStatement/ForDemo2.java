package lesson.Day02_03_ControlStatement;

public class ForDemo2 {
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
