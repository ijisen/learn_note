package lesson.Day04_025_Class_Extends.demo.demo4;

/**
 *
 * super() 和 this()的区别;
 *
 * super 调用超类的构造函数，必须放第一行
 * ----> 子类构造器默认调用父类的super()
 *
 * this 调用当前类的构造函数，必须放第一行
 * */
public class Index {
    public static void main(String[] arg) {
        // a
        // B name: tom
        // B
        new B();
        System.out.println("----------\n");
        // a
        // B name: timi
        new B("timi");
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        // 此处有this() , 不再调用隐藏的super()
        this("tom");
        System.out.println("B");
    }

    B(String name) {
        // 优先调用super() 方法； 输出 => a
        // super()
        System.out.println("B name: " + name);
    }
}
