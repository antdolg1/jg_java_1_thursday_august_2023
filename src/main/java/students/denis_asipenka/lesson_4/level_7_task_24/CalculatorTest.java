package students.denis_asipenka.lesson_4.level_7_task_24;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int correctAnswer = 75;
        Calculator calculator = new Calculator();
        outputResult(calculator.sum(firstNumber, secondNumber) == correctAnswer, "Sum");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int correctAnswer = 20;
        Calculator calculator = new Calculator();
        outputResult(calculator.sub(firstNumber, secondNumber) == correctAnswer, "Sub");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int correctAnswer = 25;
        Calculator calculator = new Calculator();
        outputResult(calculator.mul(firstNumber, secondNumber) == correctAnswer, "Mul");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int correctAnswer = 5;
        Calculator calculator = new Calculator();
        outputResult(calculator.div(firstNumber, secondNumber) == correctAnswer, "Div");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        int numberToCheck = 40;
        outputResult(calculator.isEven(numberToCheck), "isEven");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        int numberToCheck = 41;
        outputResult(calculator.isEven(numberToCheck) == false, "isEvent");
    }

    public void outputResult(boolean a, String result) {
        if (a) {
            System.out.println(result + " test = OK");
        } else {
            System.out.println(result + " test = FAIL");
        }
    }
}
