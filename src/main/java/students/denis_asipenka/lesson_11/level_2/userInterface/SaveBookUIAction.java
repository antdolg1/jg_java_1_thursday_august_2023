package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.Book;
import students.denis_asipenka.lesson_11.level_2.BookDatabase;
import students.denis_asipenka.lesson_11.level_2.BookDatabaseImpl;
import students.denis_asipenka.lesson_11.level_2.userInterface.UIAction;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        bookDatabase.save(new Book("Tina Turner", "One Flew Over the Cuckoo's Nest"));
        bookDatabase.save(new Book("Rowling", "Harry Potter and the Sorcerer's Stone"));
        bookDatabase.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabase.save(new Book("Erik Larson", "The Devil in the White City"));
        bookDatabase.save(new Book("Stuart Turton", "The 7 1/2 Deaths of Evelyn Hardcastle"));
        bookDatabase.save(new Book("Katherine Arden", "One Flew Over the Cuckoo's Nest"));
        bookDatabase.save(new Book("Rowling", "Harry Potter and the Chamber of Secrets"));
        bookDatabase.save(new Book("Heather Morris", "The Tattooist of Auschwitz"));
        bookDatabase.save(new Book("Gail Honeyman", "Eleanor Oliphant Is Completely Fine"));
        bookDatabase.save(new Book("Agatha Christie", "Murder on the Orient Express"));
        bookDatabase.save(new Book("Rowling one", "Harry Potter and the Prisoner of Azkaban"));
        bookDatabase.save(new Book("Becky Chambers", "The Long Way to a Small, Angry Planet"));
        bookDatabase.save(new Book("Mark Haddon", "The Curious Incident of the Dog in the Night-Time"));
        bookDatabase.save(new Book("Rowling", "Harry Potter and the Goblet of Fire"));
        bookDatabase.save(new Book("Ken Kesey", "One Flew Over the Cuckoo's Nest"));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите автора книги: ");
//        String author = scanner.nextLine();
//        System.out.println("Введите название книги: ");
//        String title = scanner.nextLine();
//        Book book = new Book(author,title);
//        bookDatabase.save(book);
    }
}
