package lesson.Day09_03_StringBuilder;

/**
 * StringBuilder  VS StringBuffer
 * 结论：
 * 1、如果字符串存在大量的修改操作，一般使用 StringBuffer 或 StringBuilder
 * ---> 单线程， 使用 StringBuilder
 * ---> 多线程，使用 StringBuffer
 * 2、如果字符串修改操作很少，使用 StringBuffer 或 String
 *
 * 效率：
 * StringBuffer > StringBuilder > String
 */
public class BuilderVsBuffer {
    public static void main(String[] args) {
        int count = 20000;
        StringBuilderTest(count);

        StringBufferTest(count);

        StringTest(count);

    }


    public static void StringBuilderTest(int count) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuilder str1 = new StringBuilder("");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            str1.append(i);
        }
        endTime = System.currentTimeMillis();

        // 10s
        System.out.println("StringBuilder 的执行时间： " + (endTime - startTime));
    }


    public static void StringBufferTest(int count) {
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer str1 = new StringBuffer("");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            str1.append(i);
        }
        endTime = System.currentTimeMillis();

        // 10s
        System.out.println("StringBuffer 的执行时间： " + (endTime - startTime));
    }

    public static void StringTest(int count) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;

        startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            text = text + i;
        }

        endTime = System.currentTimeMillis();

        // 10s
        System.out.println("String 的执行时间： " + (endTime - startTime));
    }

}


