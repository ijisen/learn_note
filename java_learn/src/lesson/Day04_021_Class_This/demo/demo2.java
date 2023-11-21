package lesson.Day04_021_Class_This.demo;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 3, 5, 48, 6};
        CopyArr a = new CopyArr(arr);
        a.getArr();

        a.getCircleArea(4);
        a.getCircleLength(4);
    }
}


class CopyArr {
    int[] arr;

    public CopyArr(int[] arr) {
        this.arr = new int[arr.length];
        for (int i = 0, len = arr.length; i < len; i++) {
            this.arr[i] = arr[i];
        }
    }

    public void getArr() {
        System.out.println(Arrays.toString(this.arr));
    }

    public void getCircleArea (double r) {
        double area = Math.PI * r * r;
        System.out.println(area);
    }

    public void getCircleLength (double r) {
        double length = Math.PI * r * 2;
        System.out.println(length);
    }
}