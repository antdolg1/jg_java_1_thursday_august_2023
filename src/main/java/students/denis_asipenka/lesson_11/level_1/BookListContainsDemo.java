package students.denis_asipenka.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        Book book1 = new Book("In Search of Lost Time", "Marcel Proust");
        Book book2 = new Book("Ulysses", "James Joyce");

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);

        Book bookTrue = new Book("Ulysses", "James Joyce");
        Book bookFalse = new Book("James", "James Joyce");
        System.out.println(listBook.contains(bookTrue));
        System.out.println(listBook.contains(bookFalse));
    }
}