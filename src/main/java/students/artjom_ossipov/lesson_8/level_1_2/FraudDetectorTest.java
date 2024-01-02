package students.artjom_ossipov.lesson_8.level_1_2;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldReturnTrue();
        test.shouldReturnFalse();
    }

    public void shouldReturnTrue() {
        FraudDetector detector= new FraudDetector();
        String name = "Artjom";
        boolean expected = true;
        boolean result = detector.isFraud(name);
        if (expected == result) {
            System.out.println("True test = OK!");
        } else {
            System.out.println("True test = FAIL!");
        }

    }

    public void shouldReturnFalse() {
        FraudDetector detector= new FraudDetector();
        String name = "Pokemon";
        boolean expected = false;
        boolean result = detector.isFraud(name);
        if (expected == result) {
            System.out.println("False test = OK!");
        } else {
            System.out.println("False test = FAIL!");
        }
    }
}
