package students.nikolajs_antonovs.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.lessOfTwoNumbers();
        calculatorTest.equalsOfTwoNumbers();
        calculatorTest.firstMaxOfThreeNumbers();
        calculatorTest.secondMaxOfThreeNumbers();
        calculatorTest.thirdMaxOfThreeNumbers();
        calculatorTest.firstAndSecondMaxOfThreeNumbers();
        calculatorTest.firstAndThirdMaxOfThreeNumbers();
        calculatorTest.secondAndThirdMaxOfThreeNumbers();
        calculatorTest.equalsMaxOfThreeNumbers();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEven() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First number bigger test = OK");
        } else {
            System.out.println("First number bigger test = FAIL");
        }
    }

    public void lessOfTwoNumbers() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number bigger test = OK");
        } else {
            System.out.println("Second number bigger test = FAIL");
        }
    }

    public void equalsOfTwoNumbers() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Equals numbers test = OK");
        } else {
            System.out.println("Equals numbers test = FAIL");
        }
    }

    public void firstMaxOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First number bigger test = OK");
        } else {
            System.out.println("First number bigger test = FAIL");
        }
    }

    public void secondMaxOfThreeNumbers() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number bigger test = OK");
        } else {
            System.out.println("Second number bigger test = FAIL");
        }
    }

    public void thirdMaxOfThreeNumbers() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third number bigger test = OK");
        } else {
            System.out.println("Third number bigger test = FAIL");
        }
    }

    public void firstAndSecondMaxOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and second numbers bigger test = OK");
        } else {
            System.out.println("First and second numbers bigger test = FAIL");
        }
    }

    public void firstAndThirdMaxOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and third numbers bigger test = OK");
        } else {
            System.out.println("First and third numbers bigger test = FAIL");
        }
    }

    public void secondAndThirdMaxOfThreeNumbers() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second and third numbers bigger test = OK");
        } else {
            System.out.println("Second and third numbers bigger test = FAIL");
        }
    }
    public void equalsMaxOfThreeNumbers() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("All numbers are equals test = OK");
        } else {
            System.out.println("All numbers are equals test = FAIL");
        }
    }

}
