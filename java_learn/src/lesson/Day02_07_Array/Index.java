package lesson.Day02_07_Array;


import java.util.Arrays;

/**
 * 数组
 * 数组的定义方式
 * => 数据类型 数组名[] = new 数据类型[大小]
 * ===> int arr[] = new int[4]
 * => 数据类型[] 数组名 = {val1,val2,val3}
 * ===> int[] arr = {1,2,3,4,5}
 * => 数据类型[] 数组名 = new 数据类型[大小]
 * ===> int[] arr = new int[4]
 *
 * */
public class Index {
    public static void main(String[] arg) {
        // 第一种数组定义方式
        // 先声明，再分配空间，等价于 int array[] = new int[5];
        int array[];
        array = new int[5];
        array[0] = 999;
        System.out.println("定义了一个长度为5，数据为int的数组：" + array.length);
        System.out.println("--------------\b");

        // 第二种数组定义方式
        int[] array_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // foreach 循环
        for (int item: array_1) {
            System.out.println(item);
        }

        // 第三种定义方式
        int[] array_2 = new int[5];
        array_2[0] = 11;
        array_2[1] = 22;
        array_2[2] = 33;
        array_2[3] = 44;
        array_2[4] = 55;
        System.out.println(Arrays.toString(array_2));

        int[] arr_3 = new int[10];
        System.out.println(Arrays.toString(arr_3));

    }
}
