package teacher.lesson_14.lessoncode.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        numbers.forEach(number -> System.out.print(number + " "));

        System.out.println();

        numbers.forEach(System.out::print);

    }
}
