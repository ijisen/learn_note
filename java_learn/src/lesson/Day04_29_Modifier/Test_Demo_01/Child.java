package lesson.Day04_29_Modifier.Test_Demo_01;

import lesson.Day04_29_Modifier.Parent;

public class Child extends Parent {
    public void run () {
        System.out.println("------ Child Class -----");
        System.out.println(this.name);
        // age在lesson.Day04_29_Modifier.Parent中不是公共的; 无法从外部程序包中对其进行访问
//        System.out.println(this.age);
    }
}