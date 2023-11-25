package students.kristina_konovalchuk.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    public class IntegerListDemo {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>( );
            list.add( 1 );
            list.add( 2 );
            list.add( 3 );
            list.add( 0, 4 );
            int size = list.size( );
            System.out.println( "List size: " + size );
            list.remove( 2 );
            list.remove( Integer.valueOf( 1 ) );
            boolean isEmpty = list.isEmpty( );
            System.out.println( "Is the list empty?" + isEmpty );
            for (Integer element : list) {
                System.out.println( element );
            }
        }
    }
}
