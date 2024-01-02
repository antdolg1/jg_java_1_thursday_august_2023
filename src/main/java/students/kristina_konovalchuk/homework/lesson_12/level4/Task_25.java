package students.kristina_konovalchuk.homework.lesson_12.level4;

import java.util.ArrayList;
import java.util.List;

public class Task_25 {
    public class OutOfMemoryErrorDemo {
        public static void main(String[] args) {
            List<Object> list = new ArrayList<>( );
            while (true) {
                list.add( new Object( ) );
            }
        }
    }
}
