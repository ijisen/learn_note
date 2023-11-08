package lesson.Day04_029_Modifier.demo.demo2;

import lesson.Day04_029_Modifier.demo.demo1.Baby;

public class Index {
    public static void main(String[] arg) {
        // Baby 是一个public 类，
        // 可以在不同包中调用
        new Baby();
    }
}
