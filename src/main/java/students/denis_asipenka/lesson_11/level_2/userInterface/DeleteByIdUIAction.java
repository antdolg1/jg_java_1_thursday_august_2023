package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.Book;
import students.denis_asipenka.lesson_11.level_2.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction() {
    }

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID книги: ");
        long idBook = scanner.nextInt();
        bookDatabase.delete(idBook);
        System.out.println("Книга под ID "+idBook+ " удалена!");
    }

}
