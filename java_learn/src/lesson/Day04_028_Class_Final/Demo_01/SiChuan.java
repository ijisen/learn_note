package lesson.Day04_028_Class_Final.Demo_01;

// final 修饰的类 不可被继承
// public class SiChuan extends Chinese_Final
public class SiChuan extends Chinese {
    /**
     * String: 是一种引用数据类型： 字符串
     * province： 是一种引用实例变量
     */
    final static String province = "四川";

    // final 修饰的方法不可被重写
//    public void countryRun () {
    public void countryRun(String name) {
        System.out.println(name);
    }
}
