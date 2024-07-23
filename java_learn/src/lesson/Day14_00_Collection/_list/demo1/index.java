package lesson.Day14_00_Collection._list.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class index {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 1; i < 11; i++) {
            list.add("index " + i);
        }
        System.out.println(list);

        list.add(2, "import 2");
        System.out.println(list);

        System.out.println(list.get(5));

        list.remove(6);
        System.out.println(list);

        list.set(6, "reset 71");
        System.out.println(list);


        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

    }
}
