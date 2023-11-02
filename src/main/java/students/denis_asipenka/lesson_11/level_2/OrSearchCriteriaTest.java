package students.denis_asipenka.lesson_11.level_2;

public class OrSearchCriteriaTest {
    public static void main(String[] args) {
        OrSearchCriteriaTest test = new OrSearchCriteriaTest();
        test.orSearchCriteriaTest();
    }

    void orSearchCriteriaTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Marcel Proust1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("In Search of Lost Time");
        Book book1 = new Book("Marcel Proust1", "In Search of Lost Time");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        checkResult(orSearchCriteria.match(book1), "Тест на совпадение названия или имени: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
