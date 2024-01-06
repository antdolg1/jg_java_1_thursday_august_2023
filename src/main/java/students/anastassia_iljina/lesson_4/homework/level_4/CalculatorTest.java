package students.anastassia_iljina.lesson_4.homework.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxFirstNumberTest();
        calculatorTest.maxSecondNumberTest();
        calculatorTest.maxThirdNumberTest();
        calculatorTest.firstTwoNumbersAreEqualsAndGreaterThanThirdTest();
        calculatorTest.threeNumbersAreEqualTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 4;
        int secondNumber = 5;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 28;
        int secondNumber = 4;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }

    }

    public void isEvenTest() {
        int number = 6;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 9;
        int secondNumber = 17;
        int expectedResult = 17;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxFirstNumberTest() {
        int firstNumber = 9;
        int secondNumber = 6;
        int thirdNumber = 4;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxSecondNumberTest() {
        int firstNumber = 100;
        int secondNumber = 897;
        int thirdNumber = 16;
        int expectedResult = 897;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void maxThirdNumberTest() {
        int firstNumber = 90;
        int secondNumber = 86;
        int thirdNumber = 450;
        int expectedResult = 450;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void firstTwoNumbersAreEqualsAndGreaterThanThirdTest() {
        int firstNumber = 30;
        int secondNumber = 30;
        int thirdNumber = 15;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void threeNumbersAreEqualTest() {
        int firstNumber = 25;
        int secondNumber = 25;
        int thirdNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

}
