package students.kristina_konovalchuk.homework.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

public class Task_27 {
    public class UniqueWordFinder {
        public Set<String> find(String text) {
            Set<String> uniqueWords = new HashSet<>( );
            String[] words = text.split( "\\W+" );
            for (String word : words) {
                uniqueWords.add( word );
            }
            return uniqueWords;
        }
    }
}

