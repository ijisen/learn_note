package lesson.Day02_03_ControlStatement;

public class ForDemo4 {
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
