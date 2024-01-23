package lesson.Day07_00_Enum.demo.demo1;

public class Index {
    public static void main(String[] args) {
        EnumWeek[] weeks = EnumWeek.values();
        for (EnumWeek week : weeks) {
            System.out.println(week);
        }
    }
}

enum EnumWeek {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    private EnumWeek(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
