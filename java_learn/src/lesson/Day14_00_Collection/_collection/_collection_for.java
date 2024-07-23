package lesson.Day14_00_Collection._collection;

import lesson.Day14_00_Collection.Book;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection 增强for循环， 替换 iterator
 */
public class _collection_for {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();

        arrayList.add(new Book("三国演义", "罗贯中", 50));
        arrayList.add(new Book("西游记", "吴承恩", 20));
        arrayList.add(new Book("红楼梦", "曹雪芹", 70));


        System.out.println(arrayList);
        System.out.println('\n');

        // 增强For循环 快捷键： I
        for (Object book: arrayList) {
            System.out.println(book);
        }


    }
}


