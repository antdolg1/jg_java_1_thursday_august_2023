package students.julija_pilenkova.homework.lesson_7;

public class WordService {
    public String findMostFrequentWord (String[] string) {
        String[] randomWords = "abc abcde abcdef abc words abc abc g".split(" ");
        int[] array = new int[]{-1, 0};
        for (int i = 0; i < randomWords.length; i++) {
            if (!randomWords[array[1]].equals(randomWords[i]) || array[0] < 0) {
                int c = 1;
                for (int p = i + 1; p < randomWords.length; p++) {
                    if (randomWords[i].equals(randomWords[p])) {
                        c++;
                    }
                }
            }
        }
        return randomWords[array[1]];
    }
}