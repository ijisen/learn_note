package lesson.Day07_01_Annotation.demo.demo4;

public class Index {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        // 匿名内部类
        cellphone.testWork(new Work() {
            @Override
            public void test() {
                System.out.println("computer work");
            }
        });
    }
}

interface Work {
    void test();
}

class Cellphone {
    void testWork (Work work) {
        work.test();
    }
}
