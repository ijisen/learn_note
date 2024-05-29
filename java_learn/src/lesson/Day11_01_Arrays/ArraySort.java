package lesson.Day11_01_Arrays;

public class ArraySort {
    public static void main(String[] args) {

    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i; j < arr.length; j++) {
                int b = arr[j];
                // 5 20
                if (a > b) {
                    // 25
                    a += b;
                    // 25 -20
                    arr[j] = a - b;
                    // 25 -20
                    arr[i] = a - b;
                }
            }

        }

    }

    // 结合冒泡 + 定制
}
