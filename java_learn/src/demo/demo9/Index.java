package demo.demo9;

public class Index {
    public static void main(String[] args) {
        new C();
        // 多态 向上转型
        A b = new B();
        // A name
        System.out.println(b.getName());
        /** 属性没有重写之说，属性的值看编译类型 */
        // A name
        System.out.println(b.name);
        // 多态 向上转型
        A c = new C();
        /** 属性没有重写之说，属性的值看编译类型 */
        // A name
        System.out.println(c.name);
        System.out.println(c.getName());
    }
}


class A {
    String name = "A Name";

    public A() {
        System.out.println("我是无参构造器A");
    }

    public String getName() {
        return name;
    }
}

class B extends A {
    String name = "B Name";

    public B() {
        // super() 隐藏任务
        System.out.println("我是无参构造器B");
    }

    public B(String name) {
        // super() 隐藏任务
        System.out.println("我是" + name + "构造器B");
    }

    public String getName() {
        return name;
    }
}

class C extends B {
    String name = "C Name";

    public C() {
        this("c name");
        System.out.println("我是无参构造器C");
    }

    public C(String name) {
        super("b name");
        System.out.println("我是" + name + "构造器B");
    }

    public String getName() {
        return name;
    }
}