package lesson.day02;
/**
* 面项对象三大特征
 *  封装
 *  继承
 *  多态
* */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.age);
        user.age = 20;
        System.out.println(user.age);
    }
}
