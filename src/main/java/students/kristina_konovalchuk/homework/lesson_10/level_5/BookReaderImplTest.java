package students.kristina_konovalchuk.homework.lesson_10.level_5;

import org.junit.Test;
import students.kristina_konovalchuk.homework.lesson_10.level_5.Task_13.BookReaderImpl;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void testAddBook() {
        Task_13.BookReader reader = new BookReaderImpl( );
        assertTrue( reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
        assertFalse( reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
    }

    @Test
    public void testRemoveBook() {
        Task_13.BookReader reader = new BookReaderImpl( );
        assertTrue( reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
        assertTrue( reader.removeBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
        assertFalse( reader.removeBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
    }

    @Test
    public void testListBooks() {
        Task_13.BookReader reader = new BookReaderImpl( );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" );
        reader.addBook( "Robert Martin", "The ideal programmer" );
        String[] books = reader.listBooks( );
        assertEquals( 3, books.length );
        assertEquals( "J.K. Rowling [Harry Potter and the Philosopher's Stone]", books[0] );
        assertEquals( "J.K. Rowling [Harry Potter and the Chamber of Secrets]", books[1] );
        assertEquals( "Robert Martin [The ideal programmer]", books[2] );
    }

    @Test
    public void testSearchByAuthor() {
        Task_13.BookReader reader = new BookReaderImpl( );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" );
        reader.addBook( "Robert Martin", "The ideal programmer" );
        String[] books = reader.searchByAuthor( "J.K. Rowling" );
        assertEquals( 2, books.length );
        assertEquals( "J.K. Rowling [Harry Potter and the Philosopher's Stone]", books[0] );
        assertEquals( "J.K. Rowling [Harry Potter and the Chamber of Secrets]", books[1] );
    }

    @Test
    public void testSearchByTitle() {
        Task_13.BookReader reader = new BookReaderImpl( );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" );
        reader.addBook( "Robert Martin", " The ideal programmer" );
        String[] books = reader.searchByTitle( "Harry Potter and the Philosopher's Stone" );
        assertEquals( 1, books.length );
        assertEquals( "J.K. Rowling [Harry Potter and the Philosopher's Stone]", books[0] );
    }

    @Test
    public void testMarkAsRead() {
        Task_13.BookReader reader = new BookReaderImpl( );
        assertTrue( reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
        assertTrue( reader.markAsRead( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" ) );
        assertFalse( reader.markAsRead( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" ) );
        assertFalse( reader.markAsRead( "Robert Martin", "The ideal programmer" ) );
    }

    @Test
    public void testListReadBooks() {
        Task_13.BookReader reader = new BookReaderImpl( );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" );
        reader.addBook( "Robert Martin", "The ideal programmer" );
        reader.markAsRead( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.markAsRead( "Robert Martin", "The ideal programmer" );
        String[] books = reader.listReadBooks( );
        assertEquals( 2, books.length );
        assertEquals( "J.K. Rowling [Harry Potter and the Philosopher's Stone]", books[0] );
        assertEquals( "Robert Martin [The ideal programmer]", books[1] );
    }

    @Test
    public void testListUnreadBooks() {
        Task_13.BookReader reader = new BookReaderImpl( );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        reader.addBook( "J.K. Rowling", "Harry Potter and the Chamber of Secrets" );
        reader.addBook( "Robert Martin", "The ideal programmer" );
        reader.markAsRead( "J.K. Rowling", "Harry Potter and the Philosopher's Stone" );
        String[] books = reader.listUnreadBooks( );
        assertEquals( 2, books.length );
        assertEquals( "J.K. Rowling [Harry Potter and the Chamber of Secrets]", books[0] );
        assertEquals( "Robert Martin [The ideal programmer]", books[1] );
    }


}
