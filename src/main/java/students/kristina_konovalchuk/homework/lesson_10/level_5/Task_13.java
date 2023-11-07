package students.kristina_konovalchuk.homework.lesson_10.level_5;

import students.kristina_konovalchuk.homework.lesson_10.level_1.Task_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_13 {
    public interface BookReader {
        boolean addBook(String author, String title);

        boolean removeBook(String author, String title);

        boolean markAsRead(String author, String title);

        String[] listBooks();

        String[] searchByAuthor(String author);

        String[] searchByTitle(String title);

        String[] listReadBooks();

        String[] listUnreadBooks();
    }

    public static class BookReaderImpl implements BookReader {
        private Set<String> books = new HashSet<>( );
        private Task_3.MyArrayList<String> readBooks;

        @Override
        public boolean addBook(String author, String title) {
            if (author == null || title == null) {
                return false;
            }
            String book = author + " - " + title;
            if (books.contains( book )) {
                return false;
            } else {
                books.add( book );
                return true;
            }
        }

        @Override
        public boolean removeBook(String author, String title) {
            String book = author + " - " + title;
            if (books.contains( book )) {
                books.remove( book );
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String[] listBooks() {
            String[] result = new String[books.size( )];
            int i = 0;
            for (String book : books) {
                result[i++] = book.replace( " - ", " [" ) + "]";
            }
            return result;
        }

        @Override
        public String[] searchByAuthor(String author) {
            List<String> result = new ArrayList<>( );
            for (String book : books) {
                if (book.startsWith( author + " - " )) {
                    result.add( book.replace( " - ", " [" ) + "]" );
                }
            }
            return result.toArray( new String[0] );
        }

        @Override
        public String[] searchByTitle(String title) {
            List<String> result = new ArrayList<>( );
            for (String book : books) {
                if (book.endsWith( title )) {
                    result.add( book.replace( " - ", " [" ) + "]" );
                }
            }
            return result.toArray( new String[0] );
        }

        @Override
        public boolean markAsRead(String author, String title) {
            String book = author + " - " + title;
            if (books.contains( book )) {
                readBooks.add( book );
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String[] listReadBooks() {
            String[] result = new String[readBooks.size( )];
            int i = 0;
            for (String book : readBooks) {
                result[i++] = book.replace( " - ", " [" ) + "]";
            }
            return result;
        }

        @Override
        public String[] listUnreadBooks() {
            Set<String> unreadBooks = new HashSet<>( books );
            unreadBooks.removeAll( readBooks );
            String[] result = new String[unreadBooks.size( )];
            int i = 0;
            for (String book : unreadBooks) {
                result[i++] = book.replace( " - ", " [" ) + "]";
            }
            return result;
        }
    }
}


