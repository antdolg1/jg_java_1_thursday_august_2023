package students.emilija_ostasevska.homework.lesson_7.level_1;

public class WordServiceTest {

    public static void main(String[] args) {
        testFindMostFrequentWord_Positive();
        testFindMostFrequentWord_Negative();
    }

    public static void testFindMostFrequentWord_Positive() {
        WordService wordService = new WordService();
        String text = "apple apple apple banana banana orange";
        String result = wordService.findMostFrequentWord(text);
        String expected = "apple";

        // должно быть ОК
        if (expected.equals(result)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void testFindMostFrequentWord_Negative() {
        WordService wordService = new WordService();
        String text = "javajava java python java python";
        String result = wordService.findMostFrequentWord(text);
        String expected = "java";

        // должно быть ОК
        if (expected.equals(result)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}