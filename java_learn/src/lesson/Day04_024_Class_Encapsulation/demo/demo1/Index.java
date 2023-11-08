package lesson.Day04_024_Class_Encapsulation.demo.demo1;

/**
 * 封装【encapsulation】
 * 封装三要素：
 * 1、 私有化属性
 * 2、 public get 获取属性
 * 3、 public set 修改属性
 */
public class Index {
    private String name;

    public static void main(String[] arg) {

    }

    public Index(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
