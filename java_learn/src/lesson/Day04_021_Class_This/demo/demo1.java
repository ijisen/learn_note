package lesson.Day04_021_Class_This.demo;

public class demo1 {

    public static void main(String[] arg) {
        MaxNum a = new MaxNum();
        System.out.println(a.getMax(10, 20.2));
        System.out.println("-------------");


        Book b = new Book("name", 800);
        b.updatePrice();
        b.getPrice();
        b.setPrice(999);
    }
}

class MaxNum {
    int a;

    public MaxNum() {
        // 此种语法只能在构造器中使用，且必须得放在第一行
        // Error:对this的调用必须是构造器中的第一个语句
        this(10);
        System.out.println("MaxNum");
    }

    public MaxNum(int a) {
        this.a = a;
    }

    public double getMax(double a, double b) {
        return a > b ? a : b;
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double pPrice) {
        price = pPrice;
        // java 不会声明提前
        double price = 10;
        int age = 50;
        // 999
        System.out.println(this.price);
        // 10
        System.out.println(price);
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 200;
        } else {

            this.price = 100;
        }
    }

    public void getPrice() {
        System.out.println(this.price);
    }

}
