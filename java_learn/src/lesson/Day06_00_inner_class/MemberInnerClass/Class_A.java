package lesson.Day06_00_inner_class.MemberInnerClass;


public class Class_A {
    String name = "Class_A";
    static String s_name = "Class_static_A_name";
    /**
     * 成员内部类
     */
    public class InnerA {
        public String public_name = "public InnerA";
        protected String protected_name = "protected InnerA";
        String name = "InnerA";
        private String private_name = "private InnerA";
        public void run () {
            System.out.println(this.name);
            System.out.println(name);
            // 内部类访问外部类的属性和方法
            // 外部类名+this.属性和方法名
            System.out.println(Class_A.this.name);
        }
    }

    public void runA() {
        InnerA innerA = new InnerA();
        System.out.println(innerA.name);
        /** 可以访问私有属性 */
        System.out.println(innerA.private_name);
        System.out.println(innerA.protected_name);
        System.out.println(innerA.public_name);

        System.out.println("----------");

        InnerB innerB = new InnerB();
        System.out.println(innerB.name);
        /** 可以访问私有属性 */
        System.out.println(innerB.private_name);
        System.out.println(innerB.protected_name);
        System.out.println(innerB.public_name);
    }
    public InnerA getInnerA() {
        // 私有属性不会被返回
        return new InnerA();
    }
    /**
     * 私有成员内部类
     */
    private class InnerB {
        public String public_name = "public InnerB";
        protected String protected_name = "protected InnerB";
        String name = "InnerB";
        private String private_name = "private InnerB";
    }

    /**
     * 静态成员内部类， 使用&访问规则遵循 static 规则
     * --> 即： 只能访问静态方法和静态属性
     */
    static class InnerC {
        public String public_name = "public InnerC";
        protected String protected_name = "protected InnerC";
        String name = "InnerC";
        private String private_name = "private InnerC";
        {
            System.out.println("Inner C constructor");
        }
        public void runInnerC () {
            // 内部静态类只能访问外部类的静态属性
            System.out.println(Class_A.s_name);
            System.out.println(this.public_name);
            System.out.println(protected_name);
            System.out.println(name);
            System.out.println(private_name);
        }
    }

    public InnerC getInnerC () {
        // 私有属性不会被返回
        return new InnerC();
    }

    /**
     * 私有静态类
     * */
    private static final class InnerD {
        public String public_name = "public InnerD";
        protected String protected_name = "protected InnerD";
        String name = "InnerD";
        private String private_name = "private InnerD";
    }
}
