package students.kristina_konovalchuk.homework.lesson6.level_3;

import junit.framework.TestCase;
import org.junit.Test;

public class Task_15Test extends TestCase {
    @Test
    void testReplaceAllPositive() {
        Task_15.ArrayService arrayService = new Task_15.ArrayService( );
        int[] arr = {1, 2, 3, 3};
        int numberToReplace = 3;
        int newNumber = 4;
        int expectedNumber = 2;
        int actualCount = arrayService.replaceAll( arr, numberToReplace, newNumber );
        assertEquals( new int[]{1, 2, 4, 4}, arr );
        assertEquals( expectedNumber, actualCount );
    }

     void testReplaceAllNegative {

        Task_15.ArrayService arrayService = new Task_15.ArrayService( );
        int[] arr = {1, 2, 3, 3};
        int numberReplace = 4;
        int newNumber = 5;
        int expectedNumber = 0;
        int actualCount = arrayService.replaceAll( arr, numberReplace, newNumber );
        assertEquals( new int[]{1, 2, 3, 3}, arr );
        assertEquals( expectedNumber, actualCount );

    }


}