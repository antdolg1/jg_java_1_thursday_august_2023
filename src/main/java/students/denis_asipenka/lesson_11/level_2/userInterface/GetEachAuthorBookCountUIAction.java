package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.BookDatabase;

public class GetEachAuthorBookCountUIAction implements UIAction{
    private BookDatabase bookDatabase;
    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }
}
