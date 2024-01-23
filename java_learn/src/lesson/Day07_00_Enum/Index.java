package lesson.Day07_00_Enum;

/**
 * Enum 枚举值
 */
public class Index {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.getLabel());
        System.out.println(spring.getLabelEn());
        System.out.println(spring.getValue());

        System.out.println("---------");

        Season2 spring2 = Season2.SPRING;
        Season2 spring3 = Season2.SPRING;
        // 等同于 spring.toString()， Enum toString方法
        // SPRING
        System.out.println(spring2);
        System.out.println(spring2.toString());
        // true 同一个静态类，同一个内存地址
        System.out.println(spring2 == spring3);
        System.out.println(spring2.getLabel());
        System.out.println(spring2.getLabelEn());
        System.out.println(spring2.getValue());

        /**
         *
         * enum 公共方法
         * C:\Program Files\Java\jdk1.8.0_112\jre\lib\rt.jar!\java\lang\Enum.class
         *
         *
         * */
        System.out.println("----------");

        // .name() =>  输出枚举对象的名称 => SPRING
        System.out.println("-----name()-----");
        System.out.println(Season2.SPRING.name());

        // .toString() =>  SPRING => 已经被重写
        System.out.println("-----toString()-----");
        System.out.println(Season2.SPRING.toString());

        // .ordinal() => 枚举下标 =》 0 | 2
        System.out.println("-----ordinal()-----");
        System.out.println(Season2.SPRING.ordinal());
        System.out.println(Season2.AUTUMN.ordinal());

        // .values() => 返回枚举对象数组 =》
        System.out.println("-----values()-----");
        Season2[] values = Season2.values();
        // 增强for循环
        for (Season2 season : values) {
            // SPRING,SUMMER,AUTUMN,WINTER,Other
            System.out.println(season);
        }

        // .valueOf() => 查找枚举对象 =》
        System.out.println("-----valueOf()-----");
        // 返回枚举对象的toString()
        System.out.println(Season2.valueOf("AUTUMN"));
        // ERROR: No enum constant lesson.Day07_00_Enum.Season2.AUTUMN2
        // System.out.println(Season2.valueOf("AUTUMN2"));

        // .compareTo() => 枚举下标相减 =》 -1
        System.out.println("-----compareTo()-----");
        System.out.println(Season2.AUTUMN.compareTo(Season2.WINTER));
    }
}


/**
 * 第一种实现方式： 类实现
 */
// 1、创建一个类
class Season {
    // 2、申明枚举属性
    private String label;
    private String labelEn;
    private String value;


    // 3、创建一个私有构造器, 避免new； 实现枚举
    private Season(String label, String labelEn, String value) {
        this.label = label;
        this.labelEn = labelEn;
        this.value = value;
    }

    // 4、枚举实例化
    //1、添加 final + static， 实现底层优化
    //2、每一次实例化都会加载一次实例代码块
    public static final Season SPRING = new Season("春天", "spring", "spring");
    public static final Season SUMMER = new Season("夏天", "summer", "summer");
    public static final Season AUTUMN = new Season("秋天", "autumn", "autumn");
    public static final Season WINTER = new Season("冬天", "winter", "winter");

    // 5、配置get XX方法获取枚举属性
    public String getLabel() {
        return label;
    }

    public String getLabelEn() {
        return labelEn;
    }

    public String getValue() {
        return value;
    }
}


/**
 * 第二种方式： 使用enum枚举实现
 * <p>
 * 方式与第一种基本一致，只是枚举实现方式不一样。
 * <p>
 * 注意事项
 * 1、enum 不能被继承，也不能继承别的， 因为他已经隐式继承了Enum 类
 * 2  enum 可以继承接口
 */
interface SeasonInterface {
    public String toString();
}

enum Season2 implements SeasonInterface {
    // 4、编写数据字典， 数据字典必须放第一行，多个用，号隔开
    SPRING("春天", "spring", "spring"),
    SUMMER("夏天", "summer", "summer"),
    AUTUMN("秋天", "autumn", "autumn"),
    WINTER("冬天", "winter", "winter"),
    // 调用无参构造器， 等同于 Other()
    Other;

    // 1、 申明枚举属性
    private String label;
    private String labelEn;
    private String value;

    // 无参构造器
    private Season2() {

    }

    // 2、创建一个私有构造器, 避免new； 实现枚举
    private Season2(String label, String labelEn, String value) {
        this.label = label;
        this.labelEn = labelEn;
        this.value = value;
    }

    // 3、配置get XX方法获取枚举属性
    public String getLabel() {
        return label;
    }

    public String getLabelEn() {
        return labelEn;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "label='" + label + '\'' +
                ", labelEn='" + labelEn + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
