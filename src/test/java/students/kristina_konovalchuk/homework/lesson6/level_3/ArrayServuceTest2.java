package students.kristina_konovalchuk.homework.lesson6.level_3;

import junit.framework.TestCase;
import org.junit.Test;

public class ArrayServuceTest2 extends TestCase {
    @Test
    void testCountOccurrencesPositive(){
       Task_13.ArrayService arrayService = new Task_13.ArrayService();
        int[] arr = {1, 2, 3, 3};
        int numberToSearch = 3;
        int expectedCount = 2;
        int actualCount = arrayService.countOccurrences(arr, numberToSearch);
        assertEquals(expectedCount, actualCount);
    }
    @Test
    void  testCountOccurrencesNegative(){
        Task_13.ArrayService arrayService = new Task_13.ArrayService();
        int [] arr = {1, 2, 3, 3};
        int numberToSearch = 4;
        int expextedCount = 0;
        int actualCount = arrayService.countOccurrences( arr, numberToSearch );
        assertEquals(expextedCount, actualCount);



    }

    }


