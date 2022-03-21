package lesson.Day04_00_Opp.Test_06_Main;

public class Index {
    public static void main(String[] args) {
        User user = new User();
        user.idCard = 9999;
        user.name = "timi";

        User_Car car = new User_Car();
        car.license = "999999";
        car.band = "ford";
        car.user = user;
        System.out.println("此车主是：" + car.user.name);

        User_House house = new User_House();
        house.area = 140;
        house.user = user;
        System.out.println("此房主是：" + house.user.name);
    }
}
