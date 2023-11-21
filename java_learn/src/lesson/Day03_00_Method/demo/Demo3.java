package lesson.Day03_00_Method.demo;

public class Demo3 {
    public static void main(String[] arg) {
        Monkey monkey = new Monkey();
        int count = monkey.run(1, 10);
        System.out.println(count);

    }
}

class Monkey {
    public int run(int num, int day) {
        System.out.println("day: " + day + " num: " + num);
        if (day == 1) {
            return num;
        }
        return run(num * 2 + 1, day-1) + num;
    }
}
