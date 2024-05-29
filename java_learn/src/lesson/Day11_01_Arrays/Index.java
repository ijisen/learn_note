package lesson.Day11_01_Arrays;

import java.util.Arrays;

public class Index {
    public static void main(String[] args) {
        Integer arr[] = {1, -10, 0, -10, 8, 20, 8, 30};

        Arrays.sort(arr);


       /* int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            Integer a = arr[i];
            for (int j = i + 1; j < len; j++) {
                Integer b = arr[j];
                if (a > b) {
                    a += b;
                    b = a - b;
                    a = a - b;
                    arr[i] = a;
                    arr[j] = b;
                }
            }

        }*/
        // [-10, -10, 0, 1, 8, 8, 20, 30]
        // [-10, -10, 0, 1, 8, 8, 20, 30]
        System.out.println(Arrays.toString(arr));
    }
}
