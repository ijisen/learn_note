package lesson.Day04_023_Class_Static_Block.demo.demo2;

/**
 * 类继承时，普通代码块加载顺序
 * <p>
 * 创建实例对象时 new B()： 就是类加载时。
 */
public class Index {
    public static void main(String[] args) {
        new B();
    }
}


class A {
    public int age = getAge();

    // 普通代码块|实例代码块
    static {
        System.out.println("A 的实例代码块 ——》 2");
    }

    public int getAge() {
        System.out.println("A 的普通属性初始化 ——》 1");
        return 20;
    }
}


class B extends A {

    // 隐藏任务
   /* public B () {
        1、 super(); 执行父类普通代码块|普通属性初始化
        2、 执行子类的普通代码块|普通属性初始化
    }*/

    public int no = getNo();

    {
        System.out.println("B 的普通代码块 ——》 4");
    }

    public int getNo() {
        System.out.println("B 的普通属性初始化 ——》 3");
        return 20;
    }
}
