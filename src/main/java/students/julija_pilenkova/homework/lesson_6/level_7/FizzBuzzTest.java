package students.julija_pilenkova.homework.lesson_6.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest(30);
        test.buzzTest(500);
        test.fizzTest(33);
        test.wrongNumber(22);
    }

    void wrongNumber(int number) {
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(number);
        checkResults(result.equals("" + number), "Wrong number test is - ");
    }

    void fizzTest(int number) {
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(number);
        checkResults(result.equals("Fizz"), "FizzBuzz test - ");
    }

    void buzzTest(int number) {
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(number);
        checkResults(result.equals("Buzz"), "FizzBuzz test - ");
    }

    void fizzBuzzTest(int number) {
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(number);
        checkResults(result.equals("FizzBuzz"), "FizzBuzz test - ");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else System.out.println(testName + "FAIL");
    }
}