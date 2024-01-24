package lesson.Day07_01_Annotation.demo.demo2;

public class Index {
    public static void main(String[] args) {
        Frock frock = new Frock();
        //        System.out.println(frock.getNextNum());
        //        System.out.println(frock.getNextNum());
        System.out.println(frock.getSerialNumber());
        System.out.println(new Frock().getSerialNumber());
        System.out.println(new Frock().getSerialNumber());

    }
}


class Frock {
    private static int currentNum = 100000;

    private int serialNumber;

    private int getNextNum() {
        currentNum += 100;
        return currentNum;

    }

    Frock() {
        int num = getNextNum();
        setSerialNumber(num);
    }

    int getSerialNumber() {
        return serialNumber;
    }

    private void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
