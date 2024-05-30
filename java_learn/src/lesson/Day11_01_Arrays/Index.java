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

        /**
         * 二叉树查找
         * ps: 二叉树查找必须是有序数组
         * ps: 如果没有找到， return -(low + 1) => key not found [low 数组得长度]
         * */
        System.out.println(Arrays.binarySearch(arr, 850));


        /**
         * 数组拷贝
         * // [-10, -10, 0, 1]
         * */
        Integer[] arr2 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(arr2));
    }
}
