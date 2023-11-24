package demo.demo8;

public class House {
    private String name;
    private double price;
    private boolean isOut;

    public House(String name, double price, boolean isOut) {
        this.name = name;
        this.price = price;
        this.isOut = isOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean out) {
        isOut = out;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name +
                ", price=" + price +
                ", isOut=" + isOut +
                '}';
    }
}
