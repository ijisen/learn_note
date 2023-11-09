package lesson.Day04_025_Class_Extends.demo.demo3;


/**
 * 继承的内存分析
 * 1、 生成栈内存
 * 2、 根据逻辑生成方法区内存
 * 3、 生成堆内存
 * <p>
 * 访问属性原则: 就近原则
 */
public class Index {
    public static void main(String[] arg) {
        Son son = new Son();
        System.out.println(son.name);
    }
}

// class GrandPa extends Object
class GrandPa {
    String name = "大头爷爷";
    String hoby = "旅游";

    public void getName() {
        System.out.println(this.name);
    }
}

class Father extends GrandPa {
    String name = "大头爸爸";
    int age = 39;

    public void getName() {
        System.out.println(this.name + this.age);
    }
}

class Son extends Father {
    String name = "小头儿子";
}


