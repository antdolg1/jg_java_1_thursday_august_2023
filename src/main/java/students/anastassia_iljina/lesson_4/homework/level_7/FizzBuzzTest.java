package students.anastassia_iljina.lesson_4.homework.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTesting();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.noFizzBuzzTest();

    }

    public void fizzBuzzTesting () {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test FizzBuzz");
        } else {
            System.out.println("FAIL");
        }
    }

    public void fizzTest () {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(9);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test Fizz");
        } else {
            System.out.println("FAIL");
        }
    }

    public void buzzTest() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(40);
        if (expectedResult.equals(realResult)) {
            System.out.println("Test Buzz");
        } else {
            System.out.println("FAIL");
        }
    }

    public void noFizzBuzzTest() {
        String expectedResult = "";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(4);
        if (expectedResult.equals(realResult)) {
            System.out.println("??");
        } else {
            System.out.println("FAIL");
        }
    }
}
