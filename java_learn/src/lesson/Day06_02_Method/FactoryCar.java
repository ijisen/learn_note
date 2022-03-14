package lesson.Day06_02_Method;

/**
 * 汽车工厂
 */

public class FactoryCar {
    // 已生成汽车数量
    /* 域名id */
    private long count;

    public static void main(String[] args) {
        System.out.println("汽车工厂");
        sumInt(10);
        // System.out.println(this.count);
    }

    // 求和方法
    public static int sumInt(int count) {
        count++;
        System.out.println("汽车工厂");
        return count;
    }


}

