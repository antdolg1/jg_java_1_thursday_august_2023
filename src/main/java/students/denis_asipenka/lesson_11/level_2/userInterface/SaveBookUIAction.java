package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.Book;
import students.denis_asipenka.lesson_11.level_2.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        Book book = new Book(author, title);
        bookDatabase.save(book);
    }
}