package Basic.Day04_021_Class_This.Test_00_Date;

public class Index {
    public static void main(String[] args) {
        Date date01 = new Date();

        // 1970-1-1
        date01.getDate();


        Date date02 = new Date(2022, 03, 18);
        // 2022-3-18
        date02.getDate();

    }
}
