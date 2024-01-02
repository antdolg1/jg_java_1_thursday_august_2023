package students.kristina_konovalchuk.homework.lesson_15;

import junit.framework.TestCase;
import org.junit.Test;
import students.kristina_konovalchuk.homework.lesson_15.level_2.Task_9Trader;

public class TraderTest extends TestCase {
    @Test
    void testGetFullName() {
        Task_9Trader.Trader trader = new Task_9Trader.Trader( "Ash", "Pallet Town" );
        assertEquals( "Ash", trader.getFullName( ) );
    }

    @Test
    void testGetCity() {
        Task_9Trader.Trader trader = new Task_9Trader.Trader( "Misty", "Cerulean City" );
        assertEquals( "Cerulean City", trader.getCity( ) );
    }

}