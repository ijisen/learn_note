package lesson.Day04_027_Class_Polymorphic_DynamicBinding;

/**
 * DynamicBinding: java 动态绑定机制（非常重要）
 * --> 1、当调用对象方法的时，该方法会和该对象的内存地址/运行类型绑定
 * --> 2、当在对象方法中调用对象属性的时，没有动态绑定机制，哪里有申明就使用哪里的属性值(就近原则)， 看编译类型
 */
public class Index {
    public static void main(String[] args) {
        // 向上转型
        // a 的编译类型是A
        // a 的运行类型是B
        A a = new B();
        // 属性没有重写之说，属性的值看编译类型
        // 10
        System.out.println(a.i);
        /**
         * 执行步骤：
         * 1、看a的运行类型： 是B
         * 2、去B里面找sum方法， 未找到。
         * 3、去A里面找sum方法： 找到了
         * 4、调用getI方法： 原则： 调用对象方法时，会去运行类型B中去找
         * 5、去B中找getI，找到了
         * 6、B中有i变量，直接B的i值 20 返回（属性没有动态绑定机制）
         * */
        // a.sum => b.getI  => 20 + 5 = 25
        System.out.println(a.sum());
        /**
         * 执行步骤：
         * 1、 看a的运行类型： 是B
         * 2、 去B里面找sumI， 未找到
         * 3、 去父类A中找sumI， 找到了
         * 4、 sumI找i值，属性没有动态绑定机制，就近原则获取（A中有i,故去A中的i值 10）
         *
         * */
        // a.sumI -> 10 + 10 = 20
        System.out.println(a.sumI());
    }
}


class A {
    public int i = 10;

    public int sum() {
        return getI() + 5; // 20 + 5
    }

    public int sumI() {
        // 属性没有动态绑定机制，哪里申明使用哪里
        return i + 7; // 10 + 7
    }

    public int getI() {
        // 属性没有动态绑定机制，哪里申明使用哪里
        return i;
    }
}


class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int sumI() {
//        return i + 10;
//    }

    public int getI() {
        return i;
    }
}
