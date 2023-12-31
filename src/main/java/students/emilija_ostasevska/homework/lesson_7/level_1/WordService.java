package students.emilija_ostasevska.homework.lesson_7.level_1;

public class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = splitTextIntoWords(text);
        String[] uniqueWords = getUniqueWords(words);
        int[] wordFrequencies = countWordFrequencies(words, uniqueWords);
        return findMostFrequentWord(uniqueWords, wordFrequencies);
    }

    private String[] splitTextIntoWords(String text) {
        // Разбиваем текст на слова
        int wordCount = 0;
        String[] words = new String[text.length()];
        StringBuilder currentWord = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                currentWord.append(ch);
            } else if (currentWord.length() > 0) {
                words[wordCount++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }

        if (currentWord.length() > 0) {
            words[wordCount++] = currentWord.toString();
        }

        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    private String[] getUniqueWords(String[] words) {
        int uniqueCount = 0;
        String[] uniqueWords = new String[words.length];

        for (String word : words) {
            if (!contains(uniqueWords, uniqueCount, word)) {
                uniqueWords[uniqueCount++] = word;
            }
        }
        String[] result = new String[uniqueCount];
        System.arraycopy(uniqueWords, 0, result, 0, uniqueCount);
        return result;
    }

    private int[] countWordFrequencies(String[] words, String[] uniqueWords) {
        int[] wordFrequencies = new int[uniqueWords.length];

        for (int i = 0; i < uniqueWords.length; i++) {
            for (String word : words) {
                if (uniqueWords[i].equals(word)) {
                    wordFrequencies[i]++;
                }
            }
        }

        return wordFrequencies;
    }

    private String findMostFrequentWord(String[] uniqueWords, int[] wordFrequencies) {
        String mostFrequentWord = uniqueWords[0];
        int maxFrequency = wordFrequencies[0];

        for (int i = 1; i < uniqueWords.length; i++) {
            if (wordFrequencies[i] > maxFrequency) {
                mostFrequentWord = uniqueWords[i];
                maxFrequency = wordFrequencies[i];
            }
        }

        return mostFrequentWord;
    }

    private boolean contains(String[] array, int count, String word) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}