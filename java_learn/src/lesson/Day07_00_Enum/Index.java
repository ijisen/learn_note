package lesson.Day07_00_Enum;

/**
 * 枚举值
 * <p>
 * 1、不需要提供set方法，因为枚举值都是只读
 * 2、对枚举对象/属性使用final + static共同修饰，实现底层优化
 * 3、枚举对象通常大写，常量的命名规范
 * 4、枚举对象根据需求，可以拥有多个属性
 */
public class Index {
    public static void main(String[] args) {
        // lesson.Day07_00_Enum.Season@1b6d3586
        System.out.println(Season.AUTUMN.getName());
        System.out.println(Season.AUTUMN.getDesc());

        System.out.println(Season2.SUMMER.getName());
        System.out.println(Season2.SUMMER.getDesc());

    }
}

/**
 * 第一种方式： 自定义类实现枚举
 * <p>
 * 1、不需要提供set方法，因为枚举值都是只读
 * 2、对枚举对象/属性使用final + static共同修饰，实现底层优化
 * 3、枚举对象通常大写，常量的命名规范
 * 4、枚举对象根据需求，可以拥有多个属性
 * */
class Season {
    private final String name;
    private final String desc;

    // Season内部直接创建固定对象
    // 添加 final 修饰符， 实现底层优化
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    /**
     * 1、构造器私有化，防止new
     * 2、取得setXX 方法,防止属性被修改
     * 3、在Season内部，直接创建固定对象
     */
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
};

/**
 * 第二种方式： 使用 enum 关键字实现枚举
 * <p>
 * 1、不需要提供set方法，因为枚举值都是只读
 * 2、常量对象必需写在首行，多个以，号隔开
 * 3、枚举对象通常大写，常量的命名规范
 * 4、枚举对象根据需求，可以拥有多个属性
 * */
enum Season2 {
    // 常量对象
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "寒冷");
    private final String name;
    private final String desc;

    /**
     * 1、构造器私有化，防止new
     * 2、取得setXX 方法,防止属性被修改
     * 3、在Season内部，直接创建固定对象
     */
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
};
