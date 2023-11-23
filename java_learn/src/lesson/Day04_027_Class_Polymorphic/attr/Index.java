package lesson.Day04_027_Class_Polymorphic.attr;

/**
 * 属性的重写问题
 *
 * 属性没有重写之说，属性的值看编译类型；
 *
 * */
public class Index {
    public static void main(String[] arg) {
        Base base = new Sub();
        /** 属性没有重写之说，属性的值看编译类型 */
        // 10
        System.out.println(base.count);
        /** 方法调用，看运行类型 */
        // Sub count 20
        base.run();
        // 20
        System.out.println(((Sub) base).count);

    }
}


class Base {
    int count = 10;

    public void run() {
        System.out.println("Base count " + this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void run() {
        System.out.println("Sub count " + this.count);
    }
}