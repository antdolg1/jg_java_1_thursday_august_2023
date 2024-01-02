package students.denis_asipenka.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.checkingExponentiation();
    }

    void checkingExponentiation() {
        int number = 4;
        int degree = 3;
        int result = 64;
        PowerCalculator powerCalculator = new PowerCalculator();
        checkTestResult(powerCalculator.exponentiation(number, degree) == result, "Exponentiation test");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}