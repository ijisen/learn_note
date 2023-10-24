package lesson.Day02_03_ControlStatement.demo;

public class ForBreakLabelDemo {
    public static void main(String[] arg) {

    }
}

class ForBreakLabelDemo1 {
    public static void main(String[] arg) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println(i);
                break;
            }
        }
    }
}

class ForBreakLabelDemo2 {
    public static void main(String[] args) {

        label1:
        for (int row = 1; row <= 2; row++) {
            label2:
            for (int i = 1; i <= 9; i++) {
                System.out.println(row + "+" + i);
                if (i == 2) {
                    break label1;
                }
            }
        }
    }
}
