package lesson.Day02_01_Arithmetic;

/**
 * 算术运算
 * + - * / %
 * n++|n-- 先取值后运算
 * ++n|--n 先运算再取值
 *
 *
 * */
public class Index {
    public static void main(String[] arg) {

    }
}


/**
 * 算术运算加法 plus
 * */
class AddOperation {
    public static void main(String[] arg) {
        int n1 = 1;
        n1++;
        System.out.println(n1);
        ++n1;
        System.out.println(n1);

        int n2 = 1;
        /**
         * n++ 先判断（赋值）再运算
         * n2 == 2;
         * n2 += 1;
         * */
        if (n2++ == 2) {
            System.out.println("true"); // 不打印
        }
        System.out.println(n2); // 2
        int n3 = n2++;
        System.out.println(n2); // 3
        System.out.println(n3); // 2
        System.out.println("---------------\n");


        /**
         * ++n 先运算;再判断（赋值）
         * n2 += 1;
         * n2 == 2;
         * */
        int n4 =1;
        if (++n4 == 2) {
            System.out.println("true"); // true
        }
        System.out.println(n4); // 2
        int n5 = ++n4;
        System.out.println(n4); // 3
        System.out.println(n5); // 3
        System.out.println("---------------\n");

        // 以下逻辑跟(js也一样)
        int n6 = 1;
        n6++;
        System.out.println(n6); //2
        n6 = 1;
        ++n6;
        System.out.println(n6); // 2
        n6 = 1;
        // n6++
        // temp = n6(2)
        // n6 = temp
        n6=++n6;
        System.out.println(n6); // 2
        n6 = 1;
        // temp = n6(1)
        // n6++
        // n6 = temp
        n6=n6++;
        System.out.println(n6); // 1
        System.out.println("---------------\n");

        n6 = 2;
        int k = ++n6;
        int k1 = n6++;
        System.out.println(k); // 3
        System.out.println(k1); // 3
        System.out.println(n6); // 4
    }
}

/**
 * 算术运算 - 减法
 * ps: 减法运算会有进度损失问题，注意！！！
 * */
class SubtractOperation {
    public static void main(String[] arg) {
        System.out.println(10 - 10.2); // 0.1999999999999993
        System.out.println(10.2 - 10.2);
        System.out.println(10.2 - 10); // -0.1999999999999993
        System.out.println("---------------\n");

        // 以下逻辑跟(js也一样)
        int n6 = 2;
        n6--;
        System.out.println(n6); //1
        n6 = 2;
        --n6;
        System.out.println(n6); // 1
        n6 = 2;
        // --n6
        // temp = n6
        // n6 = temp
        n6=--n6;
        System.out.println(n6); // 1
        n6 = 2;
        // temp = n6
        // n6--
        // n6 = temp
        n6=n6--;
        System.out.println(n6); // 2
        System.out.println("---------------\n");

        n6 = 2;
        int k = --n6;
        int k1 = n6--;
        System.out.println(k); // 1
        System.out.println(k1); // 1
        System.out.println(n6); // 0
    }
}

/**
 * 算术运算 - 乘法
 * */
class MultiplyOperation {
    public static void main(String[] arg) {
        System.out.println(7*8); // 56
        System.out.println(7*8.0); // 56.0
        System.out.println(1*10.2); // 10.2
        System.out.println(10.2*5); // -51.0
    }
}

/**
 * 算术运算 - 除法
 * ps: 需要注意数据类型，取精度最大的
 * */
class DivideOperation {
    public static void main(String[] arg) {
        System.out.println(7/8.0); // 0.875
        // 两个数据都是int类型，故只保留整数位
        System.out.println(7/8); // 0
        System.out.println(10/4); // 2
        System.out.println(10/4.0); // 2.5
        // 10为int类型；
        // 4 为 int类型
        double d = 10 / 4;
        System.out.println(d); // 2.0
    }
}

/**
 * 算术运算 - 取模
 * 取模公式： a - a/b*b  (js也一样)
 * */
class DeliveryOperation {
    public static void main(String[] arg) {
        System.out.println(10%3); // 1
        System.out.println(10%-3); // 1
        System.out.println(-10%3); // -1
     }
}