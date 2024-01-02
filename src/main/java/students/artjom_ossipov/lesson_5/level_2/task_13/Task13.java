package students.artjom_ossipov.lesson_5.level_2.task_13;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numbers = new int[3];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int r_number = r.nextInt(1000);
            numbers[i] = r_number;
            System.out.println("Случайное число = " + r_number); // для проверки, какие числа складывает
            sum += numbers[i];
        }
        System.out.println( "Сумма случайных чисел = " + sum);
    }
}
