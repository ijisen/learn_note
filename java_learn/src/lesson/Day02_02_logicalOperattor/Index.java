package lesson.Day02_02_logicalOperattor;

/**
 * 逻辑运算符 （logical operator）
 *
 * | 逻辑或  || 短路或
 * & 逻辑与  && 短路与
 * ! 非
 * ^ 不相等
 *
 * */
public class Index {
    public static void main(String[] arg) {
        int a  =10;
        int b = 10;
        if ((a == 10) ^ (b ==20)) {
            System.out.println("dddddd");
        }
    }
}
