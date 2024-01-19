package demo.demo10;

public class Index {
    public static void main(String[] args) {
        AA aa = new AA();

        aa.getDate();
        System.out.println(" --------");
        aa.run();

    }
}


class A {
    // 公开的
    public int aAge = 10;
    // 缺省 默认
    int aId = 20;
    // 受保护的
    protected int aOrder = 30;
    // 私有属性
    private int aCard = 40;

    public void getDate() {
        System.out.println(this.aAge);
        System.out.println(this.aId);
        System.out.println(this.aOrder);
        System.out.println(this.aCard);
    }
}


class AA extends A {
    public void run() {
        System.out.println(this.aAge);
        System.out.println(this.aId);
        System.out.println(this.aOrder);
        // 私有属性， 不能在子类中使用
        //        System.out.println(this.aCard);
    }
}
