package students.artjom_ossipov.lesson_7.level_1;
import java.util.Arrays;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.clearingSeparator();
        test.findingMoreOccurrences();
        test.testingTheEntireTask();
    }

    void clearingSeparator() {
        String str = "class, bot, class, class, bot, bot, class, bot";
        String[] result = new String[]{"class", "bot", "class", "class", "bot", "bot", "class", "bot"};
        WordService wordService = new WordService();
        checkTestResult(Arrays.equals(wordService.createAnArrayOfStrings(str), result), "Clearing delimiter");
    }

    void findingMoreOccurrences() {
        String[] array = new String[]{"class", "bot", "class", "class", "bot", "bot", "class", "bot"};
        String result = "class";
        WordService wordService = new WordService();
        checkTestResult(wordService.countingTheNumberOfOccurrences(array).equals(result),
                "The line is repeated a large number of times");
    }

    void testingTheEntireTask() {
        String str = "class, bot, class, class, bot, bot, class, bot";
        String result = "class";
        WordService wordService = new WordService();
        checkTestResult(wordService.countingTheNumberOfOccurrences(wordService.createAnArrayOfStrings(str)).equals(result), "Final testing of the task");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}