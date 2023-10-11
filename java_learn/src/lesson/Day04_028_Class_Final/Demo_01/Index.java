package lesson.Day04_028_Class_Final.Demo_01;

public class Index {
    public static void main(String[] args) {
        Chinese china = new Chinese();
        // 类名.
        Chinese.countryCode = "86";
        System.out.println(Chinese.countryCode);
        // 无法直接访问&修改
        //  System.out.println(china.countryName);
        System.out.println(china.getCountryName());
        System.out.println(china.country);
        china.countryRun();
        // 无法为最终变量country分配值
        // china.country = "";
        /** ======== 分割线 ==========*/
        System.out.println("------------------------- ");
        SiChuan siChuan = new SiChuan();
        System.out.println(Chinese.countryCode);
        System.out.println(siChuan.getCountryName());
        System.out.println(siChuan.country);
        System.out.println(SiChuan.province);
        // 无法为最终变量province分配值
//        SiChuan.province = "444";
        siChuan.countryRun();
        /** ======== 分割线 ==========*/
        final Chinese c1 = new Chinese();
        // final 修饰的变量无法重新赋值
        // 无法为最终变量c1分配值
//         c1 = new SiChuan();
    }
}
