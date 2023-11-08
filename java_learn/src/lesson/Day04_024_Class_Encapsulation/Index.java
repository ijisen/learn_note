package lesson.Day04_024_Class_Encapsulation;

/**
 * 封装【encapsulation】
 * 1、面向对象的三大特征：
 * -> 封装【encapsulation】
 * -> 继承【extend】
 * -> 多态【Polymorphic】
 *
 * 【封装的三步】
 * 1、属性私有化（不能直接修改属性）
 * 2、提供 public get 获取属性
 * 3、提供 public set 修改属性
 *
 * */
public class Index {
    public static void main (String[] arg) {
        // 不同包引入
        lesson.Day04_024_Class_Encapsulation.demo.demo1.Index a = new lesson.Day04_024_Class_Encapsulation.demo.demo1.Index("tom");
        System.out.println(a.getName());
        a.setName("lucy");
        System.out.println(a.getName());

    }
}
