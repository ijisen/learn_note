public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.name = "jisen";
        user.id = "99999";

        System.out.println("name = " + user.name);
        System.out.println("id = " + user.id);
        // User@15db9742
        System.out.println(user);


        user.house = new House();
        user.house.area = 500;
        System.out.println("area = " + user.house.area);

        System.out.println(user.house.user);

        user.house.user = new User();
        user.house.user.name = "timi";
        // User@6d06d69c
        System.out.println(user.house.user);
        System.out.println(user.house.user.name);

        //  user.house.user = user;
        //  user.house.user.name = "timi";
        // User@15db9742
//            System.out.println(user.house.user);
//        System.out.println(user.house.user.name);
    }
}