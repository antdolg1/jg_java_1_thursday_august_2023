package students.denis_asipenka.lesson_11.level_2.userInterface;

import students.denis_asipenka.lesson_11.level_2.*;

import java.util.List;
import java.util.Scanner;

public class FindUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria(scanner.nextLine());
        System.out.println("Введите название книги: ");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria(scanner.nextLine());
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        //List<Book> result =
        System.out.println(bookDatabase.find(searchCriteria));
    }
}