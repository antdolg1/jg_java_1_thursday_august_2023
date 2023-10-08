package students.kristina_konovalchuk.homework.lesson6.level_3;

import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Array;

public class ArrauServiceTest extends TestCase {
    public void testContains(){
        Task_12.ArrayService arrayService = new Task_12.ArrayService();
        int [] arr = { 1, 2, 3, 3};
        int numberToSearch = 3;
        assertTrue( arrayService.contains( arr, numberToSearch ) );
        numberToSearch = 4;
        assertFalse( arrayService.contains( arr, numberToSearch ) );


    }

}