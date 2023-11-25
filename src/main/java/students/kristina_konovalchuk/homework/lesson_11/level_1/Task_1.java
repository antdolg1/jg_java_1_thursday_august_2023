package students.kristina_konovalchuk.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Task_1 {
    public class ListDemo {
        public static void main(String[] args) {
            List<String> arrayList = new ArrayList<>( );
            List<String> linkedList = new LinkedList<>( );
            List<String> vector = new Vector<>( );
            arrayList.add( "element 1" );
            arrayList.add( "element 2" );
            arrayList.add( "element 3" );

            linkedList.add( "element 1" );
            linkedList.add( "element 2" );
            linkedList.add( "element 3" );

            vector.add( "element 1" );
            vector.add( "element 2" );
            vector.add( "element 3" );

            System.out.println( "ArrayList:" + arrayList );
            System.out.println( "LinkedList:" + linkedList );
            System.out.println( "Vector: " + vector );
        }
    }
}
