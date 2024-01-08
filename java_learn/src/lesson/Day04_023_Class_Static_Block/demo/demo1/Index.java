package lesson.Day04_023_Class_Static_Block.demo.demo1;

/**
 * 类继承时，静态代码块加载顺序
 *
 * 调用B.no 执行类的加载： 调用类的静态属性或方法，就是类加载时。
 *
 * */
public class Index {
   public static void main(String[] args) {

       System.out.println("类加载初始");
       System.out.println(B.no);
   }
}


class A {
    public static int age = getAge();

    static {
        System.out.println("A 的静态代码块 ——》 2");
    }

    public static int getAge() {
        System.out.println("A 的静态属性初始化 ——》 1");
        return 20;
    }
}


class B extends A {

    public static int no = getNo();

    static {
        System.out.println("B 的静态代码块 ——》 4");
    }

    public static int getNo() {
        System.out.println("B 的静态属性初始化 ——》 3");
        return 20;
    }
}
