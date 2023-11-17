package students.denis_asipenka.lesson_13.level_5;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    int add(String numbers) {
        int lengthNumbers = numbers.length();
        char delimiter = ',';
        char delimiterTwo = '\n';
        int indexFrom = 0;
        int indexTo = 0;
        int sumNumbers = 0;
        List<Character> delimiterFromMethod = checkingIfThereIsADelimiter(numbers);
        if (delimiterFromMethod.get(0) == ',') {
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == delimiter || numbers.charAt(i) == delimiterTwo) {
                    indexTo = i;
                    if (!numbers.substring(indexFrom, indexTo).isEmpty()) {
                        sumNumbers += Integer.parseInt(numbers.substring(indexFrom, indexTo));
                        indexFrom = i + 1;
                    } else {
                        sumNumbers += 0;
                        indexFrom = i + 1;
                    }
                }
                if (i == numbers.length() - 1) {
                    if (!numbers.substring(indexFrom, lengthNumbers).isEmpty()) {
                        sumNumbers += Integer.parseInt(numbers.substring(indexFrom, lengthNumbers));
                        return sumNumbers;
                    } else if (indexFrom == lengthNumbers) {
                        sumNumbers += 0;
                        return sumNumbers;
                    }
                }
            }
        } else {
            int index = searchIndex(numbers);
            indexFrom = index;
            for (int i = index; i < numbers.length(); i++) {
                if (delimiterFromMethod.contains(numbers.charAt(i))) {
                    indexTo = i;
                    if (!numbers.substring(indexFrom, indexTo).isEmpty()) {
                        sumNumbers += Integer.parseInt(numbers.substring(indexFrom, indexTo));
                        indexFrom = i + 1;
                    } else {
                        sumNumbers += 0;
                        indexFrom = i + 1;
                    }
                }
                if (i == numbers.length() - 1) {
                    if (!numbers.substring(indexFrom, lengthNumbers).isEmpty()) {
                        sumNumbers += Integer.parseInt(numbers.substring(indexFrom, lengthNumbers));
                        return sumNumbers;
                    } else if (indexFrom == lengthNumbers) {
                        sumNumbers += 0;
                        return sumNumbers;
                    }
                }
            }
        }
        return sumNumbers;
    }

    int searchIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\n') {
                return i + 1;
            }
        }
        return 0;
    }

    List<Character> checkingIfThereIsADelimiter(String str) {
        List<Character> listDelimiter = new ArrayList<>();
        if (str.charAt(0) == '/' && str.charAt(1) == '/') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '[') {
                    listDelimiter.add(str.charAt(i + 1));
                }
            }
        } else {
            listDelimiter.add(',');
            return listDelimiter;

        }
        return listDelimiter;
    }

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.add("53455435,1"));
    }
}