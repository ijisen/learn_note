package lesson.Day07_01_Annotation;

import java.util.ArrayList;

/**
 * 注解（Annotation）
 * --> 也被称为元数据（MetaData），用于修饰解释 包、类、方法、属性、构造器、局部变量等数据信息
 * --> 与【注释】不一样，注解不影响程序的逻辑，但【注解】可以被编译或运行，相当于嵌入在代码中的补充信息
 *
 * @Override 重写
 * @Deprecated 过时
 * @SuppressWarnings 忽略警告
 *
 * 元注解 --》 修饰注解的注解， 可以参考上面三个注解的源码
 @Documented    //修饰会被javadoc提取，生成到javadoc文档
 @Retention(RetentionPolicy.RUNTIME|SOURCE|CLASS)  // 注解保留生命周期  源码|编译类|JVM
 @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE}) // 申明可修饰程序元素
 */


public class Index {
    public static void main(String[] args) {
        AA aa = new AA();
        //
        BB bb = new BB();
    }
}

class A {
    public void run() {
        System.out.println("A run");
    }
}

class AA extends A {
    /**
     * 不写 override 也会构成重写。
     * 添加 override 注解的好处是，java编译器会去验证该重写方法是否合法
     */
    @Override
    public void run() {
        super.run();
    }
}

/**
 * 1、表示不推荐使用，即将废除
 * 2、可以修饰 CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE
 */

@Deprecated
class BB extends A {
    @Deprecated
    private String name;

    @Deprecated
    public void runBB() {
        @Deprecated
        String localName = "sdf";
        System.out.println("RUN bb");
    }

    @Deprecated
    public BB(String name) {
        this.name = name;
    }

    public BB() {
    }
}

/**
 * 取消告警提示
 * <p>
 * all 所有
 * unused
 * unchecked
 * *** 很多修饰符
 * <p>
 * SuppressWarnings 的作用范围与放置的位置有关， 作用范围一般都是{}
 */
class CC {
    @SuppressWarnings({"all"})
    public void run() {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Hmm");
    }

    @SuppressWarnings({"unchecked", "xxx"})
    public void runA() {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Hmm");
    }
}
