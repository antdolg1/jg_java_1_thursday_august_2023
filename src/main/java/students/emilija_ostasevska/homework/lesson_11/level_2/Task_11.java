package students.emilija_ostasevska.homework.lesson_11.level_2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

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
    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Author1", "Title1");
        Long id1 = bookDatabase.save(book1);
        System.out.println("Saved book with id: " + id1);

        Book book2 = new Book("Author2", "Title2");
        Long id2 = bookDatabase.save(book2);
        System.out.println("Saved book with id: " + id2);

        List<Book> booksByTitle = bookDatabase.findByTitle("Title1");
        System.out.println("Books by title 'Title1':");
        for (Book foundBook : booksByTitle) {
            System.out.println("Id: " + foundBook.getId() + ", Author: " + foundBook.getAuthor() + ", Title: " + foundBook.getTitle());
        }
    }
}
