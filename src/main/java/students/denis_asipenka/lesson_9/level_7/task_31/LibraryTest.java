package students.denis_asipenka.lesson_9.level_7.task_31;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryTest test = new LibraryTest();
        test.notification();
        test.searchBookTest();
        test.bookReservationTest();
        test.printingListBorrowedBooksTest();
        test.bookTakeTest();
        test.returnBookTest();
        test.addBookTest();
    }

    void notification() {
        ArrayList<TakeBook> list = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        BookReader user = new BookReader(11, "Ivan", "Ivanov", "non@mail.ru");
        BookReader user1 = new BookReader(22, "Kirill", "Petrov", "non1@mail.ru");
        BookReader user2 = new BookReader(33, "Igor", "Varlamov", "non2@mail.ru");
        BookReader user3 = new BookReader(44, "Stas", "Dudko", "non3@mail.ru");

        TakeBook takeBook = new TakeBook(111, book, user, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 20));
        TakeBook takeBook1 = new TakeBook(222, book1, user1, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 21));
        TakeBook takeBook2 = new TakeBook(333, book2, user2, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 11, 22));
        TakeBook takeBook3 = new TakeBook(444, book3, user3, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 22));

        Library library = new Library();
        list.add(takeBook);
        list.add(takeBook1);
        list.add(takeBook2);
        list.add(takeBook3);
        library.notification(list);
    }

    void searchBookTest() {
        ArrayList<Book> list = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        Library library = new Library();
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        library.searchBook("KinG", list);
    }

    void bookReservationTest() {
        ArrayList<Book> list = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        Library library = new Library();
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        library.bookReservation(4, list);
        library.printListBook(list);
    }

    void printingListBorrowedBooksTest() {
        ArrayList<TakeBook> list = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        BookReader user = new BookReader(11, "Ivan", "Ivanov", "non@mail.ru");
        BookReader user1 = new BookReader(22, "Kirill", "Petrov", "non1@mail.ru");
        BookReader user2 = new BookReader(33, "Igor", "Varlamov", "non2@mail.ru");
        BookReader user3 = new BookReader(44, "Stas", "Dudko", "non3@mail.ru");

        TakeBook takeBook = new TakeBook(111, book, user, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 20));
        TakeBook takeBook1 = new TakeBook(222, book1, user1, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 21));
        TakeBook takeBook2 = new TakeBook(333, book2, user2, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 11, 22));
        TakeBook takeBook3 = new TakeBook(444, book3, user3, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 22));

        Library library = new Library();
        list.add(takeBook);
        list.add(takeBook1);
        list.add(takeBook2);
        list.add(takeBook3);
        library.printingListBorrowedBooks(list);
    }

    void bookTakeTest() {
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<TakeBook> listTakeBook = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        BookReader user = new BookReader(11, "Ivan", "Ivanov", "non@mail.ru");
        BookReader user1 = new BookReader(22, "Kirill", "Petrov", "non1@mail.ru");
        BookReader user2 = new BookReader(33, "Igor", "Varlamov", "non2@mail.ru");
        BookReader user3 = new BookReader(44, "Stas", "Dudko", "non3@mail.ru");

        Library library = new Library();
        listBook.add(book);
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        library.bookTake(111, user, 1, listBook, listTakeBook);
        library.bookTake(222, user1, 2, listBook, listTakeBook);
        library.bookTake(333, user2, 3, listBook, listTakeBook);
        library.bookTake(444, user3, 4, listBook, listTakeBook);
        library.printingListBorrowedBooks(listTakeBook);
        library.printListBook(listBook);
    }

    void returnBookTest() {
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<TakeBook> listTakeBook = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", false, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        BookReader user = new BookReader(11, "Ivan", "Ivanov", "non@mail.ru");
        BookReader user1 = new BookReader(22, "Kirill", "Petrov", "non1@mail.ru");
        BookReader user2 = new BookReader(33, "Igor", "Varlamov", "non2@mail.ru");
        BookReader user3 = new BookReader(44, "Stas", "Dudko", "non3@mail.ru");

        TakeBook takeBook = new TakeBook(111, book, user, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 10));
        TakeBook takeBook1 = new TakeBook(222, book1, user1, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 21));
        TakeBook takeBook2 = new TakeBook(333, book2, user2, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 11, 22));
        TakeBook takeBook3 = new TakeBook(444, book3, user3, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 2));

        Library library = new Library();
        listBook.add(book);
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listTakeBook.add(takeBook);
        listTakeBook.add(takeBook1);
        listTakeBook.add(takeBook2);
        listTakeBook.add(takeBook3);
        library.printListBook(listBook);
        library.printingListBorrowedBooks(listTakeBook);
        library.returnBook(111, listBook, listTakeBook);
        library.printListBook(listBook);
        library.printingListBorrowedBooks(listTakeBook);
    }

    void addBookTest() {
        ArrayList<Book> list = new ArrayList<>();
        Book book = new Book(1, "King", "Esenin", true, false);
        Book book1 = new Book(2, "Kin1g", "Esenin1", true, false);
        Book book2 = new Book(3, "King", "Esenin2", true, false);
        Book book3 = new Book(4, "King", "Esenin3", true, false);

        Library library = new Library();
        library.addBook(book, list);
        library.addBook(book1, list);
        library.addBook(book2, list);
        library.addBook(book3, list);
        library.printListBook(list);
    }

    private void calculatePerimeterTest(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}