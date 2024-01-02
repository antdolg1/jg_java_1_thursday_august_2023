package students.denis_asipenka.lesson_4.level_4_task_11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subractionTest();
        calculatorTest.delTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTwoTest();
        calculatorTest.maxOfTwoNumbersThreeTest();
        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumbersTwoTest();
        calculatorTest.maxOfThreeNumbersThreeTest();
        calculatorTest.maxOfThreeNumbersFourTest();
        calculatorTest.maxOfThreeNumbersFiveTest();


    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void delTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.del(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Del test = OK");
        } else {
            System.out.println("Del test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subraction(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Subraction test = OK");
        } else {
            System.out.println("Subraction test = FAIL");
        }
    }

    public void subractionTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void isEvenTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == true) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbersTwoTest() {
        int firstNumber = 5;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfTwoNumbersTwo test = OK");
        } else {
            System.out.println("MaxOfTwoNumbersTwo test = FAIL");
        }
    }

    public void maxOfTwoNumbersThreeTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfTwoNumbersThree test = OK");
        } else {
            System.out.println("MaxOfTwoNumbersThree test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 2;   // подготавливаем тестовые данные
        int thirdNumber = 4; // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTwoTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 90;   // подготавливаем тестовые данные
        int thirdNumber = 4; // подготавливаем тестовые данные
        int expectedResult = 90;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfThreeNumbersTwo test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersTwo test = FAIL");
        }

    }

    public void maxOfThreeNumbersThreeTest() { // 3 test
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 90;   // подготавливаем тестовые данные
        int thirdNumber = 488; // подготавливаем тестовые данные
        int expectedResult = 488;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfThreeNumbersThree test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersThree test = FAIL");
        }
    }

    public void maxOfThreeNumbersFourTest() { // 4 test
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;   // подготавливаем тестовые данные
        int thirdNumber = 9; // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfThreeNumbersFour test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersFour test = FAIL");
        }
    }

    public void maxOfThreeNumbersFiveTest() { // 4 test
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 10;   // подготавливаем тестовые данные
        int thirdNumber = 10; // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("MaxOfThreeNumbersFive test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersFive test = FAIL");
        }
    }


}
