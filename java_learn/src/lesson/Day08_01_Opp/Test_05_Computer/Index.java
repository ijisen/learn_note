package lesson.Day08_01_Opp.Test_05_Computer;

public class Index {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "jimi";
        student.no = 999;
        student.computer = new Computer();
        student.computer.band  = "华硕";
        student.computer.color = "blue";
        student.computer.type = "I7";
        System.out.println(student.name + "有一台" + student.computer.band + "电脑");
    }
}
