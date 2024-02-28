package lesson.Day08_Exception;

/**
 * 异常【exception】
 * java中程序执行过程中发生的不正常情况称为“异常”，语法错误和逻辑错误不是异常
 * 异常分为两大类：
 * --》 Error： java虚拟机无法处理的问题，eg: jvm 内存错误、资源耗尽、栈溢出
 * --》 Exception： 一般性错误，空指针、读取不存在文件、网络中断
 * -----》 exception分为： 运行【runTimeException】时异常 & 编译[exception]时异常
 * 异常处理的两种方式
 * --》 try - catch - finally (finally 无论如何都会执行)
 * --》 throws   将发生的异常抛出
 */
public class Index {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // 抛出异常后，程序就退出了，后面的就不会再执行了,故需要进行异常处理
        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (Exception e) {
            // java.lang.ArithmeticException: / by zero
            e.printStackTrace();
            // / by zero
            System.out.println(e.getMessage());
        }

        System.out.println("程序继续执行");
    }
}
