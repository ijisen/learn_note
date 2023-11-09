package lesson.Day04_020_Class;
/**
 *
 * 学生类
 * 学术类是一个模板
 * 描述了所有学生的共同特征【状态 + 行为】
 *   byte short int long float double boolean char
 * 引用数据类型
 *   Sting
 * */
/**
 * Super_Student 是类， 属于引用数据类型，是一个类型名
 * 类的定义：【修饰符】 class 类名
 * */
public class Student {
    /** 类体 = 属性 +方法 */
    /** 属性 【储存数据采用变量的形式】
     * 【成员变量】 由于变量的定义再类体当中，方法体之外。这样的变量称为成员变量
     * */
    // 学号
    int no;

    // 姓名
    String name;

    // 性别
    boolean sex;

    // 年龄
    int age;

    // address
    String address;

    // 方法
    // 方法描述的是对象的动作信息
}
