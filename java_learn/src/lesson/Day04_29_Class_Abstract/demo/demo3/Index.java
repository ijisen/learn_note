package lesson.Day04_29_Class_Abstract.demo.demo3;

/**
 * 抽象类应用场景 - 模板设计模式
 */
public class Index {
    public static void main(String[] args) {
        AA a  = new AA();
        BB b = new BB();

        a.run();
        b.run();
    }
}

// 抽象类型
abstract class Template {
    // 抽象实例方法
    public abstract void job();

    public void run () {
        // 动态绑定， 从子类开始找此方法
        this.job();
        System.out.println("job has run");
    }
}

class AA extends Template {
    // 重写抽象实例方法
    public void  job(){
        System.out.println("AA Job");
    }

}
class BB extends Template {
    // 重写抽象实例方法
    public void  job(){
        System.out.println("BB Job");
    }

}
