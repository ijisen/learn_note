package lesson.Day06_00_inner_class;

/**
 * 【内部类】
 * 类的五大成员
 * 1、属性： 静态属性[静态变量]、实例属性[普通常量、实例常量]
 * 2、方法： 静态方法、实例方法
 * 3、构造器：
 * 4、代码块：静态代码块|普通代码块
 * 5、内部类：
 * 【内部类分类】
 * 1、定义在外部类的局部位置上，比如方法内 LocalInnerClass
 * --> 局部内部类（有类名） LocalInnerClass
 * --> 匿名内部类（没有类名） LocalInnerClass_anonymous
 * ----> 局部内部类和匿名内部类： 限制规则是一样的
 * 2、定义在外部类的成员位置上 MemberInnerClass
 * --> 成员内部类（没有static修饰符）
 * --> 静态内部类（有static修饰符）
 */
public class Index {
    // 构造器
    public Index() {
    }
}

/**
 * 内部类基本结构
 */
// 外部类
class Outer {
    // 外部内的属性
    private int n1 = 100;

    // 外部内的方法
    public void m1() {
        System.out.println("m1");
        /** 局部内部类 */
        class LocalInnerClass {

        }
    }

    // 外部内的构造器
    public Outer(int n1) {
        this.n1 = n1;
    }

    // 外部内的代码块
    {
        System.out.println("Outer block");
    }

    /** 成员内部类 */
    class Inner {

    }
}

// 其它类
class Other {

}
