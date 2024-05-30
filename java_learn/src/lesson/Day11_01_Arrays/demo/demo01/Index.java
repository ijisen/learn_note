package lesson.Day11_01_Arrays.demo.demo01;

import java.util.Arrays;

public class Index {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book("金瓶梅", 800);
        books[1] = new Book("西游记", 1200);
        books[2] = new Book("三国演绎", 400);
        books[3] = new Book("大名三国", 280);
        bubble01(books);

        System.out.println("===== bubble 02 ====");
        bubble02(books, new Comparator() {
            @Override
            public boolean compare(Book a, Book b) {
                return a.price < b.price;
            }
        });

        System.out.println("===== bubble 03 ====");
        Arrays.sort(books, new java.util.Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                // ps: 强制转换类型容易精度丢失
                double price = o1.price - o2.price;
                if (price > 0) {
                    return 1;
                }
                return -1;
            }
        });
        pringBooks(books);
    }


    public static void bubble01(Book[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].price > arr[j].price) {
                    Book temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //        System.out.println(Arrays.toString(arr));
        pringBooks(arr);
    }

    public static void bubble02(Book[] arr, Comparator c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j])) {
                    Book temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        pringBooks(arr);

    }

    public static void pringBooks(Book arr[]) {
        //        System.out.println(Arrays.toString(arr));
        for (Book item : arr) {
            System.out.println(item.toString());
        }
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

interface Comparator {
    public boolean compare(Book a, Book b);
}


