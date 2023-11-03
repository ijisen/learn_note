package lesson.Day03_01_VarParams;

/**
 * 可变参数
 * 1、 可变参数必须放最后
 */
public class Index {
    public static void main(String[] arg) {
        VarParams student_a = new VarParams();
        student_a.test("tom", 20, 10, 50);
        student_a.test("lucy", 40, 50, 70);
        student_a.getClassScore();

    }
}

class VarParams {
    /**
     * 成员变量|私有属性【全局变量】
     * 私有属性可以不用初始化
     */
    double classScore;

    //
    public void test(String name, double... scores) {
        // 成员属性【局部变量】
        // 局部变量必须初始化
        double total = 0;
        for (double item : scores) {
            total += item;
        }
        classScore += total;
        System.out.println(name + " 总分数：" + total);

    }

    public void getClassScore() {
        System.out.println("班级总分数：" + classScore);
    }
}
