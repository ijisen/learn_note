package lesson.Day04_021_Class_This.demo;

public class demo4 {
    public static void main(String[] arg) {
        PassObject a =new PassObject();
        a.printAreas(new Circle(), 5);
    }
}

class Circle {
    double radius;

    public void findArea() {
        double area = Math.PI * this.radius * this.radius;
        System.out.println(this.radius + "\t" + area);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}


class PassObject {
    public void printAreas(Circle c, int items) {
        for (int i = 1; i <= items; i++) {
            c.setRadius(i);
            c.findArea();
        }
    }
}
