package lesson.Day03_00_Method.demo;

public class Demo1 {
    public static void main(String[] arg) {
        Demo1_isOdd a = new Demo1_isOdd();
        System.out.println(a.isOdd(2));
        System.out.println(a.isOdd(21));

    }

}

class Demo1_isOdd {

    public boolean isOdd(int num) {
        return num % 2 == 0;
    }
    
}

