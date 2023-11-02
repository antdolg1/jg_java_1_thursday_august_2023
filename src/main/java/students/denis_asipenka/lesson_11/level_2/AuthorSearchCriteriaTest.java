package students.denis_asipenka.lesson_11.level_2;

public class AuthorSearchCriteriaTest {
    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.searchAuthor();
    }

    void searchAuthor() {
        Book book = new Book("Marcel Proust", "In Search of Lost Time");
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria(book.getAuthor());
        checkResult(authorSearchCriteria.match(book), "Тест на совпадение автора: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
