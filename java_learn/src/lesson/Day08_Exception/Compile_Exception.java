package lesson.Day08_Exception;
/**
 * compile exception【编译时异常】- 六种常见编译时异常类型
 * 编译异常是指在编译期间，就必须处理的异常，否则代码编译不能通过
 * --> 操作数据库发生异常 NullPointerException
 * --> 操作文件时发生异常 ArrayIndexOutOfBoundsException
 * --> 操作一个不存在的文件时发生异常 ClassCastException
 * --> 加载类 NumberFormatException
 * --> 操作文件，到文件末尾时发生异常 ClassCastException
 * --> 参数异常 NumberFormatException
 */
public class Compile_Exception {
    public static void main(String[] args) {
        AA a = new AA();
        a = null;
        System.out.println(a.name);
    }
}

class AA {
    public String name = "cat";
    public void setInstance(String name) {
        System.out.println(name);
    }
}
