package lesson.Day13_00_Date;



/**
 * 第一代日期： Date
 * 第二代日期： Calendar
 * 第三代日期：
 *
 * */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class index {
    public static void main(String[] args) {

        System.out.println("第一代日期 Date");
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(format.format(date));


        /**
         * 第二代日期
         * Calendar 是一个抽象类
         * */
        System.out.println("\n 第二代日期 Calendar");
        Calendar calendar = Calendar.getInstance();
        System.out.println("年份：" + calendar.get(Calendar.YEAR));
        System.out.println("月份：" + calendar.get(Calendar.MONTH));
        System.out.println("号：" + calendar.get(Calendar.DATE));
        System.out.println("12小时：" + calendar.get(Calendar.HOUR));
        System.out.println("24小时：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("当年第几周：" + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("当月第几周：" + calendar.get(Calendar.WEEK_OF_MONTH));


        /**
         * 第三代日期 【JDK 8 引入】
         * 出现原因： 一代，二代有BUG
         * JDK 1.0中包含了java.util.Date 类， 但是它的大多数方法在1.1引入Calendar后被弃用；
         *
         * 同时Calendar中还有很多BUG
         *
         * 1、可变性：日期和时间应该是不可变的
         * 2、偏移性：Date中年份是从1900开始的，而月份是从0开始
         * 3、格式化： 格式化只对Date有用，Calendar 则不能用
         * 4、线程不安全，不能处理润秒等，（每隔两天多数1s）
         *
         * LocalDate: 只包含年、月、日
         * LocalTime: 只包含时、分、秒
         * LocalDateTime： 集合
         * */
        System.out.println("\n 第三代日期 Calendar");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println("时：" + localTime.getHour());
        System.out.println("分：" + localTime.getMinute());
        System.out.println("秒：" + localTime.getSecond());
        System.out.println("毫秒：" + localTime.getNano());

        LocalTime lt2 = localTime.plusHours(2);
        System.out.println(lt2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(df.format(localDateTime));
    }
}
