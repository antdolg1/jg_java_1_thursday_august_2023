package students.aleksandrs_kunicins.homework.lesson_4.level_4;

class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int fourthNumber = 15;
        int fifthNumber = 15;
        int sisthNumber = 15;
        int expectedFirst = thirdNumber;
        int expectedSecond = fourthNumber;
        if (expectedFirst == calc.maxOfThree(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
        if (expectedSecond == calc.maxOfThree(fourthNumber, fifthNumber, sisthNumber)) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }

    }
}
