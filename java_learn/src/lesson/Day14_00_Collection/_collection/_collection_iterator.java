package lesson.Day14_00_Collection._collection;

import lesson.Day14_00_Collection.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection Iterator
 */
public class _collection_iterator {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();

        arrayList.add(new Book("三国演义", "罗贯中", 50));
        arrayList.add(new Book("西游记", "吴承恩", 20));
        arrayList.add(new Book("红楼梦", "曹雪芹", 70));


        System.out.println(arrayList);
        System.out.println('\n');

        Iterator iterator = arrayList.iterator();

        // 快捷键： it it + 回车
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next.toString());
        }
        // 会报错, 因为已经执行完了
        //iterator.next();

        // 重置迭代器，以便二次遍历使用
        iterator = arrayList.iterator();
    }
}


