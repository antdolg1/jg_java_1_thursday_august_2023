package students.aleksandrs_kunicins.homework.lesson_4.level_4;

class CalculatorTest1 {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        int expectedSumResult = firstNumber + secondNumber;
        int expectedDiffResult = firstNumber - secondNumber;
        int expectedMultResult = firstNumber * secondNumber;
        int expectedDivResult = firstNumber / secondNumber;

        Calculator calculator = new Calculator();
        int realSumResult = calculator.sum(firstNumber, secondNumber);
        int realDiffResult = calculator.diff(firstNumber, secondNumber);
        int realMultResult = calculator.mult(firstNumber, secondNumber);
        int realDivResult = calculator.div(firstNumber, secondNumber);

        if (expectedSumResult == realSumResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Failed");
        }

        if (expectedDiffResult == realDiffResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Failed");
        }

        if (expectedMultResult == realMultResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Failed");
        }

        if (expectedDivResult == realDivResult) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Failed");
        }
    }

}
