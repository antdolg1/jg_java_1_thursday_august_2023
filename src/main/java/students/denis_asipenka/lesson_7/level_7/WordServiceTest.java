package students.denis_asipenka.lesson_7.level_7;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.greatestNumberOfOccurrences();
        test.sameNumberOfOccurrences();
    }

    void greatestNumberOfOccurrences() {
        String str = "bot bot class good goog bot class";
        String result = "bot";
        WordService wordService = new WordService();
        checkTestResult(wordService.findMostFrequentWord(str).equals(result), "Greatest number of occurrences");
    }

    void sameNumberOfOccurrences() { // если по аналогии с заданием, что мы делали, то если слов встречаются одинаковое количество раз должно выводить первое что встречается
        String str = "class bot class class bot bot class bot";
        String result = "class";
        WordService wordService = new WordService();
        checkTestResult(wordService.findMostFrequentWord(str).equals(result), "Test for equal number of occurrences");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}