package students.anastassia_iljina.lesson_4.homework.level_7;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.sumTest();
        test.subTest();
        test.mulTest();
        test.divTest();
        test.isEvenTest();
        test.isEvenTestTwo();
    }

    public void testResult(String testName, int actual, int expected) {
        if (actual == expected) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void testResultForBoolean(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void sumTest() {
        int firstNumber = 30;
        int secondNumber = 45;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        testResult("Sum test", result, 75);
    }

    public void subTest() {
        int firstNumber = 45;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        testResult("Sub test", result, 30);
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        testResult("Mul test", result, 30);
    }

    public void divTest() {
        int firstNumber = 45;
        int secondNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        testResult("Div test", result, 5);
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(4);
        testResultForBoolean("isEven test", result, true);
    }

    public void isEvenTestTwo() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(7);
        testResultForBoolean("isEven test", !result, true);
    }
}
