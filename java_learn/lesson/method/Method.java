/**
 * java 中叫方法， 不叫函数
 * 方法必须定义在类当中， 方法定义顺序没有先后顺序
 */
public class Method {
    public static void main(String[] args) {
        sumInt(10, 20);
        sumInt(20, 20);
    }

    // 求和方法
    public static void sumInt(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}

