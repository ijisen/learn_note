package lesson.Day04_025_Class_Extends.demo.demo2;

public class Sub_Pupil extends Super_Student {

    public Sub_Pupil(String name, int age, double score, String idCard) {
        super(name, age, score, idCard);
    }
    public void testing () {
        System.out.println("小学生 " + name + " 正在考试中");
    }
}
