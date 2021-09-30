package lesson.day02;

/**
 * 面项对象三大特征
 * 封装
 * 继承
 * 多态
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User(100);
        User user2 = new User("String");
        User user3 = new User("String", 99);
        System.out.println(user3.age);
        user3.age = 20;
        System.out.println(user3.age);
        // 私有属性，不可访问
//        System.out.println(user.pwd);
        user3.setPwd("123456");
        String userPwd = user3.getPwd();
        System.out.println("密码读取成功：" + userPwd);
    }
}
