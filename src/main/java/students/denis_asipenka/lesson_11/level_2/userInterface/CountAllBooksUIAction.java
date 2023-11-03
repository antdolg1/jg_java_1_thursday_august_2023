package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.BookDatabase;

public class CountAllBooksUIAction implements UIAction{
    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    private BookDatabase bookDatabase;
    public void execute() {
        System.out.println("Количество книг в базе данных: " + bookDatabase.countAllBooks());
    }
}