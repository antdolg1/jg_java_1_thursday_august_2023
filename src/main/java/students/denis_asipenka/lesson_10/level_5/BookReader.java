package students.denis_asipenka.lesson_10.level_5;

import java.util.ArrayList;

public interface BookReader {
    boolean addBook(String author, String title);

    boolean checkingForEmpty(String author, String title);

    boolean removeBook(String author, String title);

    void allBookPrint();

    ArrayList<Book> searchBookAuthor(String author);

    ArrayList<Book> searchFirstLetterAuthor(String author);

    ArrayList<Book> searchBookTitle(String title);

    ArrayList<Book> searchFirstLetterTitle(String title);

    boolean markAsRead(String author, String title);

    boolean markAsUnread(String author, String title);

    void printBookIsRead();

    void printBookIsUnread();

}