package lesson.Day06_00_inner_class.LocalInnerClass_anonymous.demo.demo1;

/**
 * 匿名对象传参
 *
 * */
public class LocalInnerClassAnonymoseExercise {
    public static void main(String[] args) {
        // 匿名函数写法， 改类只使用一次；
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("show Once");
            }
        });

        /**
         * 传统写法，需要写一个类
         * 如果这个类只使用一次，就显得有点臃肿了
         *
         * */
        f1(new F1());

    }

    public static void f1(IL il) {
        il.show();
    }
}


interface IL {
    public void show();
}

class F1 implements IL {
    public void show() {
        System.out.println("show");
    }
}
