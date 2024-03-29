package lesson.Day02_05_Binary;

/**
 * 进制
 * 二进制[bin]：0b|0B 开头   0b01010
 * 八进制[Octal]： 0开头   01010
 * 十进制[decimalism]：         19
 * 十六进制[hexadecimal]： 0x|0X 开头 0x10f0
 * */



/**
 * 1111
 * 8421[n*2^(2-1)]
 *
 * xxx             二进制        八进制             十进制                    十六进制
 *
 *
 * 二进制  0b1111      -        三位一组(1)(111)                           四位一组(1111)
 *                              n*2^(2-1)         n*2^(2-1)               n*2^(2-1)
 *                              017                  15                     0xF
 *
 * 八进制  017     每位拆成2进制  需要中间转换        n*8^(2-1)                -
 *                  0b1111                        1*8^(2-1)+7*8^(1-1)
 *                                                15
 *
 * 十进制  15      除2取余       除8取余            -                        除16取余
 *
 *
 * 十六进制 0xF  每位拆成2进制    -                  n*16^(2-1)              需要中间转换
 *                  01111                          15*16^(1-1)
 *                                                 15
 * */
public class Index {
    public  static void main(String[] arg) {

        // 二进制 =》 十进制
        // 0b1010 = 1*2^(4-1) + 0*2^(3-1) + 1*2^1(2-1) + 0*2^1(1-1) = 10
        // 0b1011 = 1*2^3 + 1*2^1 + 1*2^0 = 11

        // 十进制 =》 二进制
        // 11 =》 11/2 直到商为0 =》 0b1011

        // 八进制 -》 十进制
        // 0234 = 4*8^0 + 3*8^1 + 2*8^2 = 4 + 24 + 128 = 156

        // 十六进制 =》 十进制
        // 0x23A = 10*10^0 + 3*16^1 + 2*16^2 = 10 + 48 + 512 = 570
    }
}
