package lesson.Day08_This.Test_00_Date;

/**
 * 创建一个 Date 对象
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        /**
         this.year = 1970;
         this.month = 01;
         this.day = 01;
         */

        // System.out.println("1111");
        // Error:(19, 13) java: 对this的调用必须是构造器中的第一个语句
        // 这条语句只能出现在构造方法的第一行，上面不能有代码
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void getDate() {
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
