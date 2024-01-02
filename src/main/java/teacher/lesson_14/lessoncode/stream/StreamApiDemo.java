package teacher.lesson_14.lessoncode.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("orange", "apple", "banana", "", "pear", "peach", "lemon", "");

        long emptyStringCount = fruits.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Empty string count: " + emptyStringCount);

        long stringWithMoreThanFourChars = fruits.stream()
                .filter(s -> s.length() > 4)
                .count();

        System.out.println("String with > 4 char count: " + stringWithMoreThanFourChars);

        long startsWithP = fruits.stream()
                .filter(s -> s.startsWith("p"))
                .count();

        System.out.println("Strings that starts with letter 'p' count: " + startsWithP);

        String fruitsListInUppercase = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(fruitsListInUppercase);

        List<String> fruitsWithRemovedEmptyStrings = fruits.stream()
                .filter(s -> !s.isEmpty())
                .toList(); //until java 17 we needed to write it .collect(Collectors.toList())

        System.out.println();
        System.out.println("Original list:");
        System.out.println(fruits);
        System.out.println("List with removed empty strings:");
        System.out.println(fruitsWithRemovedEmptyStrings);

    }
}
