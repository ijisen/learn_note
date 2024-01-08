package lesson.Day04_023_Class_Static_Block.demo.demo3;

/**
 * 类继承时，静态代码块加载顺序
 * <p>
 * 调用B.no 执行类的加载： 调用类的静态属性或方法，就是类加载时。
 */
public class Index {
    public static void main(String[] args) {

        System.out.println("类加载初始");
        /**
         *
         * 1、 构建实例对象， new B() 完成类的加载
         * 2、 静态属性初始化|静态代码块执行， 先执行父类的，再执行子类的，执行顺序看代码定义顺序
         * 3、 普通属性初始化|普通代码块执行
         * */
        new B();
    }
}


class A {
    // A的普通代码块1
    {

        System.out.println("AA 的普通代码块 ——》 1");
    }

    // A的静态代码块1
    static {
        System.out.println("A 的静态代码块 ——》 1");
    }

    // 静态属性初始化
    public static int age = getAge();

    // A的静态代码块2
    static {
        System.out.println("A 的静态代码块 ——》 3");
    }

    public static int getAge() {
        System.out.println("A 的静态属性初始化 ——》 2");
        return 20;
    }

    // A的普通代码块2
    {
        System.out.println("AA 的普通代码块 ——》 2");
    }

    // A的普通属性2
    public int ageT = getAgeT();

    // A的普通代码块3
    {
        System.out.println("AA 的普通代码块 ——》 4");
    }

    public int getAgeT() {
        System.out.println("AA 的普通属性初始化 ——》 3");
        return 20;
    }
}


class B extends A {
    // 隐藏任务
    /* public B () {
        1、 super(); 执行父类普通代码块|普通属性初始化
        2、 执行子类的普通代码块|普通属性初始化
    }*/
    public B () {
        // super()
        // 执行本类的普通代码块和普通属性初始化
        System.out.println("实例对象和实例属性初始化完毕");
    }
    // B的普通代码块1
    {

        System.out.println("BB 的普通代码块 ——》 5");
    }

    // B的静态代码块1
    static {
        System.out.println("B 的静态代码块 ——》 4");
    }

    // 静态属性初始化
    public static int ageB = getAgeBT();

    // B的静态代码块2
    static {
        System.out.println("B 的静态代码块 ——》 6");
    }

    public static int getAgeBT() {
        System.out.println("B 的静态属性初始化 ——》 5");
        return 20;
    }

    // B的普通代码块2
    {
        System.out.println("BB 的普通代码块 ——》 6");
    }

    // B的普通属性
    public int ageBTT = getAgeBTT();

    // B的普通代码块3
    {
        System.out.println("BB 的普通代码块 ——》 8");
    }

    public int getAgeBTT() {
        System.out.println("BB 的普通属性初始化 ——》 7");
        return 20;
    }
}
