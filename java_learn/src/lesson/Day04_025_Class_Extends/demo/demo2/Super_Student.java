package lesson.Day04_025_Class_Extends.demo.demo2;

// 同包 同类 子类 不同包
public class Super_Student {
    public String name;
    public int age;
    private double score;
    // 身份证
    // 缺省 同包|同类中使用
    String idCard;


    public Super_Student() {
        System.out.println("父类构造器初始化 无参");
    }

    /** 父类有参构造器 */
    public Super_Student(String name, int age, double score, String idCard) {
        System.out.println("父类构造器初始化");
        this.age = age;
        this.name = name;
        this.score = score;
        this.idCard = idCard;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void showInfo() {
        System.out.println("学生名：" + name + "分数： " + this.score);
    }
}
