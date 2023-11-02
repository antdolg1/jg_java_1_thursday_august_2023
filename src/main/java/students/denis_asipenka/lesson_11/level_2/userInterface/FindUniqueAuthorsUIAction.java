package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.*;

import java.util.Scanner;

public class FindUniqueAuthorsUIAction implements UIAction {
    private BookDatabase bookDatabase;
    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.findUniqueAuthors());
    }
}
