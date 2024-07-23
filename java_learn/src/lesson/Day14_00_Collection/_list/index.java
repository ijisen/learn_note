package lesson.Day14_00_Collection._list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * List
 * --> ArrayList
 * --> LinkedList
 * --> Vector
 * ---> Iterator for i foreach 都可以用于以上三种
 * */
public class index {
    public static void main(String[] args) {
        List list = new ArrayList();

        /**  add: 添加单个元素 */
        System.out.println("添加单个元素");
        list.add("tom");
        list.add("hmm");
        list.add("tom");
        System.out.println(list);

        /**  remove: 删除单个元素
         *  会从第一个元素开始查找匹配值
         * */
        System.out.println("删除单个元素");
        list.remove("tom");
        System.out.println(list);
    }
}
