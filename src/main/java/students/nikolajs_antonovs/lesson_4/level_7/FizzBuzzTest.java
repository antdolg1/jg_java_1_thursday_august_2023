package students.nikolajs_antonovs.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.buzzTest();
        test.fizzTest();
        test.notFizzBuzzTest();
    }

    void fizzBuzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "FizzBuzz";
        String real = detector.detect(15);
        String result = (real == expected) ? "FizzBuzz test OK" : "FizzBuzz test FAILED";
        System.out.println(result);
    }

    void buzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "Buzz";
        String real = detector.detect(10);
        String result = (real == expected) ? "Buzz test OK" : "Buzz test FAILED";
        System.out.println(result);
    }

    void fizzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "Fizz";
        String real = detector.detect(9);
        String result = (real == expected) ? "Fizz test OK" : "Fizz test FAILED";
        System.out.println(result);
    }
    void notFizzBuzzTest() {
        FizzBuzz detector = new FizzBuzz();
        String expected = "Error";
        String real = detector.detect(2);
        String result = (real.equals(expected) )? "Error test OK" : "Error test FAILED";
        System.out.println(result);
    }


}
