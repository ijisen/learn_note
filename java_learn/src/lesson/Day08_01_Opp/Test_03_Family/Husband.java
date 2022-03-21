package lesson.Day08_01_Opp.Test_03_Family;

/**
 * Husband 对象
 */
public class Husband {
    /**
     * 身份证号码
     * String: 是一种引用类型
     * IdCard： 是一种【引用实例变量】
     */
    String idCard;
    /**
     * 姓名
     * String: 是一种引用类型
     * name: 是一种【引用实例变量】
     * */
    String name;

    // 丈夫对象中含有妻子引用
    Wife wife;
}
