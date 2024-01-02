package students.emilija_ostasevska.homework.lesson_11.level_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    List<Book> getAllBooks();
}

class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public Long save(Book book) {
        book.setId(nextId);
        books.add(book);
        return nextId++;
    }

    @Override
    public boolean delete(Long bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId().equals(bookId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public static void main(String[] args) {
        // Пример использования BookDatabaseImpl
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Author1", "Title1");
        Long id1 = bookDatabase.save(book1);
        System.out.println("Saved book with id: " + id1);

        Book book2 = new Book("Author2", "Title2");
        Long id2 = bookDatabase.save(book2);
        System.out.println("Saved book with id: " + id2);

        // Удаление книги по id
        boolean deleted = bookDatabase.delete(id1);
        System.out.println("Book with id " + id1 + " deleted: " + deleted);

        // Вывод всех книг после удаления
        System.out.println("All books in the database after deletion:");
        for (Book savedBook : bookDatabase.getAllBooks()) {
            System.out.println("Id: " + savedBook.getId() + ", Author: " + savedBook.getAuthor() + ", Title: " + savedBook.getTitle());
        }
    }
}
