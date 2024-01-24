package lesson.Day07_01_Annotation.demo.demo1;

public class Index {
    public static void main(String[] args) {
        /**
         * 1、Car 实例化
         * 2、调用car的无参构造器，
         * 3、修改 color 值为 red
         * 4、static color 已被重置为 red属性
         * */
        Car car = new Car();
        System.out.println(car);
        Car car2 = new Car();
        // color = red; static 属性，类似于一个全局变量，类加载时就执行了
        System.out.println(car2);
    }
}


class Car {
    private double price;
    static String color = "white";

    public Car() {
        this.price = 90;
        color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price + ", color=" + color +
                '}';
    }
}
