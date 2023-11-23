package teacher.lesson_15.lessoncode;

import java.util.Arrays;
import java.util.List;

public class Quiz_20 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7, 9);
        double sum = numbers.stream()
                .filter(n -> n % 2 == 0) //[2, 4, 6, 8, 10]
                .mapToInt(n -> n * n) // Convert to IntStream to use average() method [4, 16, 36, 64, 100]
                .distinct()
                .skip(2) // [36, 64, 100]
                .limit(3) // [36, 64, 100]
                .average()// (36 + 64 + 100)/3 = 200/3 ~ 66.6666
                .orElse(0.0);
        System.out.println(sum);

    }
}
