package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.Book;
import students.denis_asipenka.lesson_11.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByBookUIAction() {
    }

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.println("Введите автора книги: ");
        String title = scanner.nextLine();
        if (bookDatabase.delete(new Book(author, title))) {
            System.out.println("Книга удалена!");
        } else {
            System.out.println("Книга не найдена!");
        }
    }

}
