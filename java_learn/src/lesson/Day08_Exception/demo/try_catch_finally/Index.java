package lesson.Day08_Exception.demo.try_catch_finally;
/**
 *
 * try catch finally 使用方法同js
 * */
public class Index {
    public static void main(String[] args) {
        //        null
        //        java.lang.NullPointerException
        //        finally
        //        4
        System.out.println(methods());

        System.out.println("-------------");

        /**
         * finally无论如何都会最终执行
         * null
         * hmm
         * finally
         * 3
         * */
        System.out.println(method2());

        System.out.println("-------------");
        System.out.println(method3());

        System.out.println("-------------");
        System.out.println(method4());
    }

    public static int methods() {
        int i = 1;
        try {
            String[] arr = new String[3];
            i++;
            // null
            System.out.println(arr[1]);
            if (arr[1].equals("tom")) {
                arr[0] = "lucy";
            } else {
                arr[0] = "hmm";
            }
            // 不执行
            System.out.println(arr[0]);
            // todo: 此处会jvm会存一个临时变量 temp = 2
            return i;
        } catch (NullPointerException e) {
            System.out.println(e);
            // todo: 此处会jvm会存一个临时变量 temp = 3
            return ++i;
        } finally {
            System.out.println("finally");
            // todo: 此处会jvm会存一个临时变量 temp = 4
            return ++i;
        }
    }

    public static int method2() {
        int i = 1;
        try {
            String[] arr = new String[3];
            i++;
            // null
            System.out.println(arr[1]);
            if (arr[1] == "tom") {
                arr[0] = "lucy";
            } else {
                arr[0] = "hmm";
            }
            // hmm
            System.out.println(arr[0]);
            // todo: 此处会jvm会存一个临时变量 temp = 2
            return i;
        } catch (NullPointerException e) {
            System.out.println(e);
            // todo: 此处会jvm会存一个临时变量 temp = 3
            return ++i;
        } finally {
            System.out.println("finally");
            // todo: 此处会jvm会存一个临时变量 temp = 4
            return ++i;
        }
    }


    /**
     * finally 中如何没有return，会找catch中的return
     * null
     * java.lang.NullPointerException
     * 4
     * finally
     * 3  catch 返回return
     */
    public static int method3() {
        int i = 1;
        try {
            String[] arr = new String[3];
            i++;
            // null
            System.out.println(arr[1]);
            if (arr[1].equals("tom")) {
                arr[0] = "lucy3";
            } else {
                arr[0] = "hmm3";
            }
            // hmm
            System.out.println(arr[0]);
            // todo: 此处会jvm会存一个临时变量 temp = 2
            return i;
        } catch (NullPointerException e) {
            System.out.println(e);
            i++;
            // todo: 此处会jvm会存一个临时变量 temp = 3
            // temp = i;
            return i;
        } finally {
            i++;
            // 4
            System.out.println(i);
            System.out.println("finally");
        }
    }


    /**
     * finally 中如何没有return，会找try || catch中的return
     * null
     * hmm4
     * 3
     * 2  try 返回return
     */
    public static int method4() {
        int i = 1;
        try {
            String[] arr = new String[3];
            i++;
            // null
            System.out.println(arr[1]);
            if (arr[1] == "tom") {
                arr[0] = "lucy4";
            } else {
                arr[0] = "hmm4";
            }
            // hmm
            System.out.println(arr[0]);
            // todo: 此处会jvm会存一个临时变量 temp = 2
            return i;
        } finally {
            i++;
            // 4
            System.out.println(i);
            System.out.println("finally");
        }
    }
}
