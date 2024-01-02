package students.artjom_ossipov.lesson_5.level_2.task_15;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] numbers = new int[3];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int r_number = r.nextInt(1000);
            numbers[i] = r_number;
            System.out.println("Случайное число = " + numbers[i]); // для проверки, какие числа складывает
            sum += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++){
            numbers[i] += 2;
            System.out.println("Измененное случайное число = " + numbers[i]);
        }
    }
}
