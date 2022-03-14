package lesson.day04_static;

public class ChineseTest {
    public static void main(String args[]) {
        Chinese user1 = new Chinese("1", "lilei");
        System.out.println("id: " + user1.id + "; name: " + user1.name + "; country: " + Chinese.country);
        Chinese user2 = new Chinese("2", "hmm");
        // 不推荐使用 user2.country; 而应该使用 Chinese.country
        System.out.println("id: " + user2.id + "; name: " + user2.name + "; country: " + user2.country);
        user2 = null;
        // 不会报 空指针
        System.out.println(user2.country);
    }
}
