package lesson.Day04_022_Class_Static.demo.demo1;

public class Index {
    public static void main(String[] args) {
        // 静态属性在类加载时，就已经初始化了，可以使用
        // 所以此处没有创建实例对象，我们依然可以使用
        Chinese.country = "中国";
        Chinese tom = new Chinese("123x", "tom");
        System.out.println(tom.getName() + "的身份证是： " + tom.getId() + "; 国籍： " + Chinese.country);


        Chinese lucy = new Chinese("124x", "lucy");
        System.out.println(lucy.getName() + "的身份证是： " + lucy.getId() + "; 国籍： " + Chinese.country);
    }
}
