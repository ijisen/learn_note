package lesson.Day14_00_Collection._collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection 常用方法
 * Collection 是一个接口类型，不能被实例化
 *
 * */
public class _collection {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();

        /**  add: 添加单个元素 */
        System.out.println("添加单个元素");
        arrayList.add("jack");
        arrayList.add(20);
        arrayList.add(true);
        System.out.println(arrayList.toString());

        /** remove: 删除元素 */
        System.out.println("\n删除元素");
        // 下标删除
        arrayList.remove(2);
        System.out.println(arrayList.toString());
        // 删除指定元素
        arrayList.remove("jack");
        System.out.println(arrayList.toString());

        /** contains: 查找元素, 返回 boolean */
        System.out.println("\n查找元素");
        System.out.println(arrayList.contains("jack"));
        arrayList.add("jack");
        System.out.println(arrayList.contains("jack"));

        /** size: 获取元素个数 */
        System.out.println("\n获取元素个数");
        System.out.println(arrayList.size());

        /** isEmpty: 判断数组是否为空, 返回 boolean */
        System.out.println("\n判断数组是否为空");
        System.out.println(arrayList.isEmpty());

        /** clear: 清空数组 */
        System.out.println("\n清空数组");
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

        /** addAll: 添加多个元素 */
        System.out.println("\n添加多个元素");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("hmm");
        arrayList1.add(25);
        arrayList1.add(false);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        /** addAll: 查找多个元素是否存在 */
        System.out.println("\n查找多个元素是否存在");
        System.out.println(arrayList.containsAll(arrayList1));

        /** removeAll: 删除多个元素是否存在 */
        System.out.println("\n删除多个元素是否存在");
        arrayList.add("Tom");
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
    }
}
