package lesson.Day08_Exception.demo.demo1;

public class Index {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(n1);
            System.out.println(n2);
            if (n2 == 0) {
                throw new NumberFormatException("不能为0");
            }
            double res = cal(n1, n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0");
        }
    }
    static double cal(int a, int b) throws NumberFormatException {
        return (double)a / b;
    }
}

