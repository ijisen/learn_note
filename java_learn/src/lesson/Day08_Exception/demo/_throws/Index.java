package lesson.Day08_Exception.demo._throws;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;

/**
 * throws 异常抛出
 * 1、抛出异常可以分为 编译异常 运行时异常
 * 2、抛出编译异常时，父方法必须处理异常，要么继续抛出异常，要么接收异常处理
 * 3、子类重写父类异常时，抛出异常也得遵循继承关系，要么与父类保持一致，要么是父类的字类型
 */
public class Index {
    public static void main(String[] args) {
        method();

    }

    public void fn() {
        method();
        // 如果抛出的是编译异常，在调用时，父方法要么继续抛出异常，要么接收异常处理
        try {
            method2();
        } catch (FileSystemException e) {
            e.printStackTrace();
        }

    }

    public static void method() throws NullPointerException {
        int i = 1;
        while (true) {
            i++;
            if (i > 10) {
                throw new Error("123");
            }
            System.out.println(i);
        }
    }

    public void method2() throws FileAlreadyExistsException {
        int i = 1;
        System.out.println(i);
    }
}

class Son extends Index {
    // 重写父类，抛出异常必须是父类的子类或跟父类一致
    @Override
    // public void method2() throws FileSystemException {
    public void method2() {
        System.out.println(123);
    }
}
