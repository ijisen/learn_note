package lesson.Day04_025_Class_OverLoad;

/**
 *  方法重载
 *  重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 *
 * */
public class OverLoad_Class {
    public void setInfo () {
        System.out.println("get nothing");
    }
    public int setInfo(int age) {
        System.out.println("get Age :" + age);
        return age;
    }

    public String setInfo(String name) {
        System.out.println("get name :" + name);
        return name;
    }

    public String setInfo(String name, int age) {
        System.out.println("get name : " + name + " age : " + age);
        return "get name : " + name + " age : " + age;
    }
}
