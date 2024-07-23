package lesson.Day14_00_Collection._list.demo2;

import lesson.Day14_00_Collection.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class index {
    public static void main(String[] args) {
//        List list = new ArrayList<Book>();
//        List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("三国演义", "罗贯中", 20));
        list.add(new Book("西游记", "吴承恩", 2000));
        list.add(new Book("红楼梦", "曹雪芹", 200));
        list.add(new Book("哥斯拉", "曹芹芝", 50));
        list.add(new Book("复仇者联盟", "漫威", 10));


        list = reSort(list);
        //        System.out.println(list);
        System.out.println("书名\t\t作者\t\t\t价格");
        for (int i = 0; i < list.size(); i++) {
            Book item = (Book) (list.get(i));
            System.out.println(item.getName() + "\t" + item.getAuthor() + "\t\t" + item.getPrice());
        }
    }


    public static List reSort(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                Book book1 = (Book) (list.get(i));
                Book book2 = (Book) (list.get(j));
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(i, book2);
                    list.set(j, book1);
                }
            }
        }
        return list;
    }
}

