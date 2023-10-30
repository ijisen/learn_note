package lesson.Day02_03_ControlStatement;

import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);

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
 * 表达式数据类型与case数据类型必须一致，否则会报错； eg: grade 的类型和case类型。
 * --> 或者可以自动转换成可以相互比较的类型： 输入的是int，比较的double
 * 表达式值必须是： byte、short、int、char、enum、 String
 * case 值必须是常量，不能是变量
 */
class ControlStatementSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入你的成绩: ");

        // 接收年龄输入内容
        // 数据类型与case数据类型必须保持一致，或者他们之间可以自动转换
        int grade = s.nextInt();
        grade = grade / 10;
        char result = 'E';
        // 表达式值
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
        Scanner s = new Scanner(System.in);
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


/**
 * while 控制语句
 */
class ControlStatementWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}

/**
 * 循环语句打断
 * break  打断循环
 */
class ControlStatementBreak {
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            // 当i=2时，中断for循环
            if (i == 2) {
                break;
            }
        }
    }
}

/**
 * 循环语句打断
 * break 打断最近的循环
 * label 打断标签名申明的循环，label名称为自定义
 */
class ControlStatementBreakLabel {
    public static void main(String[] arg) {
        label1:
        for (int k = 1; k < 4; k++) {
            label2:
            for (int i = 1; i < 10; i++) {
                System.out.println(i);
                // 当i=2时，中断for循环
                if (i == 2) {
                    // 1 2
                    break label1;
                    // 1 2 1 2 1 2
                    // break;
                }
            }
        }
    }
}

/**
 * 循环语句打断 【continue】
 * continue  打断循环
 */
class ControlStatementContinue {
    public static void main(String[] arg) {
        int i = 0;
        while (i <= 4) {
            i++;
            if (i == 3) {
                continue;
            }
            // 1 2 4 5
            System.out.println(i);
        }
    }
}

/**
 * 循环语句打断 【continue】
 * continue  打断循环
 */
class ControlStatementContinueLabel {
    public static void main(String[] arg) {
        label1:
        for (int k = 1; k < 4; k++) {
            label2:
            for (int i = 1; i < 5; i++) {
                // 当i=2时，中断for循环
                if (i == 3) {
                    // 1 2 1 2 1 2
                    continue label1;
                    // 1 2 4 1 2 4 1 2 4
//                     continue;
                }
                System.out.println(i);
            }
        }
    }
}
