package lesson.Day04_028_Class_Final.Demo_01;

/**
 * 创建一个 chinese 对象
 */
public class Chinese {
    /**
     * 国家
     * 静态变量在类加载的时候就已经初始化，就已经开辟了内存空间，
     * 静态变量储存在方法区内存中
     */
    static String countryCode;

    /**
     * private 私有属性不能直接访问，只能通过get|set方法
     */
    private String countryName = "china";

    public String getCountryName() {
        return countryName;
    }

    /**
     * final
     * 1、 不会被继承
     * 1、 不能修改
     */
    final String country = "中国";

   public final void countryRun () {
        System.out.println("不会被继承");
    }

}
