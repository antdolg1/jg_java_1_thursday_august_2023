package students.artjom_ossipov.lesson_11.level_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.removeId();
        test.removeBook();
        test.searchId();
        test.searchAuthor();
        test.searchTitle();
        test.countBook();
        test.removeAuthor();
        test.removeTitle();
    }
    void removeId() {
        Long bookId = 9l;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        checkResult(bookDatabaseImpl.delete(bookId), "`Удаление элемента по ID: ");
        checkResult(bookDatabaseImpl.delete(100l), "Удаление элемента по ID (FAIL): ");
    }

    void removeBook() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        Book bookRemove = new Book("A1", "B1");
        checkResult(bookDatabaseImpl.delete(bookRemove) , "Тест на удаление элемента по названию и автору: ");
        checkResult(bookDatabaseImpl.delete(new Book("A100", "B9")), "Тест на удаление элемента по названию и автору (FAIL): ");
    }

    void searchId() {
        Long bookId = 9l;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        Optional<Book> bookResultOptional = Optional.of(new Book("A9", "B9"));
        checkResult(bookDatabaseImpl.findById(bookId).equals(bookResultOptional), "Тест на поиск книги в списке по ID: ");
        checkResult(bookDatabaseImpl.findById(33l).equals(bookResultOptional), "Тест на поиск книги в списке по ID (FAIL): ");
    }

    void searchAuthor() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        List<Book> result = new LinkedList<>();
        result.add(new Book("A3", "B3"));
        checkResult(bookDatabaseImpl.findByAuthor("A3").equals(result), "Тест на поиск книги в списке по автору: ");
        checkResult(bookDatabaseImpl.findByAuthor("A100").equals(result), "Тест на поиск книги в списке по автору (FAIL): ");
    }

    void searchTitle() {
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        List<Book> result = new LinkedList<>();
        result.add(new Book("A1", "B1"));
        checkResult(bookDatabaseImpl.findByTitle("B1").equals(result), "Тест на поиск книги в списке по названию: ");
        checkResult(bookDatabaseImpl.findByTitle("A100").equals(result), "Тест на поиск книги в списке по названию (FAIL): ");
    }

    void countBook() {
        int result = 9;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        checkResult(bookDatabaseImpl.countAllBooks() == result, "Тест на количество всех книг в списке: ");
        checkResult(bookDatabaseImpl.countAllBooks() == 44, "Тест на количество всех книг в списке (FAIL): ");
    }
    void removeAuthor() {
        int result = 8;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        bookDatabaseImpl.deleteByAuthor("A1");
        checkResult(bookDatabaseImpl.linkedListBook.size() == result, "Тест на удаление всех книг определенного автора: ");
        checkResult(bookDatabaseImpl.linkedListBook.size() == 44, "Тест на удаление всех книг определенного автора (FAIL): ");
    }

    void removeTitle() {
        int result = 8;
        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();
        bookDatabaseImpl.save(new Book("A1", "B1"));
        bookDatabaseImpl.save(new Book("A2", "B2"));
        bookDatabaseImpl.save(new Book("A3", "B3"));
        bookDatabaseImpl.save(new Book("A4", "B4"));
        bookDatabaseImpl.save(new Book("A5", "B5"));
        bookDatabaseImpl.save(new Book("A6", "B6"));
        bookDatabaseImpl.save(new Book("A7", "B7"));
        bookDatabaseImpl.save(new Book("A8", "B8"));
        bookDatabaseImpl.save(new Book("A9", "B9"));
        bookDatabaseImpl.deleteByTitle("B6");
        checkResult(bookDatabaseImpl.linkedListBook.size() == result, "Тест на удаление всех книг определенного названия: ");
        checkResult(bookDatabaseImpl.linkedListBook.size() == 33, "Тест на удаление всех книг определенного названия (FAIL): ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
