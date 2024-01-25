package lesson.Day07_01_Annotation.demo.demo6;

public class Index {
    public static void main(String[] args) {
        Car car = new Car(50);
        car.getAir().run();

    }
}

class Car {
    private int temp;

    public Car(int temp) {
        this.temp = temp;
    }

    class Air {
        public void run() {
            if (temp > 40) {
                System.out.println("40");
            } else {
                System.out.println("-40");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
