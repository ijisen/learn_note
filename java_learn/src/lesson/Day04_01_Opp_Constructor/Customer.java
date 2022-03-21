package lesson.Day04_01_Opp_Constructor;

/**
 * 创建一个 coutomer 对象
 */
public class Customer {
    private int no;
    private String name;
    private String birth;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Customer(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }
}
