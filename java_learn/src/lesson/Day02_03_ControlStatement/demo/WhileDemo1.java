package lesson.Day02_03_ControlStatement.demo;

public class WhileDemo1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
