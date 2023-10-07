package students.denis_asipenka.lesson_7.level_1;

import java.util.ArrayList;
import java.util.Collections;

public class WordService {
    public String[] createAnArrayOfStrings(String str) {
        String delimiter = ", ";
        return str.split(delimiter);
    }

    public String countingTheNumberOfOccurrences(String[] array) {
        ArrayList<String> listWords = new ArrayList<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!listWords.contains(array[i])) {
                listWords.add(array[i]);
            }
        }
        for (int i = 0; i < listWords.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (listWords.get(i).equals(array[j])) {
                    count += 1;
                }
            }
            listCount.add(count);
            count = 0;
        }
        return listWords.get(listCount.indexOf(Collections.max(listCount)));
    }
}