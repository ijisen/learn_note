package lesson.Day06_00_inner_class.LocalInnerClass_anonymous;

/**
 * 缺省修饰符【同包中使用】
 */
class Outer {
    private int n1 = 10;

    public void anonymous() {
        // 传统接口实现方式：
        Tiger tiger = new Tiger();
        tiger.cry();
        Dog dog = new Dog();
        dog.cry();
        // 匿名函数实现方式, 使用即销毁，只使用一次。
        // 底层实现方式等同于Tiger， 类名 xxx.Outer$1
        // class Outer$3 implements IA {}
        IA tiger2 = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger2 is Cry");
            }
        };
        // class lesson.Day06_00_inner_class.LocalInnerClass_anonymous.Outer$1
        System.out.println(tiger2.getClass());
        tiger2.cry();

        // class Outer$3 implements IA {}
        IA dog2 = new IA() {
            @Override
            public void cry() {
                System.out.println("dog2 is Cry");
            }
        };

        // class lesson.Day06_00_inner_class.LocalInnerClass_anonymous.Outer$2
        System.out.println(dog2.getClass());
        dog2.cry();

        // class Outer$3 extends Father {}
        Father father = new Father("Tom")  {
            public void run () {
                System.out.println("run hmm");
            }

        };

        // class lesson.Day06_00_inner_class.LocalInnerClass_anonymous.Outer$3
        System.out.println(father.getClass());
        father.test();
        /**
         * 会报错，编译不通过
         * 原因： 编译类型是Father， Father中没有run 方法。
         * */
        // father.run();

        /**
         * 这样可以允许， 匿名类直接new
         * */
        new Father("hmm") {
            public void run () {
                System.out.println("run hmm");
            }
        }.run();
    }

}

interface IA {
    void cry();
}

// 传统接口实现方式：
class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("Tiger is Cry");
    }
}

// 传统接口实现方式：
class Dog implements IA {
    @Override
    public void cry() {
        System.out.println("Dog is Cry");
    }
}

class Father {
    public Father(String name) {
        super();
    }

    protected void test() {
        System.out.println("father Test");

    }
}
