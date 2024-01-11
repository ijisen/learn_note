package lesson.Day05_01_Interface.demo.demo2;

public class Index {
}

// 接口A
interface A {
    // public static final name = "A";
    String name = "A";

    void runA();
}

// 接口B
interface B {
    // public static final name = "B";
    String name = "B";

    void runB();
}

// 接口AA 继承A和B
interface AA extends A, B {
    void runC();
}

// 类继承A
class BB implements A {

    @Override
    public void runA() {

    }
}

// 类继承接口A&B
class CC implements A, B {

    @Override
    public void runA() {

    }

    @Override
    public void runB() {

    }
}

// 类继承接口AA
class DD implements AA {

    @Override
    public void runA() {

    }

    @Override
    public void runB() {

    }

    @Override
    public void runC() {

    }
}

class EE {

}

// 类继续 EE 同时继承接口A&B
class FF extends EE implements A, B {

    @Override
    public void runA() {

    }

    @Override
    public void runB() {

    }
}