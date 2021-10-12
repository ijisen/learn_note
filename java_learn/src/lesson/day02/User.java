package lesson.day02;

/**
 * getter & setter 没有 static 修饰方法
 */
public class User {
    String name;
    int age;
    // 属性私有化
    private String pwd;

    /**
     * 缺省构造器， 编译时会自动生成
     */
    public User(int age) {
        System.out.println("缺省构造器, 会自动执行。获取 AGE 参数：" + age);
    }

    public User(String name) {
        System.out.println("缺省构造器, 会自动执行。获取 NAME 参数：" + name);
    }

    /**
     * 缺省构造器， 传递两个参数 重载
     * */
    public User(String newName, int newAge) {
        age = newAge;
        name = newName;
        System.out.println("缺省构造器, 会自动执行。获取 NAME-AGE 参数：" + name + "-" + age);
    }


    /**
     * 缺省构造器， 编译时会自动生成
     */
    public User() {
        System.out.println("缺省构造器, 会自动执行");
    }

    /**
     * 设置密码
     * */
    public void setPwd(String val) {
        pwd = val;
        System.out.println("密码设置成功：" + val);
    }
    /**
     * 查看密码
     * */
    public String getPwd() {
        return pwd;
    }
}
