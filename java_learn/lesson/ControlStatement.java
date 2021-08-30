
/**
 * 控制语句
 * 选择结构： if  if..else switch
 * 循环结构： for  while do..while
 * 控制循环结构：break continue
 */
public class ControlStatement {
    public static void main(String[] args) {
        int grade = 90;
        if (grade > 90) {
            System.out.println('A');
        } else if (grade > 80) {
            System.out.println('B');
        } else if (grade > 70) {
            System.out.println('C');
        } else {
            System.out.println('D');
        }
    }
}

/**
 * if 语句
 */
class ControlStatementIf {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("请输入你的年龄：");

        // 接收年龄输入内容
        int age = s.nextInt();

        if (age > 25) {
            System.out.println("老年人");
        } else {
            System.out.println("青年");
        }

    }
}

/**
 * Switch 语法
 */
class ControlStatementSwitch {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入你的成绩: ");

        // 接收年龄输入内容
        int grade = s.nextInt();
        grade = grade / 10;
        char result = 'E';
        switch (grade) {
            case 10:
            case 9:
                result = 'A';
                break;
            case 8:
                result = 'B';
                break;
            case 7:
                result = 'C';
                break;
            case 6:
                result = 'D';
                break;

        }
        System.out.println(result);
    }
}

/**
 * for 循环
 */
class ControlStatementFor {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入查询下标： ");

        // 接收年龄输入内容
        int index = s.nextInt();
        for (int i = 0; i < index; i++) {
            //  if (item > 5) break;
            // if (item > 5) continue;
             if (i > 5) return;
            System.out.println(i);
        }

    }
}
