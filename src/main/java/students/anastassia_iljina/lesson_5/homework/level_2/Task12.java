package students.anastassia_iljina.lesson_5.homework.level_2;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(150);
            System.out.println("Значение числа " + numbers[i]);
        }
    }
}
