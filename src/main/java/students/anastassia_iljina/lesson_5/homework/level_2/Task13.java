package students.anastassia_iljina.lesson_5.homework.level_2;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(500);
            System.out.println("Число " + numbers[i]);
            sum = sum + numbers[i];
        }

        System.out.println("Сумма всех чисел равна " + sum);
    }
}
