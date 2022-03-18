package lesson.Day08_Opp.Test_07_Package;

/**
 * 创建一个 用户对象
 */
public class User {
    /**
     * 私有化用户名
     * private：私有化属性，禁止外部访问
     * String: 是一个引用数据类型： 字符串
     * name: 是一个引用实例变量
     * */
    private String name;

    // 配置用户名
    public void setName(String name) {
        this.name = name;
    }

    // 读取用户名
    public String getName() {
        return name;
    }
}
