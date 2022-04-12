package Basic.Day04_022_Class_Static.Test_01_Chinese;

/**
 * 创建一个 chinese 对象
 */
public class Chinese {
    /**
     * String: 这是一种引用变量类型： 字符串
     * id: 这是一种引用实例变量
     */
    private String id;

    /**
     * String: 这是一种引用变量类型： 字符串
     * name: 这是一种引用实例变量
     */
    private String name;
    // 国际 静态变量
    // 静态变量在类加载的时候就已经初始化，就已经开辟了内存空间，
    // 静态变量储存在方法区内存中
    static String country = "中国";

    // 定义一个无参构造函数
    public Chinese() {
    }

    // 定义一个传参构造函数
    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
