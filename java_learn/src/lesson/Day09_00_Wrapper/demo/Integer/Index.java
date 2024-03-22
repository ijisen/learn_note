package lesson.Day09_00_Wrapper.demo.Integer;

public class Index {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        // False 对象比较的是： 他们是否为同一个对象
        System.out.println("a=b: " + (a == b));
        System.out.println("-----------------------");

        Integer a1 = 1; // Integer.valueOf(1) => 自动装箱
        Integer b1 = 1; // Integer.valueOf(1) => 自动装箱
        // true
        System.out.println("a1=b1: " + (a1 == b1));
        System.out.println("-----------------------");

        Integer a2 = 128; // Integer.valueOf(128) => 自动装箱 => -128<x<127 => new Integer(128)
        Integer b2 = 128; // Integer.valueOf(128) => 自动装箱 => -128<x<127 => new Integer(128)
        // false, 比较的是他们是否为同一个对象
        System.out.println("a2=a2: " + (a2 == b2));
        // 128
        System.out.println(a2);
        System.out.println("-----------------------");


        Integer a3 = new Integer(127);
        Integer b3 = new Integer(127);
        // False 对象比较的是： 他们是否为同一个对象
        System.out.println("a3=b3: " + (a3 == b3));
        System.out.println("-----------------------");


        Integer a4 = new Integer(128);
        Integer b4 = new Integer(128);
        // False 对象比较的是： 他们是否为同一个对象
        System.out.println("a4=b4: " + (a4 == b4));
        System.out.println("-----------------------");

        Integer a5 = 127; // => Integer.valueOf(127) => 127 => 自动装箱
        Integer b5 = 127; // => Integer.valueOf(127) => 127 => 自动装箱
        // true
        System.out.println("a5=b5: " + (a5 == b5));
        System.out.println("-----------------------");

        Integer a6 = new Integer(127); // 对象
        Integer b6 = 127; // => Integer.valueOf(127) => 127 => 自动装箱
        // false
        System.out.println("a6=b6: " + (a6 == b6));
        System.out.println("-----------------------");


        Integer a7 = 127; // => Integer.valueOf(127) => 127 => 自动装箱
        int b7 = 127;
        // true 只要数据由基本类型，就判断值是否相等
        System.out.println("a7=b7: " + (a7 == b7));
        System.out.println("-----------------------");

        Integer a8 = 128; // => Integer.valueOf(128) => new Integer(128)
        int b8 = 128;
        // true 只要数据由基本类型，就判断值是否相等
        System.out.println(a8 == b8);
        System.out.println("-----------------------");
    }
}
