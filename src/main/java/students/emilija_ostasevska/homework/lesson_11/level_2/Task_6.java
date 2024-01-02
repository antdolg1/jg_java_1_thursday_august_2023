package students.emilija_ostasevska.homework.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}

interface BookDatabase {
    Long save(Book book);
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

    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Author1", "Title1");
        Long id1 = bookDatabase.save(book1);
        System.out.println("Saved book with id: " + id1);

        Book book2 = new Book("Author2", "Title2");
        Long id2 = bookDatabase.save(book2);
        System.out.println("Saved book with id: " + id2);

        System.out.println("All books in the database:");
        for (Book savedBook : bookDatabase.books) {
            System.out.println("Id: " + savedBook.getId() + ", Author: " + savedBook.getAuthor() + ", Title: " + savedBook.getTitle());
        }
    }
}
