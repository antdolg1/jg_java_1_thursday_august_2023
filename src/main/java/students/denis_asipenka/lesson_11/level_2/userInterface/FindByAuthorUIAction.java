package students.denis_asipenka.lesson_11.level_2.userInterface;


import students.denis_asipenka.lesson_11.level_2.Book;
import students.denis_asipenka.lesson_11.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction() {
    }

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(author);
        System.out.println(bookList);
    }
}
