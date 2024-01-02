package teacher.lesson_15.lessoncode;

import java.util.Arrays;
import java.util.List;

public class SubstitudeAlgorithm {

//    Old algorithm
    String findPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if ("John".equals(people[i])) {
                return "John";
            } else if ("Jim".equals(people[i])) {
                return "Jim";
            } else if ("Sarah".equals(people[i])) {
                return "Sarah";
            }
        }
        return "";
    }

//    Refactored algorithm
    String findPersonRefactored(String[] people) {
        List<String> names = Arrays.asList("John", "Jim", "Sarah");
        for (int i = 0; i < people.length; i++) {
            if (names.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }
}
