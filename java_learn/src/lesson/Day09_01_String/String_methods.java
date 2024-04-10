package lesson.Day09_01_String;

/**
 * String 常用方法
 * */
public class String_methods {
    public static void main(String[] args) {
        String str = "string string string";

        System.out.println("equals: " + str.equals("string"));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("string"));
        System.out.println("length: " + str.length());
        System.out.println("indexOf: " + str.indexOf("i"));
        System.out.println("lastIndexOf: " + str.lastIndexOf("i"));
        System.out.println("substring: " + str.substring(2, 4));
        System.out.println("split: " + str.split(" "));
        System.out.println("trim: " + str.trim());
        System.out.println("charAt: " + str.charAt(4));
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("replace: " + str.replaceAll("i", "I"));
        for (String item: str.split(" ")) {
            System.out.println(item);
        }


        String name = "tom";
        int age = 25;

        // %s 字符串
        // %d 证书
        // %.2f 表示替换为小数，只保留两位,并且四舍五入处理
        // %c char
        String info = String.format("%s，%d", name, age);
        System.out.println(info);

    }
}
