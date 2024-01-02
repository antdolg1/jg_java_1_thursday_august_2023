package students.julija_pilenkova.homework.lesson_4.level_7;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest(20);
    }

    void sumTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResults(result == 50, "Sum test is ");

    }


    void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResults(result == 20, "Sub test is ");
    }

    void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResults(result == 25, "MulTest is ");
    }

    void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResults(result == 5, "divTest is ");
    }

    void isEvenTest(int number) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        checkResults(result, "Even test is - ");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}
