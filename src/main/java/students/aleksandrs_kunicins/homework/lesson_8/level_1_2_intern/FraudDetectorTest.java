package students.aleksandrs_kunicins.homework.lesson_8.level_1_2_intern;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldReturnTrue();
        test.shouldReturnFalse();
    }

    public void shouldReturnFalse() {
        FraudDetector detector = new FraudDetector();
        String name = "Pokemon";
        boolean expected = false;
        boolean result = detector.isFraud(name);
        if (expected == result) {
            System.out.println("False test = OK!");
        } else {
            System.out.println("False test = FAIL!");
        }

    }

    public void shouldReturnTrue() {
        FraudDetector detector = new FraudDetector();
        String name = "Antons";
        boolean expected = true;
        boolean result = detector.isFraud(name);
        if (expected == result) {
            System.out.println("False test = OK!");
        } else {
            System.out.println("False test = FAIL!");
        }

    }
}
