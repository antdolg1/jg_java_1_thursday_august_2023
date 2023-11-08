package students.nikolajs_antonovs.lesson_6.level_7;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
    }

    void fizzBuzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "FizzBuzz";
        String real = detector.detect(15);
        String result = (real == expected) ? "FizzBuzz test OK" : "FizzBuzz test FAILED";
        System.out.println(result);
    }

    void fizzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "Fizz";
        String real = detector.detect(9);
        String result = (real == expected) ? "Fizz test OK" : "Fizz test FAILED";
        System.out.println(result);
    }

    void buzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "Buzz";
        String real = detector.detect(10);
        String result = (real == expected) ? "Buzz test OK" : "Buzz test FAILED";
        System.out.println(result);
    }
}