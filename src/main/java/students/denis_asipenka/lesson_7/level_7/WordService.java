package students.denis_asipenka.lesson_7.level_7;

public class WordService {
    public String findMostFrequentWord(String text) {
        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];

        int wordCounter = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (String s : textArray) {
                if (textArray[i].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
            wordCounter = 0;
        }

        int max = 0;
        for (int i = 0; i < wordCountArray.length; i++) {
            if (wordCountArray[i] > max) {
                max = i;
            }
        }
        return textArray[max];
    }
}