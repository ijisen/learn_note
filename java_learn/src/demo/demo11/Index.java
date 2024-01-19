package demo.demo11;

public class Index {
    public static void main(String[] args) {
        AA aa = new AA();

        aa.run();

    }
}


class A {
    String name;
    int id = 999;

    public A(String name) {
        this.name = name;
    }
    public A() {
        this.name = "默认";
    }
}


class AA extends A {
    int id;

    public AA(String name, int id) {
        super(name);
        this.id = id;
    }

    public AA(int id) {
        this.id = id;
    }

    public AA(String name) {
        this.name = name;
    }
    public AA() {
//        this("123", 20);
//        super("80");
//        this.id = 90;
//        super(20);
    }

    public void run () {
        String id = "locale Name";
        System.out.println(id);
        System.out.println(this.id);
        System.out.println(super.id);
        System.out.println(this.name + "-" + this.id);
    }

}
