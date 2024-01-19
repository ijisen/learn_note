package demo;

/**
 * 属性没有动态绑定机制，哪里申明哪里使用，
 * <p>
 * <p>
 * 方法有动态绑定机制，从自己一级一级往父类中找
 */
public class demo12 {
    public static void main(String[] args) {
        B b = new B();
        // 10
        /**
         * 调用run方法，触发动态绑定机制
         * 先去B中找run
         * 没有找到，再去A中找
         * 查找i的值，
         * 属性没有动态绑定机制，哪里申明就哪里使用，A中有A，故直接使用
         * 故返回10
         *
         * */
        System.out.println(b.run());
        // 20
        /**
         * 调用runA方法，触发动态绑定机制
         * 先去B中找runA方法，
         * 没有找到，再去A中找
         * 找到了，再去B中找getI方法，触发动态绑定机制
         * 找到了,查找i的值
         * 属性没有动态绑定机制，哪里申明就哪里使用，B中有B，故直接使用
         * 故返回20
         *
         * */
        System.out.println(b.runA());

    }
}


class A {
    int i = 10;

    public int run() {
        return i;
    }

    public int runA() {
        return getI();
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    int i = 20;


    public int getI() {
        return i;
    }
}