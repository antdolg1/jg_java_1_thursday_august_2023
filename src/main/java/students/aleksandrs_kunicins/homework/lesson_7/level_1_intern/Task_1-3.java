package students.aleksandrs_kunicins.homework.lesson_7.level_1_intern;

import java.util.HashMap;
import java.util.Map;

class WordService_ {

    public String findMostFrequentWord(String text) {

        String[] words = text.split("\\s+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            String normalizedWord = word.toLowerCase();

            wordFrequencyMap.put(normalizedWord, wordFrequencyMap.getOrDefault(normalizedWord, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency || (entry.getValue() == maxFrequency
                    && text.indexOf(entry.getKey()) < text.indexOf(mostFrequentWord))) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }

        }

        return mostFrequentWord;
    }

}

// class WordService_Test {
// public static void main(String[] args) {
// WordService ws = new WordService();
// String text = "Two plus two is four";
// String mostFrequentWord = ws.findMostFrequentWord(text);
// System.out.println(mostFrequentWord);

// }
// }
class WordServiceTest_ {
    public static void main(String[] args) {
        WordServiceTest_ test = new WordServiceTest_();
        test.shouldReturnThis();
        test.shouldReturnTwo();
    }

    public void shouldReturnThis() {
        WordService_ ws = new WordService_();
        String text = "This is a text, which will return word this";
        String mostFrequent = ws.findMostFrequentWord(text);
        String expect = "this";
        String result = (expect.equals(mostFrequent) ? "This test : OK!" : "This test :FAIL!");
        System.out.println(result);
    }

    public void shouldReturnTwo() {
        WordService_ ws = new WordService_();
        String text = "Two plus two is four";
        String mostFrequent = ws.findMostFrequentWord(text);
        String expect = "two";
        String result = (expect.equals(mostFrequent) ? "Two test : OK!" : "Two test : FAIL!");
        System.out.println(result);
    }
}