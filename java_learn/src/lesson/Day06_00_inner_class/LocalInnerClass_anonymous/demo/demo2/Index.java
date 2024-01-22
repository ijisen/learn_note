package lesson.Day06_00_inner_class.LocalInnerClass_anonymous.demo.demo2;

public class Index {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring () {
                System.out.println("起床啦！！");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring () {
                System.out.println("上课啦！！");
            }
        });
    }

}


interface Bell {
    public void ring ();
}

class CellPhone {


    public void alarmClock (Bell bell) {
        bell.ring();
    }
}
