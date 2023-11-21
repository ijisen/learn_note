package lesson.Day04_025_Class_Extends_Super;

/**
 * super 代表一个父类的引用， 用于访问父类的构造器、 属性、 方法
 * ---- 基本语法
 * ------>1) 不能访问父类的私有属性、私有方法
 * ------>2) super(参数列表); 只能放在构造器的第一行，且只能出现一次
 * ------>3) super 从父级开始，一级一级往上找
 * ------>4) this 从本类开始， 一级一级往上找
 */
public class Index {
    public static void main(String[] arg) {
        C c = new C();
        c.run();
    }
}

class A {
    String id = "A id";
    String idCard = "A idCard";

}

class B extends A {
    String name;
    public double score;
    private String idCard;
    private int age;

    public B(String name, double score, String idCard, int age) {
        this.name = name;
        this.score = score;
        this.idCard = idCard;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private String getIdCard() {
        return idCard;
    }
}


class C extends B {
    String name = "C name";

    public C() {
        super("B name", 90, "456", 25);
    }

    public void run() {
        // 从父类开始， 一级一级往上找
        // super 访问属性
        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.score);
        // Error: age为私有属性
        // System.out.println(super.age);
        System.out.println("---------------\n");

        // 从本类开始,一级一级往上找
        System.out.println(name);
        System.out.println(score);
        System.out.println("---------------\n");

        // 从本类开始,一级一级往上找
        System.out.println(this.name);
        System.out.println(this.score);

        // super 访问方法
        System.out.println(super.getAge());
        // Error: getIdCard为私有方法
        //        super.getIdCard();

    }
}