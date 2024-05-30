package lesson.Day11_01_Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1, -11, 2, 4, -5, 6, 7, 8, -20};
        bubble(arr, new Comparator() {
            @Override
            public boolean compare(int a, int b) {
                return a < b;
            }
        });

    }

    public static void bubble(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // 1 -11
                if (c.compare(arr[i], arr[j])) {
                    // 1 + -11 => -10
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    // 结合冒泡 + 定制
}


class Comparator {
    public boolean compare(int a, int b) {
        return a > b;
    }
}