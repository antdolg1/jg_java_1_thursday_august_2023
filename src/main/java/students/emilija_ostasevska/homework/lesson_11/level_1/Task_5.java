package students.emilija_ostasevska.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    // Переопределение equals() для сравнения объектов Book
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    // Переопределение hashCode() для поддержки equals()
    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Добавление книг в список
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");
        books.add(book1);
        books.add(book2);

        // Проверка наличия книг в списке
        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println("Contains book in the list: " + containsBook);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList);
        System.out.println("Contains book not in the list: " + notContainsBook);
    }
}

