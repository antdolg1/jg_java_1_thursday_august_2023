package teacher.lesson_11.lessoncode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Alice");
        names.add("Alice");
        names.add("Bob");
        names.add("Susan");
        names.add("Guntar");
        names.add("Wolf");
        names.add("Eric");
        names.add("Eric");
        names.add("Eric");

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        names.set(1, "Eva");

        names.remove(2);

        int size = names.size();
        System.out.println("Names list size: " + size);

        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> numbers = new LinkedList<>();
        numbers.add(32);
        numbers.add(2);
        numbers.add(234);
        numbers.add(1212222);
        numbers.add(988);
        numbers.add(7);
        numbers.add(76);

        System.out.println("Numbers content: " + numbers);

        Collections.sort(numbers);
        System.out.println("Numbers content after sorting: " + numbers);

        Collections.sort(names);
        System.out.println("Names content after sorting: " + names);

    }
}
