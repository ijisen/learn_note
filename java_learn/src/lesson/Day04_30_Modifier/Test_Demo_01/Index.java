package lesson.Day04_30_Modifier.Test_Demo_01;

import lesson.Day04_30_Modifier.Children;

public class Index {
    public static void main(String[] args) {

        Children children = new Children();
        System.out.println(children.id);
        System.out.println(children.getParentType());
        // protected
        // protected 访问控制,无法访问
//        System.out.println(children.name);
        // 缺省；
        // 不是公共的，无法访问
//        System.out.println(children.age);

        Child child = new Child();
        // protected
        // protected 访问控制,无法访问
//        System.out.println(child.name);
        // 缺省；
        // 不是公共的，无法访问
//        System.out.println(child.age);
        child.run();
    }
}
