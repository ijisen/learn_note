package lesson.day05_extends;

/**
 * 继承 extends
 * 1、面向对象的三大特征： 封装 继承 多态
 * 2、java语言中的继承只支持单继承;
 * 3、B类继承 A类
 * --> A类称为： 父类、基类、超类、superclass
 * --> B类称为： 字类、派生类、subclass
 * 4、 在java语言中，以下类不会被字类继承
 * --> 私有的不支持继承
 * --> 构造方法不支持继承
 */
public class Index {
    public static void main(String[] args) {
        CreditExtendsAccount credit = new CreditExtendsAccount("789789456456", 9999.85, 88);
        System.out.println(credit.getCredit());
        System.out.println(credit.getBalance());
        System.out.println(credit.getNo());
    }
}
