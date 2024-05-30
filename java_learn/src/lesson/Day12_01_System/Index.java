package lesson.Day12_01_System;

import java.util.Arrays;

/**
 * System
 */
public class Index {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        /**
         * arraycopy
         * src： 源数组
         * dest： 目标数组
         * destPos： 开始位置（索引）
         * length： 复制个数
         *
         * */

        int[] src = {1, 2, 3};
        int[] dest = new int[4];
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(dest));

        /**
         * exit
         * 退出当前程序
         *
         * */
        System.out.println("111111111111111");
        // 0 表示当前退出状态
        System.exit(0);
        System.out.println("222222222");

    }
}
