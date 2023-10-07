package lesson.Day04_00_Opp.Test_03_Family;

public class Index {
    public static void main(String[] args) {
        // 创建一个丈夫对象
        Husband husband = new Husband();
        husband.idCard = "20200314";
        husband.name = "吉森";
        // 创建一个妻子对象
        Wife wife = new Wife();
        wife.idCard = "20200315";
        wife.name = "莹莹";

        husband.wife = wife;
        wife.husband = husband;
        System.out.println(husband.name + " 的妻子是： " + husband.wife.name);
        System.out.println(wife.name + " 的丈夫是： " + wife.husband.name);
    }
}
