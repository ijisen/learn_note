package lesson.Day08_01_Opp.Test_02_User;

public class Index {
    public static void main(String[] args) {

        // 实例化对象
        User user = new User();
        user.name = "jisen";
        user.id = "99999";

        System.out.println("name = " + user.name);
        System.out.println("id = " + user.id);
        // User@15db9742
        System.out.println(user);

        // 实例化对象
        user.house = new House();
        user.house.area = 500;
        System.out.println("area = " + user.house.area);
        // null
        System.out.println(user.house.user);

        // 实例化对象
        user.house.user = new User();
        user.house.user.name = "timi";
        // User@6d06d69c
        System.out.println(user.house.user);
        // timi
        System.out.println(user.house.user.name);

        user.house.user = user;
//        user.house.user.name = "timi";
        // User@15db9742
        System.out.println(user.house.user);
        // jisen
        System.out.println(user.house.user.name);
    }
}