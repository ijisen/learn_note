package lesson.Day07_01_Annotation.demo.demo5;

public class Index {
    public static void main(String[] args) {
        Person person = new Person("唐曾", new Boat());
        person.passRoad();
        person.passRiver();
    }
}

interface VehiclesInterface {
    public String work();
}

class Horse implements VehiclesInterface {
    @Override
    public String work() {
        return "马儿跑";
    }
}

class Boat implements VehiclesInterface {
    @Override
    public String work() {
        return "船儿游";
    }
}

/**
 * 工厂模式 - 交通工具
 */
class VehiclesFactory {
    // 马儿是一直都在的，所以不用每次都new ，  饿汉模式
    private static final Horse horse = new Horse();

    /**
     * 构造器私有化， 避免工厂被 new
     */
    private VehiclesFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private VehiclesInterface vehicles;

    // 向上转型
    public Person(String name, VehiclesInterface vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            Boat boat = VehiclesFactory.getBoat();
            System.out.println(boat.work());
            System.out.println("工厂船儿");
        } else {
            System.out.println(vehicles.work());
        }
    }

    public void passRoad() {
        if (!(vehicles instanceof Horse)) {
            Horse horse = VehiclesFactory.getHorse();
            System.out.println(horse.work());
            System.out.println("工厂马尔");
        } else {
            System.out.println(vehicles.work());
        }
    }
}