package students.kristina_konovalchuk.homework.lesson_15;

import junit.framework.TestCase;
import org.junit.Test;
import students.kristina_konovalchuk.homework.lesson_15.level_2.Task_9;
import students.kristina_konovalchuk.homework.lesson_15.level_2.Task_9Trader;

public class FraudDetectorTest extends TestCase {
    @Test
    void testCompareTreaderName() {
        Task_9Trader.Trader trader1 = new Task_9Trader.Trader( "Pokemon", "New York" );
        Task_9Trader.Trader trader2 = new Task_9Trader.Trader( "Delphia Ketchum", "Pallet Town" );
        Task_9.FraudDetector detector = new Task_9.FraudDetector( );
        assertTrue( detector.compareTradeName( trader1 ) );
        assertFalse( detector.compareTradeName( trader2 ) );
    }

    @Test
    void testCompareCity() {
        Task_9Trader.Trader trader1 = new Task_9Trader.Trader( "Misty", "Sidney" );
        Task_9Trader.Trader trader2 = new Task_9Trader.Trader( "Ash", "Pallet Town" );
        Task_9.FraudDetector detector = new Task_9.FraudDetector( );
        assertTrue( detector.compareCity( trader1 ) );
        assertFalse( detector.compareCity( trader2 ) );
    }

    @Test
    void testIsFraud() {
        Task_9Trader.Trader suspiciousTrader = new Task_9Trader.Trader( "Pokemon", "Sidney" );
        Task_9Trader.Trader trueTrader = new Task_9Trader.Trader( "Ash", "Pallet Town" );
        Task_9.FraudDetector detector = new Task_9.FraudDetector( );
        assertTrue( detector.isFraud( suspiciousTrader ) );
        assertFalse( detector.isFraud( trueTrader ) );
    }

}