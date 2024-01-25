package lesson.Day07_01_Annotation.demo.demo7;

public class Index {
    public static void main(String[] args) {
        Color black = Color.BLACK;

        switch (black) {
            case BLACK:
                System.out.println(black);
                System.out.println(Color.BLACK);
                break;
            default:
                System.out.println("blacks");
        }
    }
}


interface ColorInter {
    public void run();
}

enum Color implements ColorInter {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    BLACK(0, 255, 0),
    YELLOW(255, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue='" + redValue + '\'' +
                ", greenValue='" + greenValue + '\'' +
                ", blueValue='" + blueValue + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(toString());
    }
}