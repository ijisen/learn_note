package lesson.Day09_03_StringBuilder;

/**
 * StringBuilder
 * ==> 该类被设计用于 替换 StringBuffer， 用在字符串缓冲区被单个线程使用
 * ==> 大多数比 StringBuffer 快
 * ==> StringBuilder 常用方法append 和 insert， 可以重载这些方法
 *
 * */
public class Index {
    public static void main(String[] args) {
        /**
         * 1、 继承了 AbstractStringBuilder
         * 2、 实现了 Serializable， 表示可以网络传输，可以保存到文件
         * 3、 StringBuilder 是 final类， 不能被继承
         * 4、 StringBuilder 对象字符序列任然存放在 AbstractStringBuilder 的 char[] value
         * ---> 因此存放在堆序列中
         *
         * */
        StringBuilder stringBuilder1 = new StringBuilder();
    }
}
