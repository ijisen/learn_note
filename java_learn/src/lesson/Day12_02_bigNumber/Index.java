package lesson.Day12_02_bigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * BigInteger 大的整型数据
 * BigDecimal 大的浮点数据
 */
public class Index {
    public static void main(String[] args) {
        /**
         * BigInteger
         *
         * */
        // byte     -128 ~ 127  2^7
        // short    -32768 ~ 32767 2^15
        // int      -2147483648 - 2147483647 2^31
        // long    -9223372036854775808 - 9223372036854775807  2^63
        int int1 = 2147483647;
        long long1 = 9223372036854775807l;
        BigInteger big1 = new BigInteger("9223372036854775808");
        BigInteger big2 = new BigInteger("10");
        System.out.println(big1);

        // +
        big1 = big1.add(big2);
        System.out.println(big1);

        // -
        big1 = big1.subtract(big2);
        System.out.println(big1);

        // *
        big1 = big1.multiply(big2);
        System.out.println(big1);

        // /
        big1 = big1.divide(big2);
        System.out.println(big1);


        /**
         *
         * BigDecimal
         * */
        System.out.println("\n======BigDecimal======");
        BigDecimal bigDecimal1 = new BigDecimal("18446744073709551616.08");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal1);

        /**
         * 除法时，容易死循环， 指定精度即可： BigDecimal.ROUND_CEILING
         * */
        System.out.println(bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_CEILING));

    }
}
