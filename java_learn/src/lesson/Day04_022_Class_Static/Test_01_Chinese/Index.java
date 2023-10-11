package lesson.Day04_022_Class_Static.Test_01_Chinese;

public class Index {
    public static void main(String[] args) {
        Chinese.country = "中国";
        Chinese tom = new Chinese("123x", "tom");
        System.out.println(tom.getName() + "的身份证是： " + tom.getId() + "; 国籍： " + Chinese.country);


        Chinese lucy = new Chinese("124x", "lucy");
        System.out.println(lucy.getName() + "的身份证是： " + lucy.getId() + "; 国籍： " + Chinese.country);
    }
}
