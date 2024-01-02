package students.denis_asipenka.lesson_15.level_1;

public class WordsService {
    public int countRepetitions(String[] words, String searchWord) {
        int count = 0;
        for (String word : words) {
            if (word.equals(searchWord)) {
                count++;
            }
        }
        return count;
    }
}