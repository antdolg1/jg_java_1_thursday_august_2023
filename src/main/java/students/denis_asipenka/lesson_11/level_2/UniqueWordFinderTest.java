package students.denis_asipenka.lesson_11.level_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest();
    }

    void uniqueWordFinderTest() {
        String check = "aaa bbbb bbbb fff fff 43434 343434 434343 4334343 gggg aaa aaaa";
        Set<String> result = new LinkedHashSet<>();
        result.add("aaa");
        result.add("bbbb");
        result.add("fff");
        result.add("43434");
        result.add("343434");
        result.add("434343");
        result.add("4334343");
        result.add("gggg");
        result.add("aaaa");
        Set<String> resultNotPositive = new LinkedHashSet<>();
        resultNotPositive.add("aaa");
        resultNotPositive.add("bbbb");
        resultNotPositive.add("fff");
        resultNotPositive.add("43434");
        resultNotPositive.add("343434");
        resultNotPositive.add("434343");
        resultNotPositive.add("43343443");
        resultNotPositive.add("gggg");
        resultNotPositive.add("aaaa");
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        checkResult(uniqueWordFinder.find(check).equals(result), "Тест на поиск всех вхождений в строку: ");
        checkResult(uniqueWordFinder.find(check).equals(resultNotPositive), "Тест на поиск всех вхождений в строку (FAIL): ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
