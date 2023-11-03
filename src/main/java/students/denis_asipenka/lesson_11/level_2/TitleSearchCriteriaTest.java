package students.denis_asipenka.lesson_11.level_2;

public class TitleSearchCriteriaTest {
    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.titleToSearch();
    }

    void titleToSearch() {
        Book book = new Book("Marcel Proust", "In Search of Lost Time");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("In Search of Lost Time");
        checkResult(titleSearchCriteria.match(book), "Тест на совпадение названия: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}