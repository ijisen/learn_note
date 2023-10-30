package lesson.Day02_03_ControlStatement.demo;

public class WhileDemo2 {
    public static void main(String[] arg) {
        int i = 40;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
