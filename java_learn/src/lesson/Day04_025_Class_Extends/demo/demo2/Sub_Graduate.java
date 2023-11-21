package lesson.Day04_025_Class_Extends.demo.demo2;

public class Sub_Graduate extends Super_Student {

    public Sub_Graduate() {
        // super()  隐藏调用
        System.out.println("子类构造器初始化， 无参");
    }

    // 父类中有有参构造器且没有无参构造器时， 子类构造中必须调用super传参给父类
    public Sub_Graduate(String name, int age, double score, String idCard) {
        // 不写的话，super()  隐藏调用
        super(name, age, score, idCard);
        System.out.println("子类构造器初始化");
    }

    public void testing() {
        System.out.println("大学生 " + name + " 正在考试中");
        System.out.println("大学生 " + name + " 的id" + this.idCard);
        System.out.println("大学生 " + name + " 的分数" + this.getScore());
    }

}
