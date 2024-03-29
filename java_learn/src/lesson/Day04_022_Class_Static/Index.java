package lesson.Day04_022_Class_Static;

/**
 * static 【静态属性】
 * 静态变量在类加载的时候初始化，内存在方法区中开辟，访问的时候不需要创建对象，
 * 直接使用“类名.静态变量名”的方式访问
 * 也可以使用“引用.xx”的方式，但不建议
 * static:
 * --> 1. 使用 static 修饰的方法： 静态方法
 * --> 2. 使用 static 修饰的变量： 静态变量(类变量|静态属性)
 * --> 3. 所有的 static 修饰的元素都称为静态的，
 * --> 4. static 修饰的所有元素，都是类级别的特征，和具体对象无关
 * --> 5. 静态方法中，无法直接访问实例变量、实例方法
 * <p>
 * 类变量(静态变量|静态属性)使用注意事项
 * --> 1. 什么时候使用： 当所有对象共享一个静态变量时使用：eg: count
 * --> 2. 使用方法： 建议使用 类名.静态属性名，eg: Children.count
 * --> 3. 静态属性在类加载时，就已经初始化可以使用了，
 * --> 4. 静态属性的生命周期随着类的加载而开始，类的消亡而消亡， 类似引入了js文件
 * --> 5. static 任然遵循修饰符访问权限
 * 何时定义为类变量？：
 * --> 这个动作不需要对象的参与时， 可定义为静态方法
 * <p>
 * 类方法（静态方法）使用注意事项
 * --> 1. 申明方法：
 * ----------> public static void method {} （推荐）
 * ----------> static public void method {}
 * --> 2. 调用方法：
 * ----------> 类名.类方法名
 * ----------> 对象名.类方法名
 * --> 3. 类方法和实例方法都是随着类加载而加载
 * --> 4. 类方法中没有this 和 super 参数
 * --> 5. 类方法中只能访问类变量和调用类方法
 * --> 6. 普通方法 可以访问类变量和调用类方法
 * --> 6. static 任然遵循修饰符访问权限
 * 何时定义为类方法？：
 * --> 这个动作不需要对象的参与时， 可定义为类方法, 当工具使用
 */
public class Index {
    /**
     * 类变量(静态变量|静态属性)  static int count;
     * 普通属性（实例变量|非静态变量|非静态属性） String name;
     * <p>
     * 静态代码块 static {}
     * <p>
     * 主方法 main {}
     * <p>
     * 实例代码块 {}
     * <p>
     * 构造方法 Index {}
     * <p>
     * 类方法(静态方法) public static void getCount() {}
     * 普通方法 public void setName() {}
     */

}
