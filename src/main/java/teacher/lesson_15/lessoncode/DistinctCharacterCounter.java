package teacher.lesson_15.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacterCounter {

    public static int countDistinctCharacters(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        str = str.toLowerCase();
        Set<Character> distinctCharacters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                distinctCharacters.add(ch);
            }
        }
        return distinctCharacters.size();
    }

    public static void main(String[] args) {
        String inputString = "Hello World!";
        System.out.println("Distinct chars count: " + countDistinctCharacters(inputString));
    }

}


//old version
//public static int countDistinctCharacters(String str) {
//    if (str == null || str.isBlank()) {
//        return 0;
//    }
//
//    str = str.toLowerCase();
//    int distinctCount = 0;
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (Character.isLetter(ch)) {
//            boolean isDistinct = true;
//            for (int j = 0; j < i; j++) {
//                if (str.charAt(j) == ch) {
//                    isDistinct = false;
//                    break;
//                }
//            }
//            if (isDistinct) {
//                distinctCount++;
//            }
//        }
//    }
//    return distinctCount;
//}
