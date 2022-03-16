package lesson.Day08_Opp.Test_06_Package;

/**
 * 封装的步骤：
 * 1、 所有属性私有化， 使用 private 关键字进行修饰， private 表示私有的， 修饰的所有数据只能在本类中访问
 * <p>
 * 2、 对外提供简单的操作入口， 也就是说外部想要访问内部的属性，只能通过接口访问。
 * ----> 对外提供两个公开的方法，分别是 set 和 get
 * 3、set方法的命名规范： set + 属性名 eg： setName
 * 4、get方法的命名规范： get + 属性名 eg： getName
 * 5、static 属性不能使用 set || get 方法
 */
public class Index {
    public static void main(String[] args) {
        User user = new User();
        // null
        System.out.println(user.getName());

        user.setName("盈盈");
        // 盈盈
        System.out.println(user.getName());

    }
}
