package lesson.Day04_027_Class_Polymorphic.demo.demo5_instanceof;

/**
 *  instanceof： 判断对象的运行类型是否是XX类或XX子类的字类型
 *  --》向下转型需要考虑安全性，如果父类引用的对象是父类本身，那么在向下转型的过程中是不安全的，编译不会出错，但是运行时会出现java.lang.ClassCastException错误。
 *  --》它可以使用instanceof来避免出错此类错误即能否向下转型，只有先经过向上转型的对象才能继续向下转型。
 *  */
public class Index {
    public static void main(String[] args) {
        BB bb = new BB();
        // true
        System.out.println(bb instanceof  BB);
        // true
        System.out.println(bb instanceof  AA);


        AA aa = new BB();
        // true
        System.out.println(aa instanceof  BB);
        // true
        System.out.println(aa instanceof  AA);


        AA aaa = new AA();
        // false
        System.out.println(aaa instanceof  BB);
        // true
        System.out.println(aaa instanceof  AA);

    }
}

class AA {

}

class BB extends AA {

}