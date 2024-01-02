package students.denis_asipenka.lesson_7.level_6;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    boolean isPalindrome(String text) {
        text = text.toLowerCase(Locale.ROOT);
        text = text.replaceAll(" ", "");
        char[] array = text.toCharArray();
        char[] result = new char[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[array.length - 1 - i] = array[i];
        }
        return Arrays.equals(array, result);
    }
}