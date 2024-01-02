package students.denis_asipenka.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraudDetectorTest {

    @Test
    public void expectDetectedByName() {
        FraudDetector fraudDetector = new FraudDetector();
        boolean actualResult = fraudDetector.isFraud(new Trader("Pokemon","Riga"));
        assertTrue(actualResult);
    }
    @Test
    public void expectDetectedByCity() {
        FraudDetector fraudDetector = new FraudDetector();
        boolean actualResult = fraudDetector.isFraud(new Trader("Ivan","Sidney"));
        assertTrue(actualResult);
    }
    @Test
    public void expectNotDetected() {
        FraudDetector fraudDetector = new FraudDetector();
        boolean actualResult = fraudDetector.isFraud(new Trader("Nikol","Vilnius"));
        assertFalse(actualResult);
    }
}