package students.anastassia_iljina.lesson_5.homework.level_2;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Число равно " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("Число изменилось на " + numbers[i]);
        }
    }
}
