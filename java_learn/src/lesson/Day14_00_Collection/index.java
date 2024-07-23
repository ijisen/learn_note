package lesson.Day14_00_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * 集合
 *
 * 集合分为： 单列集合  双列集合
 *
 * Collection: 单列集合
 * --> List： Vector（支持多线程） ArrayList（线程不安全，但执行效率高） LinkedList
 * ----> list 为有序数组
 * --> Set: TreeSet HashSet
 * ----> Set 为无序数组
 *
 * Map: HasMap->LinkedHashMap TreeMap Hashtable->Properties
 * */
public class index {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("tom");
        System.out.println(arrayList.toString());

        HashMap hashMap = new HashMap();
        hashMap.put("name", "jisen");
        hashMap.put("age", "25");
        System.out.println(hashMap.toString());
    }
}
