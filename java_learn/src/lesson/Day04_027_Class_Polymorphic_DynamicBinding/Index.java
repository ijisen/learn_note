package lesson.Day04_027_Class_Polymorphic_DynamicBinding;

/**
 * DynamicBinding: java 动态绑定机制（非常重要）
 * --> 1、当调用对象方法的时，该方法会和该对象的内存地址/运行类型绑定
 * --> 2、当调用对象属性的时，没有动态绑定机制，哪里有申明就使用哪里的属性值(就近原则)
 */
public class Index {
    public static void main(String[] args) {
        // a 的编译类型是A
        // a 的运行类型是B
        A a = new B();
        // 10
        System.out.println(a.i);
        /**
         * 执行步骤：
         * 1、先去运行类型B中查找sum方法
         * 2、在B中没有,又去集成的A中查找sum方法
         * 3、执行A中的sum方法
         * 4、查找getI
         * 5、继续回到运行类型B中，查找getI方法
         * 6、执行执行 getI
         * 7、getI的属性i，就近原则获取i值
         * */
        // a.sum => b.getI  => 20
        System.out.println(a.sum());
        // a.sumI -> 10 + 10 = 20
        System.out.println(a.sumI());
    }
}


class A {
    public int i = 10;

    public int sum() {
        return getI() + 10; // 20 + 10
    }

    public int sumI() {
        return i + 10; // 10 + 10
    }

    public int getI() {
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
