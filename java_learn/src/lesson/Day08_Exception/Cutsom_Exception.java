package lesson.Day08_Exception;

import lesson.Day06_00_inner_class.MemberInnerClass.Class_A;

/**
 * 自定义异常
 */
public class Cutsom_Exception {
    public static void main(String[] args) {
        Age_class age_class = new Age_class();
        // set Age：18
        age_class.setAge(18);
        // 年龄需要在18-100之间
        age_class.setAge(17);

        /**
         * 编译时异常，try 后， 程序不再抛出异常
         * */
        try {
            age_class.getAge();
            System.out.println(888);
        } catch (NullAgeException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}


/**
 * 自定义运行时异常
 */
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }

}

/**
 * 自定义编译时异常
 */
class NullAgeException extends Exception {
    public NullAgeException(String message) {
        super(message);
    }
}

class Age_class {
    public void getAge() throws NullAgeException {
        System.out.println("get Age");
        throw new NullAgeException("年龄需要在18-100之间");
    }

    ;

    public void setAge(int age) throws AgeException {
        if (age > 100 || age < 18) {
            throw new AgeException("年龄需要在18-100之间");
        }
        System.out.println("set Age：" + age);
    }
}
