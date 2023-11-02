package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.BookDatabase;

public class GetAuthorToBooksMapUIAction implements UIAction{
    private BookDatabase bookDatabase;
    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.getAuthorToBooksMap());
    }

}
