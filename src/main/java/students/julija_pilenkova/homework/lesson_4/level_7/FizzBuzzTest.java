package students.julija_pilenkova.homework.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest(33);
        fizzBuzzTest.fizzBuzzTest(15);
        fizzBuzzTest.notFizzBuzzTest();
    }

    void fizzTest(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(3).equals("Fizz"), "Fizz test");
    }

    void buzzTest(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(5).equals("Buzz"), "Buzz test");

    }

    void fizzBuzzTest(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(15).equals("FizzBuzz"), "Fizz buzz test");

    }

    void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(7).equals("7"), "not fizz buzz test is ok");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


}
