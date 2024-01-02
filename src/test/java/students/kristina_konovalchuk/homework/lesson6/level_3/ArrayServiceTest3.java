package students.kristina_konovalchuk.homework.lesson6.level_3;

import junit.framework.TestCase;
import org.junit.Test;

public class ArrayServiceTest3 extends TestCase{
        @Test
    void testReplaceFirstPositive(){
        Task_14.ArrayService arrayService = new Task_14.ArrayService();
        int[] arr = {1, 2, 3, 3};
        int numberToReplace = 3;
        int newNumber = 4;
        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        assertTrue(result);
       assertEquals(new int[] {1, 2, 3, 4}, arr);
    }
    @Test

    void testReplaceFirstNegative(){
        Task_14.ArrayService arrayService = new Task_14.ArrayService();
        int[] arr = {1, 2, 3, 3};
        int numberToReplace = 4;
        int newNumber = 6;
        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        assertFalse(result);
        assertEquals( new int[] {1, 2, 3, 3}, arr );
    }

}