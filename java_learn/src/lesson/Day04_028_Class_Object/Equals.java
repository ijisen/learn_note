package lesson.Day04_028_Class_Object;


/**
 * JAVA Object equals 类详解
 */
public class Equals {
    public static void main(String[] args) {

        /**
         *
         *  == vs equals
         *  == 是一个比较运算符；
         *  --> 1、如果判断基本类型，判断值是否相等: eg: in i = 10; double d = 10.0
         *  --> 2、如果判断引用类型，判断引用地址是否相等,即判断是否为同一个对象
         *  ----> ps: 类型不一样，java会报错，比较类型之间没有任何关系
         * */
        int a = 10;
        // true
        int b = 10;
        System.out.println(a == b);
        // Error: 不可比较的类型: java.lang.String和int
        // java 有编译阶段和运行阶段；
        // 编译阶段有预处理功能， 类型不一样不能比较
        //        System.out.println("1" == 5);
        B bb = new B();
        A aa = bb;
        // true
        System.out.println(aa == bb);
        // true
        System.out.println(65 == 65.0f);
        // true
        System.out.println(65 == 65.0);
        // java 有编译阶段和运行阶段；
        // 编译阶段有预处理功能， 类型不一样不能比较
        // Error: 不可比较的类型: java.lang.String和java.lang.Integer
        // System.out.println("new" == new Integer(10));

        /**
         * equals 是Object类中的方法，只能判断引用类型
         * --> 默认判断地址是否相等，子类中再判断值是否相等
         * */
        // int 为基本类型，没有Object方法
        // Error: 无法取消引用int
        //        System.out.println(a.equals(b));
        System.out.println("---------\n");
        System.out.println(aa.equals(bb));

        A a1 = new A();
        A a2 = new A();
        A a3 = a1;
        // equals 来自Object，判断 Object 是否相等
        // false
        System.out.println(a1.equals(a2));
        // a1 a3 都指向了同一个对象
        System.out.println(a1.equals(a3));
        // false
        System.out.println(a1 == a2);
        // class C 重写equals
        System.out.println(new C().equals(new C()));

        String s1 = new String("1");
        String s2 = new String("1");
        // true
        System.out.println(s1.equals(s2));
        // true
        System.out.println(new String().equals(new String()));
        // false
        System.out.println(s1 == s2);


    }
}

class A {

}

class B extends A {
    /*public boolean equals(Object obj) {
        System.out.println("只能判断引用类型");
        return false;
    }*/

}

class C extends A {
    public boolean equals(Object obj) {
        System.out.println("我是方法重写");
        return true;
    }
}

