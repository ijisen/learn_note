package lesson.day04_static;

public class Chinese {
    // 身份证ID  实例变量
    String id;
    // 姓名 实例变量
    String name;
    // 国际 实例变量
    String country;

    // 定义一个无参构造函数
    public Chinese() {
        this.id = null;
        this.name = null;
        this.country = null;
    }

    // 定义一个传参构造函数
    public Chinese(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
