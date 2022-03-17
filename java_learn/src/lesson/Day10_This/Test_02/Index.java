package lesson.Day10_This.Test_02;

public class Index {
    public static void main(String[] args) {
        /**
         * 实例方法调用必须通过对象的方式调用
         * */
        // java: 无法从静态上下文中引用非静态 方法 doOther()
        // Index.doOther();
        // java: 无法从静态上下文中引用非静态 变量 this
        // this.doOther();
        Index cc = new Index();
        cc.doOther();

        // 不推荐此方法调用， 容易混淆， 推荐使用：  Index.doSome()
        // doSome();
        // 静态方法调用，类名.方法名
        Index.doSome();


        cc.run();
    }

    public static void doSome() {
        System.out.println("'do some'");
        // java: 无法从静态上下文中引用非静态 变量 this
        // System.out.println(this);
    }

    public void doOther() {
        System.out.println("'do other'");
    }

    public void run() {
        System.out.println("'run'");
        // 不推荐此方法调用， 容易混淆; 推荐使用 this.doOther();
        // doOther();
        // 实力方法调用
        this.doOther();
        // 静态方法调用
        Index.doSome();
    }
}
