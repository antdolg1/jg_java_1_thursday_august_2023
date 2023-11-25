package students.kristina_konovalchuk.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task_5 {
    private Object author;
    private Object title;

    public class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.author = author;
            this.title = title;

        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;
        Book book = ( Book ) o;
        return Objects.equals( title, book.title ) && Objects.equals( author, book.author );
    }

    @Override
    public int hashCode() {
        return Objects.hash( title, author );
    }

    public class BookListContainsDemo {
        public void main(String[] args) {
            List<Book> books = new ArrayList<>( );
            Book book1 = new Book( "A1", "B1" );
            Book book2 = new Book( "A1", "B2" );
            books.add( book1 );
            books.add( book2 );
            Book booksInTheList = new Book( "A3", "B3" );
            boolean notContainsBook = books.contains( booksInTheList );
            System.out.println( booksInTheList );
            System.out.println( notContainsBook );
        }
    }
}
