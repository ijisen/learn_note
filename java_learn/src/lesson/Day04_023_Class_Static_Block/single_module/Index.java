package lesson.Day04_023_Class_Static_Block.single_module;

/**
 * 静态方法和属性应用场景 - 单例模式
 * <p>
 * 两种方式：
 * 1、 饿汉模式
 * 2、 懒汉模式
 * <p>
 * 实现方式：
 * 1、构造器私有化 =》 防止直接 new
 * 2、类的内部创建对象
 * 3、提供一个公共的静态方法 获取内部对象
 * <p>
 * 饿汉式VS懒汉式
 * 1、二者的区别： 饿汉式不管是否使用都已经对象实例化， 懒汉式只有使用时才会创建对象实例化；
 * 2、相同点，对象只会实例化一次
 * 3、饿汉式不存在线程问题，懒汉式存在线程安全问题
 * 4、饿汉式存在资源浪费的可能，懒汉式不存在
 */
public class Index {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf.getName());
        GirlFriend gf2 = GirlFriend.getInstance();
        System.out.println(gf == gf2);

        // 此处虽然没有使用gf对象
        // 但 GirlFriend 已经实例化，不管是否使用，故叫饿汉式
        // 会输出： 构造器被调用
        System.out.println(GirlFriend.age);

        // 此处使用Cat.age， Cat对象没有实例化，只有使用cat对象时才会被创建， 故叫懒汉式
        // 不会输出： 猫猫构造器被调用
        System.out.println(Cat.age);

        Cat cat = Cat.getInstance();
        System.out.println(cat.getName());
        Cat cat2 = Cat.getInstance();
        // true
        System.out.println(cat == cat2);
    }
}


/**
 * 单例模式 =》 饿汉式
 */
class GirlFriend {
    private String name;

    public static int age = 25;

    // 构造器私有化
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    // 类的内部创建对象(静态的，私有的)
    // 此对象已经创建，不管你是否使用 =》 故叫饿汉式
    private static GirlFriend gf = new GirlFriend("韩梅梅");

    // 提供一个公共的静态方法 获取内部对象
    public static GirlFriend getInstance() {
        return gf;
    }

    public String getName() {
        return name;
    }
}


class Cat {
    private String name;

    // 创建内部对象
    private static Cat cat;

    public static int age = 10;

    // 构造器私有化
    private Cat(String name) {
        System.out.println("猫猫构造器被调用");
        this.name = name;
    }

    // 懒汉式
    // 提供一个公共的静态方法 获取内部对象
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("TOM");
        }
        return cat;
    }

    public String getName() {
        return name;
    }
}
