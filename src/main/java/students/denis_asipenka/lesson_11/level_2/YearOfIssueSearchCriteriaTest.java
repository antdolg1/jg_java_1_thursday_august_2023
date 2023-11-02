package students.denis_asipenka.lesson_11.level_2;

public class YearOfIssueSearchCriteriaTest {
    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.yearOfIssueToSearch();
    }

    void yearOfIssueToSearch() {
        Book book = new Book("Marcel Proust", "In Search of Lost Time");
        book.setYearOfIssue("1993");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1993");
        checkResult(yearOfIssueSearchCriteria.match(book), "Тест на совпадение года: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
