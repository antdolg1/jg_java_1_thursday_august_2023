package students.artjom_ossipov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);

        Book bookTrue = new Book("A1", "B1");
        Book bookFalse = new Book("A3", "B3");
        System.out.println(listBook.contains(bookTrue));
        System.out.println(listBook.contains(bookFalse));
    }
}
