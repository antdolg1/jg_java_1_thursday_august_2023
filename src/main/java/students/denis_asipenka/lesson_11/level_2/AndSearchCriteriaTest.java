package students.denis_asipenka.lesson_11.level_2;

public class AndSearchCriteriaTest {
    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.andSearchCriteriaTest();
    }
    void andSearchCriteriaTest() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Marcel Proust1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("In Search of Lost Time");

        Book book1 = new Book("Marcel Proust1", "In Search of Lost Time");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        System.out.println(andSearchCriteria.match(book1));
        checkResult(andSearchCriteria.match(book1), "Тест на совпадение названия и имени: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
