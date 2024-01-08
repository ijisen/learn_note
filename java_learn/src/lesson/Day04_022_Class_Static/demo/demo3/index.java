package lesson.Day04_022_Class_Static.demo.demo3;

public class index {

    public static void main(String[] args) {
        Children child1 = new Children("白骨精");
        // count 为共享  静态变量|类变量
        System.out.println(Children.count);
        Children child2 = new Children("蜘蛛精");
        System.out.println(child1.getCount());
        System.out.println(Children.count);

    }
}
