package lesson.Day09_00_Wrapper.demo.ToString;

/**
 * 包装类型和字符串之间得转换
 */
public class Index {
    public static void main(String[] args) {
        /**
         * 包装类 --》 字符串
         * */
        // 包装类型转字符串
        Integer i_a = 10;
        System.out.println(i_a.toString().getClass());
        System.out.println(String.valueOf(i_a).getClass());
        System.out.println((i_a + "").getClass());
        // 基础类型转字符串
        int i_b = 10;
        // 无法解析
        // System.out.println(i_b.toString());
        System.out.println(String.valueOf(i_b));
        System.out.println(i_b + "");

        /**
         * 字符串 - 包装类
         *
         * */
        String str = String.valueOf(i_a);
        System.out.println((new Integer(str)).getClass());
        System.out.println((Integer.valueOf(str)).getClass());
        Integer c = Integer.parseInt(str);
        System.out.println(c.getClass());
    }
}
