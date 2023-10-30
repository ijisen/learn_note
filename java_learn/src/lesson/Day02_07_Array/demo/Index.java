package lesson.Day02_07_Array.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Index {
}

class ArrayDemo1 {
    public static void main(String[] arg) {
        int arr[] = {4, -1, 9, 10, 23};
        int maxIndex = 0;
        int maxVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println(maxVal);

        /**
         * 数组冒泡
         * */
        int arrV[] = {4, -1, 9, 1, 2, 9, -2, -3, 0, 1, 5, 8, 11, -20, 0};
        for (int i = 0; i < arrV.length - 1; i++) {
            for (int k = i; k < arrV.length; k++) {
                if (arrV[i] > arrV[k]) {
                    int next = arrV[k];
                    arrV[k] = arrV[i];
                    arrV[i] = next;
                }

            }
        }
        System.out.println(Arrays.toString(arrV));
    }
}

/**
 * 已知一个数组为升序，添加一个数字后，该数组仍为升序
 */
class ArrayDemo2 {
    public static void main(String[] arg) {
        int[] arr = {10, 12, 45, 90};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入需要插入的元素：");
        int inputNum = myScanner.nextInt();
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];
        newArr[newArr.length - 1] = inputNum;
        for (int i = 0; i < arr.length; i++) {
            if (inputNum < arr[i]) {
                newArr[i] = inputNum;
                for (int k = i; k < arr.length; k++) {
                    System.out.println("i=" + (k + 1) + "; val=" + arr[k]);
                    newArr[k + 1] = arr[k];
                }
                break;
            } else {
                System.out.println("输入值[" + inputNum + "]不小于当前值[" + arr[i] + "]，直接赋值");
                newArr[i] = arr[i];
            }
        }

        // arr 重新赋值
        arr = newArr;

        System.out.println(Arrays.toString(arr));

    }
}
