package lesson.Day04_025_Class_Extends.demo.demo6;

public class Index {
    public static void main(String[] arg) {
        NotePad notePad = new NotePad("i7", "32G", "128G", "green");
        notePad.getColor();
        notePad.getDetail();
        PC pc = new PC("i9", "64G", "2T", "look");
        pc.getBrand();
        pc.getDetail();
    }
}

class Computer {
    private String cpu;
    private String ram;
    private String disk;

    Computer(String cpu, String ram, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public void getDetail() {
        System.out.println(this.cpu + "|" + this.ram + "|" + this.disk);
    }

}


class PC extends Computer {
    private String brand;

    public PC(String cpu, String ram, String disk, String brand) {
        super(cpu, ram, disk);
        this.brand = brand;
    }

    public String getBrand() {
        System.out.println(this.brand);
        return brand;
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String ram, String disk, String color) {
        super(cpu, ram, disk);
        this.color = color;
    }

    public String getColor() {
        System.out.println(this.color);
        return color;
    }
}




