package lesson.Day06_00_inner_class.LocalInnerClass;


public class Outer2 {private int n1 = 200;

    public void m2 () {
        System.out.println("m2 runed");
    }


    // 外部类的实例方法
    public void m1() {
        // 局部内部类，定义在外部类的方法中
        class LocalInner {
            // 局部内部类可以访问外部类的所有方法和属性（包括私有属性）;
            // ps: 是直接访问， 不能加 this
            void f1() {
                // 不能加 this
                System.out.println(n1);
                m2();
            }
        }
        // 可以用 final 修饰 类， 该类不可以被继承
        final class LocalInner2 {

        }

        // 局部内部类可以继承类
        class LocalInner3 extends LocalInner { }
        //TODO:  局部内部类得先申明才能调用，
        // new LocalInner4().run();
        class LocalInner4 extends AA {

        }


        // 代码块
        {
            System.out.println("局部内部类-代码块");
        }

        new LocalInner3().f1();
        new LocalInner4().run();
    }
}
