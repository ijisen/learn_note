package lesson.Day13_00_Date.demo.demo1;

import java.util.Arrays;

public class index {
    public static void main(String[] args) {
        String str = "abcdef";

        /*String str2 = "";
        for (int i = str.length() - 1; i > -1; i--) {
            str2 += str.charAt(i);
        }

        System.out.println(str2);*/
        reverse(str, 1, 3);
        reverse(str, 2, 4);
        reverse(str, 2, 6);
        reverse(str, 1, 6);
        //        reverse(str, 1, 7);
    }

    static String reverse(String str, int start, int end) {
        int str_len = str.length();
        if (str_len == 0) {
            throw new Error("参数错误！");
        }
        if (start < 1 || end > str_len) {
            throw new Error("参数错误！");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start - 1, j = end - 1; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        System.out.println(str + "" + start + "" + "" + end);
        System.out.println(new String(chars));
        System.out.println('\r');
        return str;
    }
}
