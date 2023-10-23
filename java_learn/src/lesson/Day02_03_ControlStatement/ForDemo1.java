package lesson.Day02_03_ControlStatement;

public class ForDemo1 {
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
