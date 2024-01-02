package students.denis_asipenka.lesson_6.level_1;

public class TestNumberUtils {
    public static void main(String[] args) {
        TestNumberUtils testNumberUtil = new TestNumberUtils();
        testNumberUtil.numbers();
    }

    public void numbers() {
        int numbersOne = 46;
        boolean result = true;

        NumberUtils numberUtils = new NumberUtils();
        if (numberUtils.isEven(numbersOne) == result) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test in FAILED");
        }
    }
}