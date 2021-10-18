package lesson.day04_static;
/**
 * 静态变量在类加载的时候初始化，内存在方法区中开辟，访问的时候不需要创建对象，
 * 直接使用“类名.静态变量名”的方式访问
 * 也可以使用“引用.xx”的方式，但不建议
 * static:
 *  1. 使用static修饰的方法： 静态方法
 *  2. 使用static修饰的变量： 静态变量
 *  3. 所有的static修饰的元素都称为静态的，
 *  4. static修饰的所有元素，都是类级别的特征，和具体对象无关
 *  5. 静态方法中，无法直接访问实例变量、实例方法
 * */
public class Chinese {
    // 身份证ID  实例变量
    String id;
    // 姓名 实例变量
    String name;
    // 国际 静态变量
    // 静态变量在类加载的时候就已经初始化，就已经开辟了内存空间，
    // 静态变量储存在方法区内存中
    static String country = "中国";

    // 定义一个无参构造函数
    public Chinese() {
        this.id = null;
        this.name = null;
    }

    // 定义一个传参构造函数
    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
