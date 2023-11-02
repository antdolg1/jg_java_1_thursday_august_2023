package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction{
    private BookDatabase bookDatabase;
    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.findUniqueTitles());
    }
}
