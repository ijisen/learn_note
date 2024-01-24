package lesson.Day04_29_Modifier.demo.demo1;

/**
 * 我是demo1包下的public类， 我可以随意使用 同包|同类|子类|不同包
 *
 * */
public class Baby {
    public static void main(String[] arg) {

    }

    public Baby () {
        System.out.println("Baby Constructor");
    }
}

/**
 * 我是demo1包下的【缺省】类， 我可以在同包|同类中使用
 * 默认： 没有修饰符号，同一个包类开放;
 * --
 * <p>
 * 我可以在 demo1包中被随意调用
 **/
class BabySpeak {

    public BabySpeak() {
        System.out.println("我还是一个宝宝呢！！！");
    }

}
