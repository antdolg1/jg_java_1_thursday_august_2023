package students.denis_asipenka.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.buzzTest();
        test.fizzTest();
        test.fizzBuzzTestNegative();

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    void fizzBuzzTest() {
        int number = 30;
        String result = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkTestResult(fizzBuzz.detect(number).equals(result), "Test dividing a number by 3 and 5: ");
    }

    void buzzTest() {
        int number = 25;
        String result = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkTestResult(fizzBuzz.detect(number).equals(result), "Test dividing a number by 5: ");
    }

    void fizzTest() {
        int number = 9;
        String result = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkTestResult(fizzBuzz.detect(number).equals(result), "Test dividing a number by 3: ");
    }

    void fizzBuzzTestNegative() {
        int number = 1;
        String result = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkTestResult(fizzBuzz.detect(number).equals(result), "The number is not divisible by 3 and 5: ");
    }
}