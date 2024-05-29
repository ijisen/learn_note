package lesson.Day10_01_Math;

public class index {
    public static void main(String[] args) {
        double abs = Math.abs(-5.555);
        System.out.println(abs);

        // 4.0
        System.out.println(Math.ceil(3.8));
        // 4.0
        System.out.println(Math.ceil(3.4));
        // 3.0
        System.out.println(Math.floor(3.8));
        // 3.0
        System.out.println(Math.floor(3.4));
        // 4.0
        System.out.println(Math.round(3.8));
        // 3.0
        System.out.println(Math.round(3.4));

        System.out.println(Math.pow(3.8, 3.2));
        // 0~1
        System.out.println(Math.random());

        // 20
        System.out.println(Math.max(10, 20));
        // 10
        System.out.println(Math.min(10, 20));


        for (int i = 0; i < 10; i++) {
            // min + random * max - min +1
            int min = 2;
            int max = 10;
            System.out.println((int) (min + Math.random() * (max - min + 1)));
        }
    }
}
