package students.julija_pilenkova.homework.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiplTest();
        calculatorTest.divTest();
        calculatorTest.isEvenOrOddTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
    }

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("sum test FAIL");
        }
    }

    void subTest() {
        int firstNumber = 50;
        int secondNumber = 20;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test FAIL");
        }
    }

    void multiplTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.multipl(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multipl test = OK");
        } else {
            System.out.println("Multipl test FAIL");
        }
    }

    void divTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test FAIL");
        }
    }

    void isEvenOrOddTest() {
        int number = 8;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEvenOrOdd(number);
        if (realResult == expectedResult) {
            System.out.println("Even or odd test is OK");
        } else {
            System.out.println("Even or Odd test FAIL");
        }
    }

    void maxOfTwoNumbersTest() {
        int numberOne = 23453;
        int numberTwo = 2345344;
        int expectedResult = 2345344;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(numberOne, numberTwo);
        if (expectedResult == realResult) {
            System.out.println("Max of two numbers test is OK");
        } else {
            System.out.println("Max of two numbers test if FAIL");
        }
    }

    void maxOfThreeNumbersTest() {
        int num1 = 104;
        int num2 = 10;
        int num3 = -10;
        int expectResult = 104;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(num1, num2, num3);
        if (expectResult == realResult) {
            System.out.println("Max of three numbers test is OK");
        } else {
            System.out.println("Max of three numbers test - FAIL");
        }
    }
}